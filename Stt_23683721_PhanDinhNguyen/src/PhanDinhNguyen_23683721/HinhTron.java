package PhanDinhNguyen_23683721;

public class HinhTron {
	private double bankinh;
	public double getBankinh() {
		return bankinh;
	}
	public void setBankinh(double bk) throws Exception {
		if (bk>0) {
			this.bankinh = bk;
		} else {
            throw new Exception("Loi!");
		}
		
	}
	private Tam t;
	public Tam getT() {
		return t;
	}
	public void setT(Tam t) throws Exception {
		if (t!=null) {
			this.t = t;
		} else {
           throw new Exception("Loi!");
		}
	
	}
	public static final double PI=3.1416;

	private double getDientich() {
		return getBankinh()*getBankinh()*PI;
	}
	public HinhTron() {}
	public HinhTron(double bk, Tam t) {
		this.bankinh = bk;
		this.t = t;
	}
	private double getChuvi() {
		return getBankinh()*2*PI;
	}
	
	@Override
	public String toString() {
		String m="";
		m+=m.format(" Dien tich :%2s, Chu vi :%2s", getDientich(),getChuvi());		
		return m;
	}
}
