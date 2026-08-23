public class HocVien {
    private String maHocVien;
    private String hoTen;
    private int namSinh;
    private String gioiTinh;

    // Constructor không tham số
    public HocVien() {
    }

    // Constructor có tham số
    public HocVien(String maHocVien, String hoTen, int namSinh, String gioiTinh) {
        this.maHocVien = maHocVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    // Getter và Setter cho maHocVien
    public String getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    // Getter và Setter cho hoTen
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    // Getter và Setter cho namSinh
    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    // Getter và Setter cho gioiTinh
    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}