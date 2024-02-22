package bai6_3;

import java.util.Scanner;

public class MoTo extends Vehicle {
	private int phanKhoi;

	public MoTo(String nhanHieu, int namsx, String hang, int phanKhoi) {
		super(nhanHieu, namsx, hang);
		this.phanKhoi = phanKhoi;
	}
	public MoTo() {
	}
	public int getPhanKhoi() {
		return phanKhoi;
	}
	public void setPhanKhoi(int phanKhoi) {
		this.phanKhoi = phanKhoi;
	}
	public void nhap() {
		System.out.println("Nhập thông tin Moto");
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập phân khối: ");
		phanKhoi = sc.nextInt();
	}
	public void xuat() {
		System.out.println("Thông tin Moto");
		super.xuat();
		System.out.println("Phân khối: " + phanKhoi);
	}
}
