import java.util.Scanner;
public class power{
  public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);

	int main=1;
	int base;
	int power;

	System.out.print("enter a base number: ");
	base = input.nextInt();
	System.out.print("enter a power: ");
	power = input.nextInt();

	for(int i = 1; i <= power; i++){

		main *= base;
	}
	
		
	System.out.println("the result: "+ main );





  }

}