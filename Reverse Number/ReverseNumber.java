
import java.util.Scanner;
class ReverseNumber{

	// this method is GetReminder (Works like Modules Operator)
	static int ModulesControler (int Number , int Divider){

		return (Number-Divider * (Number/Divider));
		
	}


	public static void main(String [] args){
		int Input = 0;
		int Number =0;

		Scanner s = new Scanner (System.in);
		System.out.println("Enter Input Number For Reverse : ");
		Input = s.nextInt();

		
		
		while (Input>0){

		Number = Number * 10;
		Number = Number + ModulesControler(Input,10);
		Input = Input / 10;

		}
		
		System.out.println("---------- Number Reversed ---------------------");
		System.out.println(Number);
		
		

	}




}