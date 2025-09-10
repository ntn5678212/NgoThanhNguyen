import java.util.Scanner;
public class baitaptonghopnew {
    static Scanner sc = new Scanner(System.in);
    static int[] m;
    static int n;

    static void nhap() {
        System.out.print("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        m = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            m[i] = sc.nextInt();
        }
    }

    static void xuat() {
        System.out.print("Cac phan tu trong mang la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
    }

    static void tim(int x) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (m[i] == x) {
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Khong tim thay phan tu " + x + " trong mang");
        } else {
            System.out.println("Tim thay phan tu " + x + " trong mang " + dem + " lan");
        }
    }

    static void xoa(int x) {
        for (int i = 0; i < n; i++) {
            if (m[i] == x) {
                for (int j = i; j < n - 1; j++) {
                    m[j] = m[j + 1];
                }
                n--;
                i--;
            }
        }
        System.out.println("Mang sau khi xoa phan tu " + x + " la: ");
        xuat();
    }

    static void sapxep() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (m[i] > m[j]) {
                    int temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
    }

    static void menu(int chon) {
        switch (chon) {
            case 1:
                System.out.print("Nhap phan tu can tim: ");
                int x = sc.nextInt();
                tim(x);
                break;
            case 2:
                System.out.print("Nhap phan tu can xoa: ");
                int y = sc.nextInt();
                xoa(y);
                break;
            case 3:
                sapxep();
                System.out.println("Mang da duoc sap xep tang dan");
                xuat();
                break;
            case 4:
                System.out.println("Thoat chuong trinh");
                break;
            default:
                System.out.println("Lua chon khong hop le, vui long chon lai");
        }
    }

    public static void main(String[] args) {
        nhap();
        xuat();
        char c = 'y';
        while (c == 'y' || c == 'Y') {
            System.out.println("=== MENU ===");
           
            System.out.println("1. Tim phan tu trong mang");
            System.out.println("2. Xoa phan tu trong mang");
            System.out.println("3. Sap xep mang tang dan");
            System.out.println("4. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban: ");
            int chon = sc.nextInt();
            menu(chon);
            if (chon == 4) {
                break;
            }
            System.out.print("Ban co muon tiep tuc khong (y/n): ");
            c = sc.next().charAt(0);
        }
    }
}
