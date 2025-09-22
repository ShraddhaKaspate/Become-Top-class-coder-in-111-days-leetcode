class Solution {
    public String firstPalindrome(String[] words) {
       
        for(String ele: words){
            char[] str=ele.toCharArray();
            int i=0;
            int j=str.length-1;
            boolean isPalindrome=true;
            
            while(i<j){
                if(str[i]!=str[j]){
                    isPalindrome=false;
                    break;
                }
                i++;
                j--;
            }
            if(isPalindrome){
                return ele;
            }
        }
        return "";
    }
}