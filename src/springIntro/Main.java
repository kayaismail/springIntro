package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//IOC yapilandirmasi
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*CustomerManager manager=new CustomerManager(new CustomerDal());
		CustomerManager manager=new CustomerManager(new MysqlCustomerDal());*/
		//CustomerManager manager=new CustomerManager(context.getBean("database",ICustomerDal.class));
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		customerService.add();
	}

}
