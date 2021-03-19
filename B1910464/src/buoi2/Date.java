package buoi2;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	
	public Date()
	{
		ngay  = 0;
		thang = 0;
		nam = 0;
	}
	
	public Date(int dd, int mm, int yy){
		ngay  = dd;
		thang = mm;
		nam  = yy;
	}
	
	public void hienThi(){
		System.out.println(ngay + "/" + thang + "/" +nam);
	}
	
	public boolean check(){
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		boolean c = false;
		if(nam % 4 ==0)	{
			if(nam % 100 == 0){
				if(nam % 400 == 0){
					max[2] = 29;
				}
			}else{
				max[2] = 29;
			}
		}
		if(nam > 0)
			if(thang > 0 && thang <= 12)
				if(ngay > 0 && ngay <= max[thang])
					c = true;
		return c;
	}
	
	public void nhap(){
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ngay:");
			ngay = sc.nextInt();
			System.out.println("Nhap thang:");
			thang = sc.nextInt();
			System.out.println("Nhap nam:");
			nam = sc.nextInt();
		}while(!check());
	}
	
	public Date ngayHomSau()
	{
		Date A = new Date(ngay, thang, nam);
		A.ngay += 1;
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(A.nam % 4 ==0)	{
			if(A.nam % 100 == 0){
				if(A.nam % 400 == 0){
					max[2] = 29;
				}
			}else{
				max[2] = 29;
			}
		}
		if(A.ngay > max[A.thang])
		{
			A.ngay -= max[A.thang];
			A.thang++;
			if(A.thang > 12)
				A.nam++;
		}
		return A;
	}
	
	public Date congNgay(int n){
		Date A = new Date(ngay, thang, nam);
		A.ngay += n;
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(A.nam % 4 ==0)	{
			if(A.nam % 100 == 0){
				if(A.nam % 400 == 0){
					max[2] = 29;
				}
			}else{
				max[2] = 29;
			}
		}
		if(A.ngay > max[A.thang])
		{
			A.ngay -= max[A.thang];
			A.thang++;
			if(A.thang > 12)
				A.nam++;
		}
		return A;
	}
}
