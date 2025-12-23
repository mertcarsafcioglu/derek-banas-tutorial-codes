
public class JavaLessonThree {

	public static void main(String[] args) {
		
		int randomNumber = (int) (Math.random() * 50);
		if(randomNumber<25) {
			System.out.println("The random number is less than 25");
		}
		else if(randomNumber<40) {
			System.out.println("The random number is less than 25");
		}
		
		else if(randomNumber==18) {
			System.out.println("The random number is less than 25");	
		}
				
		else if(randomNumber!=35) {
			System.out.println("The random number is less than 25");	
		}
		else {
			System.out.println("Worked wrongly");
		}
		System.out.println("The random number is " +randomNumber);
		
		if(!(false)) {
			System.out.println("I turned false to true");
		}
		if(false & true) {
			System.out.println("false & true = false");
		}
		if(true & true) {
			System.out.println("true & true = true");
		}
		if(false | true) {
			System.out.println("false | true = true");
		}
		if(true | true) {
			System.out.println("true | true = true");
		}
		
		
		//Ternary operation
		int valueOne =4;
		int valueTwo =2;
		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
		System.out.println("Biggest value between values:"+biggestValue);
		
		char theGrade = 'b';
		switch (theGrade) {
		case 'A':
			System.out.println("Great job");
			break;
		case 'b':
		case 'B': 
			System.out.println("Good job");
			break;
		case 'C': 
			System.out.println("Ok");
			break;
		case 'D': 
			System.out.println("Bad");
			break;
		default:
			System.out.println("You failed");
			break;
		}
		
	}

}
