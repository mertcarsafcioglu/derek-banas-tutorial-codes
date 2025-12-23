import java.io.*;

public class JavaLesson33{

	static String filePath,parentDirectory;

	static File randomDir, randomFile,randomFile2;





	public static void main(String[] args) {
		Customer[] customers = getCustomers();
		
		DataOutputStream custOutput = createFile("/Users/mcars/OneDrive/Belgeler/Random/customer.dat");
		
		for(Customer person: customers) {
			createCustomers(person, custOutput);
		}
		
		try {
			custOutput.close();
		} catch (IOException e) {
			System.out.println("I/O Error");
			
			System.exit(0);
		}
		
		getFileInfo();
		
	} //END OF main
	


	private static class Customer{
		public String custName;
		public int custAge;
		public double custDebt;
		public boolean oweMoney;
		public char custSex;
		
		
		
		
		public Customer(String custName,int custAge, double custDebt, boolean oweMoney, char custSex) {
			this.custName = custName;
			this.custAge = custAge;
			this.custDebt = custDebt;
			this.oweMoney = oweMoney;
			this.custSex = custSex;
			
			
		}
		
	
		
	} // END OF CUSTOMER CLASS
	
	private static Customer[] getCustomers() {
		Customer[] customers = new Customer[5];
		
		customers[0] = new Customer("John Smith",21, 12.5, false, 'M');
		customers[1] = new Customer("Sally Saul",23, 20.4, false, 'F');
		customers[2] = new Customer("Paul Sullivan",28, 17.8, false, 'M' );
		customers[3] = new Customer("Tom Cruise",35, 32.9, false, 'M');
		customers[4] = new Customer("Mark Twain",47, 27.1, false, 'M');

		
		return customers;
		
		
	}
	private static DataOutputStream createFile(String fileName) {
		try {
			File listOfNames = new File(fileName);
			
			DataOutputStream infoToWrite = new DataOutputStream(
							new BufferedOutputStream(
									new FileOutputStream(listOfNames)));
			
			return infoToWrite;
		} catch (IOException e) {
			System.out.println("I/O Error");
			
			System.exit(0);
		}
		return null;
	} //END OF createFile
	
	
	private static void createCustomers(Customer customer, DataOutputStream custOutput) {
			try {
				custOutput.writeUTF(customer.custName);	
				
				custOutput.writeInt(customer.custAge);
				
				custOutput.writeDouble(customer.custDebt);
				
				custOutput.writeBoolean(customer.oweMoney);
				
				custOutput.writeChar(customer.custSex);
			
				
			} catch (Exception e) {
				System.out.println("I/O Error");
				
				System.exit(0);
				
			}

		
	} //END OF createCustomers
	private static void getFileInfo() {
		System.out.println("Info Written to File");
		
		File listOfNames = new File("/Users/mcars/OneDrive/Belgeler/Random/customer.dat");
		
		boolean eof = false;
		try {
			DataInputStream getInfo = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(listOfNames)));
			
			
			while(!eof) {
				String custName = getInfo.readUTF();
				int custAge = getInfo.readInt();
				double custDebt = getInfo.readDouble();
				boolean oweMoney = getInfo.readBoolean();
				char custSex = getInfo.readChar();
				
				System.out.println(custName);
				System.out.println(custAge);
				System.out.println(custDebt);
				System.out.println(oweMoney);
				System.out.println(custSex);

				
			}
		} catch (EOFException e) {
			eof = true;
		}
		catch(FileNotFoundException e) {
			System.out.println("No File");
			
			System.exit(0);
		}
		catch(IOException e){
			System.out.println("I/O Error");
			
			System.exit(0);
		}
	}
} //END OF JavaLesson32 Class
