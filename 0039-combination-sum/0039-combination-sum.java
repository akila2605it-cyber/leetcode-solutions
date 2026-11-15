class Solution {
List<List<Integer>> result = new ArrayList<>();
List<Integer> current = new ArrayList<>();
public List<List<Integer>> combinationSum(int[] candidates, int target) {
backtrack(candidates, target, 0);
return result;
    }
public void backtrack(int[] candidates, int remaining, int start) {
if (remaining == 0) {
result.add(new ArrayList<>(current));
 return;
        }
 if (remaining < 0) {
 return;
        }
 for (int i = start; i < candidates.length; i++) {
 current.add(candidates[i]);
 backtrack(candidates, remaining - candidates[i], i);
current.remove(current.size() - 1);
        }
    }
}


