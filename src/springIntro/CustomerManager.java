package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	/* // arg kullandik bu constructer injection 
	public CustomerManager(ICustomerDal customerDal) { //manager icerisinde dal kullandik const. yardimi ile
		this.customerDal = customerDal;
	}*/
	//setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
	//CustomerDal customerDal=new CustomerDal(); // ioc ye gore bir class baska bir classi kullandiginda onu new lememeli
	
	customerDal.add();
	}
	
}
 