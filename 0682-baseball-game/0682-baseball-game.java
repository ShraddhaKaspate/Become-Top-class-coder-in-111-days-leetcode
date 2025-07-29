class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list=new ArrayList<>();

        for(String s : operations){
            if(s.equals("+")){
                list.add(list.get(list.size()-1)+ list.get(list.size()-2));
            }
            else if(s.equals("C")){
                list.remove(list.size()-1);
            }
            else if(s.equals("D")){
                list.add(2*list.get(list.size()-1));
            }else{
                list.add(Integer.parseInt(s));
            }
        }
        int total=0;
        for( int j: list){
            total+=j;
        }
        return total;
    }
}