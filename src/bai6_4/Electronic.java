package bai6_4;

import java.util.Scanner;

public class Electronic {
	protected double congXuat;
	protected double dienAp;

	public Electronic(double congXuat, double dienAp) {
		this.congXuat = congXuat;
		this.dienAp = dienAp;
	}
	public double getCongXuat() {
		return congXuat;
	}

	public void setCongXuat(double congXuat) {
		this.congXuat = congXuat;
	}

	public double getDienAp() {
		return dienAp;
	}

	public void setDienAp(double dienAp) {
		this.dienAp = dienAp;
	}

	public void xuat() {
		System.out.println("Công xuất điện: " + congXuat);
		System.out.println("Điện áp: " + dienAp);
	}
}
