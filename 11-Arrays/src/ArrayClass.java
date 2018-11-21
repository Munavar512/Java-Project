import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {
	public static void main(String[] args) {
		
		int[] myIntArray = new int[10];
		myIntArray[0]=35;
		myIntArray[1]=45;
		
		int[] myIntArray2 = {1,20,30,40,50};
		
		System.out.println(myIntArray[2]+"|"+myIntArray2[4]);
		
		int[] myIntegers = getIntegers(5);
		System.out.println("The Average is "+getAverage(myIntegers));
		System.out.println(Arrays.toString(myIntegers));
	}
	
	
//Create an method - getIntegers
	public static int[] getIntegers(int number) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your number");
		int[] Array = new int[number];
		
		for(int i=0;i<Array.length; i++) {
			Array[i]=scanner.nextInt();
		
		}
		return Array;
			
		}
	
	//Method
	public static double getAverage(int[] array) {
		
		int sum=0;
		for(int i=0;i<array.length; i++) {
			sum=sum+array[i];
		}
		return (double)sum/array.length;
	}
}
	

