import java.awt.Dimension;
import java.lang.Math.*;


public class JavaLesson35 {
	private static void printSomething() {
		
	}
	
	
	
	public static void main(String[] args) {
		int number = 12;
		String anotherNum = Integer.toString(number);
		System.out.println(anotherNum.getClass().getName());
		int number2 = Integer.parseInt(anotherNum);
		System.out.println(((Object) number2).getClass().getName());
		
		Dimension dim = new Dimension();
		
		double pi = 3.14159;
		
		
		//long randLong = JavaLesson35.round(pi);
		
		long randLong =  Math.round(pi);
		System.out.println(randLong);
		
		double sumNum = JavaLessonFive.addThem(1, 2);
		
		getStuff(1,1.2);
		
	}
	
	public static void getStuff(int number1, double number2) {
		int[][] intArray = new int[10][10];
		
		String howMany = "";
		System.out.println(howMany);
		
		System.out.println(intArray.length);
		System.out.println(howMany.length());
		
		int xInt = 1, yInt =1 ;
		xInt = yInt++;
		
		System.out.println("xInt: " + xInt);

		int day = 1;
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;

		default:
			break;
		}
		
		
	}

}
