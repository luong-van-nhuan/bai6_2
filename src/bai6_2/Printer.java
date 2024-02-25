package bai6_2;

import java.util.Scanner;

public class Printer {
	protected double trongLuong;
	protected String hangSX;
	protected int namSX;
	protected int tocDo;

	public Printer(Double trongLuong, String hangSX, int namSX, int tocDo) {
		this.trongLuong = trongLuong;
		this.hangSX = hangSX;
		this.namSX = namSX;
		this.tocDo = tocDo;
	}

	public Printer() {
	}

	public double getTrongLuong() {
		return trongLuong;
	}

	public void setTrongLuong(Double trongLuong) {
		this.trongLuong = trongLuong;
	}

	public String getHangSX() {
		return hangSX;
	}

	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}

	public int getNamSX() {
		return namSX;
	}

	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}

	public int getTocDo() {
		return tocDo;
	}

	public void setTocDo(int tocDo) {
		this.tocDo = tocDo;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập trọng lượng: ");
		trongLuong = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhập Hãng sản xuất: ");
		hangSX = sc.nextLine();
		System.out.println("Nhập năm sản xuất: ");
		namSX = sc.nextInt();
		System.out.println("Nhập tốc độ : ");
		tocDo = sc.nextInt();
	}

	public void xuat() {
		System.out.println("Trọng Lượng: " + trongLuong);
		System.out.println("Hãng sản xuất: " + hangSX);
		System.out.println("Năm sản xuất: " + namSX);
		System.out.println("Tốc độ: " + tocDo + "(số trang/ phút)");
	}
}
