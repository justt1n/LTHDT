package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		Diem A = new Diem(3, 4);
		A.xuat();
		Diem B = new Diem();
		B.nhap();
		B.xuat();
		Diem C = new Diem(0-B.hoanhDo(),0-B.tungDo());
		C.xuat();
		System.out.println("Khoang cach tu B den tam O: " + B.khoangCach());
		System.out.println("Khoang cach tu A den B: " + A.khoangCach(B));
	}

}
