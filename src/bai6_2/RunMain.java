package bai6_2;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		DotPrinter dotrrinter = new DotPrinter();
		LaserPrinter laserPrinter = new LaserPrinter();
		dotrrinter.nhap();
		laserPrinter.nhap();
		dotrrinter.xuat();
		laserPrinter.xuat();
	}
}
