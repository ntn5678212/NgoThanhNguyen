import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        String ten = "Ngo Thanh Nguyen";
        System.out.println(ten);
        int tuoi = 20;
        System.out.println(tuoi);
        float chieucao = 1.7f;
        System.out.println(chieucao);
        Boolean thichLapTrinh = true;
        System.out.print("Ban co thich lap trinh khong?  ");
        if(thichLapTrinh) {
            System.out.println("toi rat thich lap trinh");
        } else {
            System.out.println("toi khong thich lap trinh ti nao");
        }
    }
}