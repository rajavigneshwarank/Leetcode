class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet<>();
        int t=0;
        int c=0;
        for(int num:banned){
            set.add(num);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                t+=i;
                if(t<=maxSum){
                    c++;
                }
                else{
                    break;
                }
            }
        }
        return c;
    }
}