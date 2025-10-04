public class Test {
    public static void main(String[] args) {
        Sach s1 = new Sach("S001", "Lap trinh huong doi tuong", "Vo Van A", 2023, 10);
        Sach s2 = new Sach("S002","Co so du lieu", "Nguyen Hoang B", 2022, 5);

        s1.hienThiThongTin();
        s2.hienThiThongTin();
    }
}
