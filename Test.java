//Test.java
public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("S001", "Lap Trinh Huong Doi Tuong", "Le Van N", 2023, 100);
        //thông tin sách 1 tạo bằng constructor đầy đủ
        System.out.println("Thong tin sach 1: ");
        sach1.hienThiThongTin();
        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Cau Truc Du Lieu Giai Thuat");
        sach2.setTacGia("Hoang Thi My Le");
        sach2.setNamXuatBan(2022);
        sach2.setSoLuong(75);
        //thông tin sách 2 tạo bằng constructor mặc định và setters 
        System.out.println("\nThong tin sach 2: ");
        sach2.hienThiThongTin();
    }
}