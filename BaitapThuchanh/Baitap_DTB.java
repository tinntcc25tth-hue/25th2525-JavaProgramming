import java.util.Scanner;

public class Baitap_DTB {

    public static void main(String[] args) {

        // Tạo đối tượng Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        double diemTB = scanner.nextDouble();

        // Xuất dữ liệu ra màn hình
        System.out.println("\n--- THÔNG TIN SINH VIÊN ---");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTB);

        scanner.close();
    }
}