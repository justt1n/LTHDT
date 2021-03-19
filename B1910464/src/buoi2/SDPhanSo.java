package buoi2;

import java.util.Scanner;

public class SDPhanSo {
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3,4);
		PhanSo b = new PhanSo(4,9);
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		System.out.println("Nhap phan so x:"); 
		x.nhap();
		System.out.println("Nhap phan so y:");
		y.nhap();
		PhanSo xdao = x.giaTriNghichDao();
		System.out.print("Gia tri ngich dao cua x: ");
		xdao.hienThi();
		PhanSo k = x.cong(y);
		k.hienThi();
		
		int n;
		System.out.println("Nhap N:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		PhanSo arrPS[] = new PhanSo[n];
		
		for(int i = 0; i < n; i++)
			arrPS[i].nhap();
		for(int i = 0; i < n; i++)
			System.out.print(arrPS[i] + ", ");
		System.out.println();
		for(int i = 0; i < n; i++)
			for(int j = 1; j < n; j++){
				if(arrPS[i].giaTri() > arrPS[j].giaTri()){
					PhanSo tmp = arrPS[i];
					arrPS[i] = arrPS[j];
					arrPS[j] = tmp;
				}
			}
		for(int i = 0; i < n; i++)
			System.out.print(arrPS[i] + ", ");
	}

}
