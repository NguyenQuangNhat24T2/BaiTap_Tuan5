package BaiTap_Tuan5;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng Sách
        Sach sach1 = new Sach("B001", "Lập trình Java", "Nguyễn Văn A", 2021, 10);
        Sach sach2 = new Sach("B002", "Cơ sở dữ liệu", "Trần Thị B", 2020, 7);

        // Hiển thị thông tin sách
        System.out.println("== THÔNG TIN SÁCH ==");
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}