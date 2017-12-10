package hah;
import  java.util.Scanner;

 public class youGuess{
	 public static void main(String[]args){
		 int randomNumber =(int) (Math.random()*101);
		 while(true){
			 Scanner input = new Scanner(System.in);
			 System.out.print("请输入一个1-100之间的整数：");
			 int guessNumber = input.nextInt();
			
			 
		String result= guess(randomNumber,guessNumber);
		 if("==".equals(result)){
			 break;
			 
		 }
		 }
		 
	 }
	 
	public static String guess(int randomNumber, int num){
		if(randomNumber==num){
			System.out.print("Congratulation!");
			return "==";
		}
		
		else if(randomNumber<num){
			
			System.out.println("你填入的数偏大");
			return ">";
			
		}
		else{
			System.out.println("你填入的数偏小");
			return "<";
			
		}
		
	
		
		
		
	} 
	 
	 
	 
 }
	 
	 

	 
	 
	 
