package springIntro;

public class CustomerDal implements ICustomerDal {
	String connectionString; // metin degeri enjecsiyon
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	public void add() {
	System.out.println("connection strint :"+this.connectionString);
	System.out.println("microsoft Sql veritabanina ekle sql kodlari calistigini farzedelim");
	}
	
}
