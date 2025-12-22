class Solution {
    public boolean isValid(String s) {
        
        Stack <Character> stack=new Stack<>();

        for (char ch : s.toCharArray())
        {

            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);

            }
            else if(ch==')' || ch==']' || ch=='}' ){

                if(stack.isEmpty() || !matches(stack.pop(),ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}