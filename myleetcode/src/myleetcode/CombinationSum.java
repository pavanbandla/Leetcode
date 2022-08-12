package myleetcode;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public static void main(String[] args) {
	int target = 7;
	int[] candidates = new int[] {2,3,6,7};
	System.out.println(combinationSum(candidates, target));
	
	}
	 public static List<List<Integer>> combinationSum(int[] candidates, int target){
		 
		 List<List<Integer>> result = new ArrayList<List<Integer>>();
		 rec(candidates, 0, target, new ArrayList<Integer>(), result);
		 return result;
	 }
	 
	 private static void rec(int[] candidates,int start, int target, List<Integer> list, List<List<Integer>> result) {
		
		 if(target < 0) {
			 return;
		 }
		 if(target == 0) {
			 result.add(new ArrayList<Integer>(list));
		 }
		 for(int i = start;i < candidates.length; i++) {
			 list.add(candidates[i]);
			 rec(candidates, i, target - candidates[i], list, result);
			 list.remove(list.size() -1);
		 }
	 }
}
