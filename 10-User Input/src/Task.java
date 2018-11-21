import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int counter=1;
		int sum=0;
		
		while(counter<10) {
		System.out.println("Please enter your number "+counter);
		
		boolean bool = scanner.hasNextInt();
		if(bool) {
			counter++;
			int number=scanner.nextInt();
			sum=sum+number;
		}else {
			System.out.println("Invalid Number");
		
		}
		scanner.nextLine();
				
		System.out.println("Your total number"+sum);
		scanner.close();
		
		
	}
}
}