class Solution {
    public boolean rotateString(String s, String goal) {
       
        char arr[]=s.toCharArray();
        for(int k=0;k<s.length();k++){
            
            char temp=arr[0];
            for(int i=1;i<arr.length;i++){
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=temp;

            String rev=new String(arr);
            if(rev.equals(goal))   return true;

        }
        return false;
    }
}