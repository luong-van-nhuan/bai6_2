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
}
