import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nguyenanhtu.customer.dao.CustomerDAO;
import com.nguyenanhtu.customer.model.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("Spring-Module.xml");
		
		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
		Customer customer = new Customer(1, "nguyenanhtu", 26);
		customerDAO.insert(customer);
		
		Customer customer1 = customerDAO.findByCustomerId(1);
		System.out.println(customer1.getAge());
		
	}
}

