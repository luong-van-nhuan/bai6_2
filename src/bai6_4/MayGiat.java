package bai6_4;

public class MayGiat extends Electronic {
	private double dungTich;
	private String loai;

	public MayGiat(double congXuat, double dienAp, double dungTich, String loai) {
		super(congXuat, dienAp);
		this.dungTich = dungTich;
		this.loai = loai;
	}

	public double getDungTich() {
		return dungTich;
	}

	public void setDungTich(double dungTich) {
		this.dungTich = dungTich;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}
	public void xuat() {
		System.out.println("Thông tin máy giặt a");
		super.xuat();
		System.out.println("Dung tích: " + dungTich);
		System.out.println("Loại: " + loai);
	}
}
