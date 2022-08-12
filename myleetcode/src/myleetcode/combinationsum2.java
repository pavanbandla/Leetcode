package myleetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class combinationsum2 {
	public static void main(String[] args) {
		int target = 8;
		int[] candidates = new int[] {10,1,2,7,6,1,5};
		System.out.println(combinationSum2(candidates, target));	
	}	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target){	 
	    List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        rec(candidates, target, res, new ArrayList<>(), 0);
        return res;
	 }
	 private static void rec(int[] candidates, int target, List<List<Integer>> res, List<Integer> temp, int start) {
		    if(target < 0)
			 return;
	        if(target == 0 ) {
	            res.add(new ArrayList<>(temp));
	            return;
	        }
		 for(int i = start; i < candidates.length; i++) {
	            if(candidates[i] > target)
	            	{
	            	continue;
	            	}
				// The most important step --->  avoid duplicate combinations. 
	            if(i != start && candidates[i] == candidates[i-1]) 
	            {
	            	continue;
	            }
	            temp.add(candidates[i]);
	            rec(candidates, target - candidates[i], res, temp, i+1);
	            temp.remove(temp.size() - 1);
	        }
}
	 }
