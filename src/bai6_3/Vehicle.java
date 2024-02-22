package bai6_3;

import java.util.Scanner;

public class Vehicle {
	protected String nhanHieu;
	protected int namsx;
	protected String hang;
	
	public Vehicle(String nhanHieu, int namsx, String hang) {
		this.nhanHieu = nhanHieu;
		this.namsx = namsx;
		this.hang = hang;
	}
	public Vehicle() {
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập nhãn hiệu: ");
		nhanHieu = sc.nextLine();
		System.out.println("nhập năm sản xuất: ");
		namsx = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập hãng: ");
		hang = sc.nextLine();
	}
	public void xuat() {
		System.out.println("Nhãn hiệu: " + nhanHieu);
		System.out.println("Năm sản xuất: " + namsx);
		System.out.println("Hãng: " + hang);
	}
}
