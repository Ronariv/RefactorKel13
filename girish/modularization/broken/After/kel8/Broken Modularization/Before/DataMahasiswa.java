public class DataMahasiswa {
	private String NIM;
	private String Email;
  private String NomorTelepon;

	
	public DataMahasiswa(String nIM, String email, String nomorTelepon) {
		NIM = nIM;
		Email = email;
		NomorTelepon = nomorTelepon;
	}
	
	public String getNIM() {
		return NIM;
	}
	public void setNIM(String nIM) {
		NIM = nIM;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNomorTelepon() {
		return NomorTelepon;
	}
	public void setNomorTelepon(String nomorTelepon) {
		NomorTelepon = nomorTelepon;
	}

	
	//...
}