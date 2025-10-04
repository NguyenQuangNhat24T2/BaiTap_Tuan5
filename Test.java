package BaiTap_Tuan5;
public class Test 
{
    public static void main(String[] args) 
    {
        Sach s1 = new Sach("B001", "Java Co ban", "Nguyen Van A", 2022, 10);
        Sach s2 = new Sach("B002", "Cau truc du lieu", "Tran Thi B", 2021, 5);
        s1.hienThiThongTin();
        s2.hienThiThongTin();
    }
}