
public class HelloWorld {
	
	
	static String randomString ="String to print";
	static final double PINUM = 3.14;
	public static void main(String[] args) {
		System.out.println(PINUM);
	int integerOne = 33;
	int integerTwo = integerOne + 1;
	System.out.println(integerTwo);
	
	byte bigByte = 127;
	short bigShort=32767;
	int bigInt = 2100000000;
	long bigLong = 9220000000000000000L;
	float bigfloat = 3.14F;
	double bigDouble =3.143284234812473243;
	
	System.out.println(bigByte);
	System.out.println(bigDouble);
	System.out.println(Float.MAX_VALUE);
	System.out.println(Double.MAX_VALUE);
	
	boolean trueOrFalse=true;
	
	char randomChar=65;
	char anotherChar='A';
	char escapedChar='\n';
	
	System.out.println(randomChar);
	System.out.println(anotherChar);
	String randomString = "I'm a random string";
	String anotherString = "stuff";
	String andAnotherString = randomString + " " + anotherString;
	System.out.println(andAnotherString);
	
	String byteString = Byte.toString(bigByte);
	String shortString = Short.toString(bigByte);
	String intString = Integer.toString(bigInt);
	String longString = Byte.toString(bigByte);
	String floatString = Byte.toString(bigByte);
	String doubleString = Byte.toString(bigByte);
	String booleanString = Byte.toString(bigByte);
	
	double aDoubleValue = 300000000000000.1446414651;
	int doubleToInt = (int) aDoubleValue;
	System.out.println(doubleToInt);
	
	
	int stringToInt = Integer.parseInt(intString);
	System.out.println(stringToInt);
	}
}
 