public class baitap6_DanhSach {
    public static void main(String[] args) {

        // Tạo danh sách 3 học viên
        HocVien[] DanhSach = new HocVien[3];

        DanhSach[0] = new HocVien(
                "HV001",
                "Nguyen Van An",
                2005,
                "Nam"
        );

        DanhSach[1] = new HocVien(
                "HV002",
                "Tran Thi Binh",
                2003,
                "Nu"
        );

        DanhSach[2] = new HocVien(
                "HV003",
                "Le Van Cuong",
                2004,
                "Nam"
        );

        // In danh sách học viên
        System.out.println("--- DANH SACH HOC VIEN ---");

        for (int i = 0; i < DanhSach.length; i++) {
            System.out.println("\nHoc vien thu " + (i + 1));
            System.out.println("Ma hoc vien: " + DanhSach[i].getMaHocVien());
            System.out.println("Ho ten: " + DanhSach[i].getHoTen());
            System.out.println("Nam sinh: " + DanhSach[i].getNamSinh());
            System.out.println("Gioi tinh: " + DanhSach[i].getGioiTinh());
        }

        // Tìm học viên nhiều tuổi nhất
        HocVien lonTuoiNhat = DanhSach[0];

        for (int i = 1; i < DanhSach.length; i++) {
            if (DanhSach[i].getNamSinh() < lonTuoiNhat.getNamSinh()) {
                lonTuoiNhat = DanhSach[i];
            }
        }

        // Xuất học viên nhiều tuổi nhất
        System.out.println("\n--- HOC VIEN NHIEU TUOI NHAT ---");
        System.out.println("Ma hoc vien: " + lonTuoiNhat.getMaHocVien());
        System.out.println("Ho ten: " + lonTuoiNhat.getHoTen());
        System.out.println("Nam sinh: " + lonTuoiNhat.getNamSinh());
        System.out.println("Gioi tinh: " + lonTuoiNhat.getGioiTinh());
    }
}