class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        /*
        while(i<j && s.charAt(i)==s.charAt(j)){
            
                i++;
                j--;
            
        
        }
        if (i >= j) return true;

       int a=i+1,b=j;
        while(a<b && s.charAt(a)==s.charAt(b)){
            a++;
            b--;
        }
       if (a >= b) return true;

         a=i;
         b=j-1;
        while(a<b && s.charAt(a)==s.charAt(b)){
            a++;
            b--;
        }
        if (a >= b) return true;
                 
        
        return false;
        */

        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{

                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
        }
        return true;
    }

    public boolean isPalindrome(String s,int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;

            }else{
           i++;
           j--;
           
        }
    }
    return true;
}
}

