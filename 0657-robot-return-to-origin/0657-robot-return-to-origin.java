class Solution {
    public boolean judgeCircle(String moves) {
        int L=0,R=0,U=0,D=0;
        

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                L=L+1;
              
            }else if(moves.charAt(i)=='R'){
                R+=1;
                
            }else if(moves.charAt(i)=='U'){
                U+=1;
                
            }else{
                D+=1;
                
            }
        }

      
        if(L == R && U == D){
            return true;
        }

        return false;
    }
}