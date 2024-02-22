package bai6_2;

import java.util.Scanner;

public class LaserPrinter extends Printer {
	private String doPhanGiai;

	public LaserPrinter(Double trongLuong, String hangSX, int namSX, int tocDo, String doPhanGiai) {
		super(trongLuong, hangSX, namSX, tocDo);
		this.doPhanGiai = doPhanGiai;
	}

	public LaserPrinter() {
	}

	public LaserPrinter(Double trongLuong, String hangSX, int namSX, int tocDo) {
		super(trongLuong, hangSX, namSX, tocDo);
	}

	public String getDoPhanGiai() {
		return doPhanGiai;
	}

	public void setDoPhanGiai(String doPhanGiai) {
		this.doPhanGiai = doPhanGiai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin máy in Laser");
		System.out.println("Nhập trọng lượng: ");
		trongLuong = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhập Hãng sản xuất: ");
		hangSX = sc.nextLine();
		System.out.println("Nhập năm sản xuất: ");
		namSX = sc.nextInt();
		System.out.println("Nhập tốc độ : ");
		tocDo = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập độ phân giải: ");
		doPhanGiai = sc.nextLine();
	}
	public void xuat() {
		System.out.println("Thông tin máy in Laser");
		System.out.println("Trọng lượng: " + trongLuong);
		System.out.println("Hãng sản xuất: " + hangSX);
		System.out.println("Năm sản xuất: " + namSX);
		System.out.println("Tốc độ: " + tocDo);
		System.out.println("Độ phân giải: " + doPhanGiai);
	}
}
