class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int it=0;
        for(int i=0;i<s.length();i++){
            if(it<spaces.length && i==spaces[it]){
                str.append(' ');
                it++;
            }
            str.append(s.charAt(i));
        }
       return str.toString();
    }
}