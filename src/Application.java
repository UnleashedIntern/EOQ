import java.util.Scanner;


public class Application {
	public static void main(String[] args){
		EOQ_ITEM e = new EOQ_ITEM(10000,2,8,0.02,0.16);
		System.out.println("The theoratical EOQ is: " + e.getEOQ());
		System.out.println("The theoratical total cost is:" + String.format("%.2f", e.getTotalCost(e.getEOQ())));

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a new EOQ: ");
		while(sc.hasNext()){
			double temp = sc.nextDouble();
			System.out.println("The new total cost is: " + String.format("%.2f", e.getTotalCost(temp)));
			System.out.println("Please enter a new EOQ: ");
		}
	}
}
