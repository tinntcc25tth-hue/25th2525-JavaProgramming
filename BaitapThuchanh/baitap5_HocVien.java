import java.util.Scanner;

public class baitap5_HocVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HocVien hv = new HocVien();

        // Nhập mã học viên
        System.out.print("Nhap ma hoc vien: ");
        hv.setMaHocVien(sc.nextLine());

        // Nhập họ tên
        System.out.print("Nhap ho ten: ");
        hv.setHoTen(sc.nextLine());

        // Nhập năm sinh
        System.out.print("Nhap nam sinh: ");
        hv.setNamSinh(sc.nextInt());
        sc.nextLine();

        // Nhập giới tính
        System.out.print("Nhap gioi tinh: ");
        hv.setGioiTinh(sc.nextLine());

        // Xuất thông tin
        System.out.println("\n--- THONG TIN HOC VIEN ---");
        System.out.println("Ma hoc vien: " + hv.getMaHocVien());
        System.out.println("Ho ten: " + hv.getHoTen());
        System.out.println("Nam sinh: " + hv.getNamSinh());
        System.out.println("Gioi tinh: " + hv.getGioiTinh());

        sc.close();
    }
}