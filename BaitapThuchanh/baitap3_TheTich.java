import java.util.Scanner;

public class baitap3_TheTich {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập cạnh
        System.out.print("Nhap canh khoi lap phuong: ");
        double a = sc.nextDouble();

        // Tính thể tích
        double theTich = a * a * a;

        // Xuất kết quả
        System.out.println("The tich khoi lap phuong = " + theTich);

        sc.close();
    }
}