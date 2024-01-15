import java.util.Scanner;
public class FactorialDemo{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int number;
int fact = 1;

System.out.print("Enter a positive number: ");
number = input.nextInt();

for(int i = 1; i <= number ;i++ ){

fact*=i;

}

System.out.println("the factorial of "+ number + " is: " + fact );
}

} 