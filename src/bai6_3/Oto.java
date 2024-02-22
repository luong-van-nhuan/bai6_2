package bai6_3;

import java.util.Scanner;

public class Oto extends Vehicle{
	private int soChoNgoi;
	private int dungTich;
	public Oto(String nhaHieu, int namsx, String hang, int soChoNgoi, int dungTich) {
		super(nhaHieu, namsx, hang);
		this.soChoNgoi = soChoNgoi;
		this.dungTich = dungTich;
	}
	public Oto() {
	}
	public Oto(String nhanHieu, int namsx, String hang) {
		super(nhanHieu, namsx, hang);
	}
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public void nhap() {
		System.out.println("Nhập thông tin oto");
		super.nhap();	
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số chỗ ngồi: ");
		soChoNgoi = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập dung tích: ");
		dungTich = sc.nextInt();
		sc.nextLine();
	}
	public void xuat() {
		System.out.println("Thông tin oto");
		super.xuat();
		System.out.println("Số chỗ ngồi: " + soChoNgoi);
		System.out.println("Dung tích: " + dungTich);
	}
}
