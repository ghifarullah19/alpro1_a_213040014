package pertemuan14;

public class Mahasiswa {
	
	String sNama;
	String sNRP;
	String sKelas;
	double dIPK;
	
	public void inputData(String a, String b, String c, double d) {
		sNama = a;
		sNRP = b;
		sKelas = c;
		dIPK = d;
	}
	
	public String tampilNama() {
		return sNama;
	}
	
	public String tampilNRP() {
		return sNRP;
	}
	
	public String tampilKelas() {
		return sKelas;
	}
	
	public double tampilIPK() {
		return dIPK;
	}

	/*
	 * Generate get dan set method
	 * 
	public String getsNama() {
		return sNama;
	}

	public void setsNama(String sNama) {
		this.sNama = sNama;
	}

	public String getsNRP() {
		return sNRP;
	}

	public void setsNRP(String sNRP) {
		this.sNRP = sNRP;
	}

	public String getsKelas() {
		return sKelas;
	}

	public void setsKelas(String sKelas) {
		this.sKelas = sKelas;
	}

	public double getdIPK() {
		return dIPK;
	}

	public void setdIPK(double dIPK) {
		this.dIPK = dIPK;
	}
	*/
}
