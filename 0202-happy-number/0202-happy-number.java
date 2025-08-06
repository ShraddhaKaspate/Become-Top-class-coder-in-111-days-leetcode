class Solution {
    public boolean isHappy(int n) {
        int d,sum;
        
        while(n!=1 && n!=4){
        sum=0;
        int num=n;
        while(num>0){
            d=num%10;
            num/=10;
            sum+=d*d;
        }
        n=sum;
        }
        return n==1;
    }
}