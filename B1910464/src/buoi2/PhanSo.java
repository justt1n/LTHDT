package buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tuSo, mauSo;
	
	public PhanSo(){
		tuSo = 0;
		mauSo = 1;
	}
	
	public PhanSo(int ts, int ms){
		tuSo = ts;
		mauSo = ms;
	}
	
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu so: ");
		tuSo = sc.nextInt();
		do{
			System.out.println("Nhap mau so: ");
			mauSo = sc.nextInt();
		}while (mauSo == 0);
	}
	
	public void hienThi(){
		if(mauSo == 1)
			System.out.println(tuSo);
		else
			System.out.println(tuSo + "/" + mauSo);
	}
	
	public void nghichDao(){
		if(tuSo == 0)
			System.out.println("KHONG THE NGHICH DAO");
		int tmp = tuSo;
		tuSo = mauSo;
		mauSo = tmp;
	}
	
	public PhanSo giaTriNghichDao(){
		PhanSo a = new PhanSo(tuSo, mauSo);
		if(a.tuSo == 0)
			System.out.println("KHONG THE NGHICH DAO");
		int tmp = a.tuSo;
		a.tuSo = a.mauSo;
		a.mauSo = tmp;
		return a;
	}
	
	public double giaTri(){
		return tuSo/mauSo;
	}
	
	public boolean lonHon(PhanSo a){
		return giaTri() > a.giaTri();
	}
	
	public int gcd(int a, int b) {
	    if (b == 0) 
	    	return a;
	    return gcd(b, a % b);
	}
	
	public void chuanHoa(){
		int k = gcd(tuSo, mauSo);
		tuSo /= k;
		mauSo /= k;
	}
	
	public PhanSo cong(PhanSo a){
		PhanSo c = new PhanSo();
		c.tuSo = tuSo*a.mauSo + a.tuSo*mauSo;
		c.mauSo = mauSo*a.mauSo;
		c.chuanHoa();
		return c;
	}
	
	public PhanSo tru(PhanSo a){
		PhanSo c = new PhanSo();
		c.tuSo = tuSo*a.mauSo - a.tuSo*mauSo;
		c.mauSo = mauSo*a.mauSo;
		c.chuanHoa();
		return c;
	}
	
	public PhanSo nhan(PhanSo a){
		PhanSo c = new PhanSo();
		c.tuSo = tuSo*a.tuSo;
		c.mauSo = mauSo*a.mauSo;
		c.chuanHoa();
		return c;
	}
	
	public PhanSo chia(PhanSo a){
		PhanSo c = new PhanSo();
		c.tuSo = tuSo*a.mauSo;
		c.mauSo = mauSo*a.tuSo;
		c.chuanHoa();
		return c;
	}
}
