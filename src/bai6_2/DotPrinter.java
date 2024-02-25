package bai6_2;

import java.util.Scanner;

public class DotPrinter extends Printer {
	private int matDoKim;

	public DotPrinter(Double trongLuong, String hangSX, int namSX, int tocDo, int matDoKim) {
		super(trongLuong, hangSX, namSX, tocDo);
		this.matDoKim = matDoKim;
	}

	public DotPrinter() {
	}

	public DotPrinter(Double trongLuong, String hangSX, int namSX, int tocDo) {
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
		System.out.println("Nhập thông tin máy in kim");
		super.nhap();
		System.out.println("Nhập mật độ kim: ");
		matDoKim = sc.nextInt();
		sc.nextLine();
	}

	public void xuat() {
		System.out.println("Thông tin máy in kim");
		super.xuat();
		System.out.println("Mật độ kim: " + matDoKim);
	}
}
