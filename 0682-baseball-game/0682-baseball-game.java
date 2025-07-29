class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();

        for(String i : operations){

            if(i.equals("C")){
                stack.pop();
            }else if(i.equals("D")){
                stack.push(2*stack.peek());
            }else if(i.equals("+")){
                int top=stack.pop();
                int stop=stack.peek();
                int sum=top+stop;
                stack.push(top);
                stack.push(sum);
            }else{
                stack.push(Integer.parseInt(i));
            }
        }
        int total=0;
       for(int j : stack){
            total+=j;
       }
       return total;
    }
}