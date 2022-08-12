package myleetcode;
import java.util.Scanner;
public class stock_max_profit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of days");
		int n = sc.nextInt();
		int[] prices = new int[n];
		System.out.println("Enter profits of each day");
		for(int i = 0; i<n; i++) {
			prices[i] = sc.nextInt(); 
		}

		System.out.println(max_profit(prices));
		
	}
		public static int max_profit(int[] prices) {
			int min_value = Integer.MAX_VALUE;
			int profit = 0;
			
			for(int i = 0; i< prices.length;i++) {
				if(prices[i] < min_value) {
				min_value = prices[i]; 
			}
			else if (prices[i]- min_value > profit) {
				profit = prices[i]- min_value;
			}
			
		}
			return profit;
}
		}
