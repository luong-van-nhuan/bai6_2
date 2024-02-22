package bai6_2;

import java.util.Scanner;

public class Dotrrinter extends Printer{
	private int matDoKim;

	public Dotrrinter(Double trongLuong, String hangSX, int namSX, int tocDo, int matDoKim) {
		super(trongLuong, hangSX, namSX, tocDo);
		this.matDoKim = matDoKim;
	}
	public Dotrrinter() {
	}

	public Dotrrinter(Double trongLuong, String hangSX, int namSX, int tocDo) {
		super(trongLuong, hangSX, namSX, tocDo);
	}
	public int getMatDoKim() {
		return matDoKim;
	}
	public void setMatDoKim(int matDoKim) {
		this.matDoKim = matDoKim;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Thông tin máy in kim");
		System.out.println("Nhập trọng lượng: ");
		trongLuong = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhập Hãng sản xuất: ");
		hangSX = sc.nextLine();
		System.out.println("Nhập năm sản xuất: ");
		namSX = sc.nextInt();
		System.out.println("Nhập tốc độ : ");
		tocDo = sc.nextInt();
		System.out.println("Nhập mật độ kim: ");
		matDoKim = sc.nextInt();
		sc.nextLine();
	}
	public void xuat() {
		System.out.println("Thông tin máy in kim");
		System.out.println("Trọng lượng: " + trongLuong);
		System.out.println("Hãng sản xuất: " + hangSX);
		System.out.println("Năm sản xuất: " + namSX);
		System.out.println("Tốc độ: " + tocDo);
		System.out.println("Mật độ kim: " + matDoKim);
	}
}
