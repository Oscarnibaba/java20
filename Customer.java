package java002;

public class Customer {
String name,address,telephone;
String getName()
{return name;
}
void setName(String name) {
	this.name=name;
}
String getAddress()
{return address;
}
void setAddress(String address) {
	this.address=address;
}
String getTelephone() {
	return telephone;
}void setTelephone(String telephone) {
	this.telephone=telephone;
}
public static void main(String[]args) {
	Customer customer1=new Customer();
	customer1.setName("zhang feng");
	customer1.setAddress("#130 ss");
	customer1.setTelephone("0222324");
	System.out.print("the first customer name:");
	System.out.println(customer1.getName());
	System.out.print("the first customer address:");
	System.out.println(customer1.getAddress());
	System.out.print("the first customer telephone:");
	System.out.println(customer1.getTelephone());
	
	
}
}
