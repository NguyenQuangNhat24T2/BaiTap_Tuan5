// Lớp Sach.java
public class Sach {
    //1. Thuộc tính (Attributes)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    //2. Constructors
    //mặc định không tham số
    public Sach() {} 
    //đầy đủ tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    //3. Getter & Setter
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    //4. Phương thức hienThiThongTin()
    public void hienThiThongTin() {
        System.out.println("--- THONG TIN SACH ---");        
        System.out.println("Ma Sach: " + maSach);
        System.out.println("Tieu De: " + tieuDe);
        System.out.println("Tac Gia: " + tacGia);
        System.out.println("Nam Xuat Ban: " + namXuatBan);
        System.out.println("So Luong: " + soLuong);
    }
}