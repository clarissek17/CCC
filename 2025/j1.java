import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); // place in line
		int c = in.nextInt(); // number of Cars
		int p = in.nextInt(); // people per car
		
		if((c * p) >= n){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}
		
		
	}
}
