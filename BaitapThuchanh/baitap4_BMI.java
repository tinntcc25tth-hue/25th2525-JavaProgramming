import java.util.Scanner;

public class baitap4_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chiều cao
        System.out.print("Nhap chieu cao (cm): ");
        double chieuCaoCm = sc.nextDouble();

        // Nhập cân nặng
        System.out.print("Nhap can nang (kg): ");
        double canNang = sc.nextDouble();

        // Đổi chiều cao từ cm sang m
        double chieuCaoM = chieuCaoCm / 100;

        // Tính BMI
        double bmi = canNang / (chieuCaoM * chieuCaoM);

        System.out.printf("Chi so BMI = %.2f%n", bmi);

        // Phân loại
        if (bmi < 18.5) {
            System.out.println("Tinh trang: Gay");
        } else if (bmi < 23) {
            System.out.println("Tinh trang: Binh thuong");
        } else if (bmi < 25) {
            System.out.println("Tinh trang: Thua can");
        } else if (bmi < 30) {
            System.out.println("Tinh trang: Beo phi do I");
        } else if (bmi < 35) {
            System.out.println("Tinh trang: Beo phi do II");
        } else {
            System.out.println("Tinh trang: Beo phi do III");
        }

        sc.close();
    }
}