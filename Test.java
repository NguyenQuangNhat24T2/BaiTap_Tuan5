public class Test {
    public static void main(String args[]){
            Sach sach1 = new Sach("001","Java Co Ban","Nguyen Van A", 2010, 5);
            sach1.hienThiThongTin();
            Sach sach2 = new Sach();
            sach2.setMaSach("002");
            sach2.setTieuDe("Lap trinh nang cao" );
            sach2.setTacGia("tran Thi B");
            sach2.setNamXuatBan(2015);
            sach2.setSoLuong(10);
            sach2.hienThiThongTin();
    }
}

