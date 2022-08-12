package myleetcode;

public class houseRobber {

	public static void main(String[] args) {
		int[] candidates = new int[] {5,3,6,7};
		System.out.println(rob(candidates));
		
	}
	 public static int rob(int[] nums) {
	        if(nums.length <= 2){
	            if(nums.length == 1) return nums[0]; 
	                else return Math.max( nums[0],nums[1]);
	        }
	         int[] maxa = new int[nums.length];
	         maxa[0] =nums[0]; 
	         maxa[1] =Math.max(nums[0],nums[1]);
	        
	            for(int i = 3; i<nums.length; i++){
	                maxa[i] = Math.max(maxa[i-2] + nums[i], maxa[i-1]);
	                }                       
	             return maxa[nums.length - 1];
	    }

}
