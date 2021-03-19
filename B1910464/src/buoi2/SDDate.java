package buoi2;

public class SDDate {

	public static void main(String[] args) {
		Date a = new Date();
		a.nhap();
		a.hienThi();
		Date b = a.ngayHomSau();
		b.hienThi();
		Date c = a.congNgay(20);
		c.hienThi();
	}

}
