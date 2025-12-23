import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class JavaLessonSix {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
//		System.out.println("How old are you?");
//		int age = checkValidAge();
//		if(age != 0) {
//			System.out.println("You are " + age + " years old.");
//		}
//		
//		getAFile("./somestuff.txt");
		
		try {
			getAFile("./somestuff.txt");
		} catch (IOException e) {
			System.out.println("An IO Error Occurreds");
		}
		
		
		
//		divideByZero(2);
		
	}
	
//	public static void divideByZero(int a) {
//		try {
//			System.out.println(a/0);
//		} catch (ArithmeticException e) {
//			System.out.println("You cant do that");
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
//		}
//	}
	
//	public static int checkValidAge() {
//		try {
//			return userInput.nextInt();
//		} catch (Exception e) {
//			userInput.next();
//			System.out.print("That isnt a whole number");
//			return 0;
//		
//		}
//	}
//	public static void getAFile(String fileName) {
//		try {
//			FileInputStream file = new FileInputStream(fileName);
//		} catch (FileNotFoundException e) {
//			System.out.println("Sorry cant find file");
//		} catch (IOException e) {
//			System.out.println("Unknown IO Error");
//		} catch (Exception e) {
//			System.out.println("Some error occurred");
//		} finally {
//			System.out.println("");
//		}
//	}
	public static void getAFile(String fileName) throws IOException, FileNotFoundException {
		
			FileInputStream file = new FileInputStream(fileName);
	
	}
	
}
