import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter a byte value ");
//		byte b1=scanner.nextByte();
//		
//		System.out.println("Enter a short value");
//		short s1=scanner.nextShort();
//		
		System.out.println("Enter a int value ");
		int i1=scanner.nextInt();
//		
//		System.out.println("Enter a boolean value");
//		boolean bool=scanner.nextBoolean();
//		
//		System.out.println(b1+"|"+ s1 +"|"+i1+"|"+bool);
		
		scanner.nextLine();
		
		System.out.println("Enter your name ");
		String str = scanner.nextLine();
		System.out.println(str);
		
		scanner.close();
	}
}
