import java.util.Scanner;
public class multiplication{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number: ");
int multi = input.nextInt();

System.out.println("The multiplication tabe of " + multi);

for (int count = 1; count <= 12; count++) 
{
	//int tiple= multi * count;

    System.out.println(multi + "X" + count + "=" + (multi * count));
} 



















}

}