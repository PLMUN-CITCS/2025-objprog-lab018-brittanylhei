import java.util.Scanner;

	public class EvenOddChecker {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int userInt = input.nextInt();

	if (userInt % 2 == 0){
		System.out.println(userInt + " is an Even number.");
	}
	else {
		System.out.println(userInt + " is an Odd Number.");
	}
	

}



}