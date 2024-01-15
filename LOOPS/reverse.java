import java.util.Scanner;
public class reverse{
  public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);


	int num;
	int reverse=0;
	int test = 0;
	

	System.out.print("Enter positive numbers: ");
	num = input.nextInt();

	for(int i=0; num>0; i--){

	reverse = num % 10;
	test = test * 10 + reverse;
	int temp /=10;
	}
 
	System.out.println("the reverse: "+ reverse);	


	//while(count <= num){
	
	//reverse= num%10;
	
	//count ++;
	
	//}

	//System.out.println("Result =  " + test);

 }
}