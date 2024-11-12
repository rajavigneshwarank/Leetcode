class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
         Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<2*n;i++){
            int curr = i%n;
            while(!stack.isEmpty() && nums[curr]>nums[stack.peek()]){
                ans[stack.pop()] = nums[curr];
            }
            if(i<n){
                stack.push(curr);
            }
        }
    
        return ans;
    }
}
