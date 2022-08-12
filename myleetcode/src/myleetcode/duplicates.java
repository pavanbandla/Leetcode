package myleetcode;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicates {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];	
	  
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
System.out.println(duplicates(arr));
	}
	
	
	public static boolean duplicates(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		for (int i = 0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				return true;
			}
			else {
				set.add(arr[i]);
			}
		}
		
		return false;
	}

	
	
}
