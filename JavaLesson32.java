import java.io.*;

public class JavaLesson32{

	static String filePath,parentDirectory;

	static File randomDir, randomFile,randomFile2;





	public static void main(String[] args) {

		Customer[] customers = getCustomers();
		
		PrintWriter custOutuput = createFile("/Users/mcars/OneDrive/Belgeler/Random/customers.txt");
	} //END OF main
	
	private static class Customer{
		public String firstName, lastName;
		public int custAge;
		
		public Customer(String firstName,String lastName,int custAge) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.custAge = custAge;
		}
		
	
		
	}
	
	private static Customer[] getCustomers() {
		Customer[] customers = new Customer[5];
		
		customers[0] = new Customer("John","Smith",21);
		customers[0] = new Customer("Sally","Saul",23);
		customers[0] = new Customer("Paul","Sullivan",28);
		customers[0] = new Customer("Tom","Cruise",35);
		customers[0] = new Customer("Mark","Twain",47);

		
		return customers;
		
		
	}
	private static PrintWriter createFile(String fileName) {
		try {
			File listOfNames = new File(fileName);
			PrintWriter infoToWrite = new PrintWriter(
					new BufferedWriter(new FileWriter(listOfNames))
					);
		} catch (IOException e) {
			System.out.println("An I/O Error Occurred");
			System.exit(0);
			
		}
		return null;
	}
	private static void createCustomers(Customer customer, PrintWriter custOutput) {
		String custInfo = customer.firstName + " " + customer.lastName;
		
		custInfo += Integer.toString(customer.custAge);
		
		custOutput.println(custInfo);
		
	}
} //END OF JavaLesson32 Class
