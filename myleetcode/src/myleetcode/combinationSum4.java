package myleetcode;
public class combinationSum4 {

	public static void main(String[] args) {
		int target = 4;
		int[] candidates = new int[] {3,2,1};
		System.out.println(combinationSumiv(candidates, target));
		}
    public static int combinationSumiv(int[] nums, int target) {
 	int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++)
            for (int num : nums)
                if (num <= i)
                	dp[i] += dp[i-num];
                	
        return dp[target];
    }
}
