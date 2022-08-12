package myleetcode;
import java.util.Iterator;
import java.util.Scanner;

public class product_of_array_except_itself {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];	
	  
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(productExceptSelf(arr));		
		}	
		}

    public static int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int n=nums.length;
        int pre=1;
        for (int i=0;i<n;i++)
        {
            ans[i]=pre;
            pre*=nums[i];
        }
        int post=1;
        for(int i=n-1;i>=0;i--)
        {
            ans[i]*=post;
            post*=nums[i];
        }
        return ans;
    }

}
