package buoi2;

import java.util.Scanner;

public class Diem {
	private int x, y;
	
	public Diem() {
		x = 0;
		y = 0;
	}
	
	public Diem(int x1, int y1){
		x = x1;
		y = y1;
	}
	
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap x: ");
		x = sc.nextInt();
		System.out.println();
		System.out.println("Nhap y: ");
		y = sc.nextInt();
	}
	
	public void xuat(){
		System.out.println("(" + x + "," + y + ")");
	}
	
	public void doiDiem(int dx, int dy){
		x += dx;
		y += dy;
	}
	
	public int hoanhDo(){
		return x;
	}
	
	public int tungDo(){
		return y;
	}
	
	public double khoangCach(){
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public double khoangCach(Diem b){
		return Math.sqrt(Math.pow(x - b.x, 2) + Math.pow(y - b.y, 2));
	}
}
