import java.util.Scanner;

public class Baitap2_ChuviDT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double a = sc.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double b = sc.nextDouble();

        // Tính chu vi
        double chuVi = (a + b) * 2;

        // Tính diện tích
        double dienTich = a * b;

        // Tìm cạnh nhỏ
        double canhNho = Math.min(a, b);

        // Xuất kết quả
        System.out.println("\n--- KET QUA ---");
        System.out.println("Chu vi = " + chuVi);
        System.out.println("Dien tich = " + dienTich);
        System.out.println("Canh nho = " + canhNho);

        sc.close();
    }
}