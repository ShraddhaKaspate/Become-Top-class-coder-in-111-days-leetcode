class Solution {
    public String reverseWords(String s) 
    {
    /*
     String[]  str=s.trim().split("\s+");
     String res="";

     for(int i=str.length-1;i>0;i--)
     {
        res+=str[i]+" ";
     }
     return res+str[0];
     */

    String words[]=s.trim().split("\s+");
    
    int i=0,j=words.length-1;
        while(i<j){
            String temp;
            temp=words[i];
            words[i]=words[j];
            words[j]=temp;
            i++;
            j--;

            
        }   
    
    return String.join(" ",words);
    }
}