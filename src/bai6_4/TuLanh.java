package bai6_4;

public class TuLanh extends Electronic {
	private int dungTich;
	private int soNgan;

	public TuLanh(double congXuat, double dienAp, int dungTich, int soNgan) {
		super(congXuat, dienAp);
		this.dungTich = dungTich;
		this.soNgan = soNgan;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public int getSoNgan() {
		return soNgan;
	}

	public void setSoNgan(int soNgan) {
		this.soNgan = soNgan;
	}

	public void xuat() {
		System.out.println("Thông tin tủ lạnh b");
		super.xuat();
		System.out.println("Dung tích: " + dungTich);
		System.out.println("Số ngăn: " + soNgan);
	}
}
