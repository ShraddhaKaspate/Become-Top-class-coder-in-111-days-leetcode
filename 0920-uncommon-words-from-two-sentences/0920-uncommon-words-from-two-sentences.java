class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        String []str1=s1.split(" ");
        String []str2=s2.split(" ");
        /*for(int i=0;i<str1.length;i++){
            map.put(str1[i],map.getOrDefault(str1[i],0)+1);
        }
        for(int i=0;i<str2.length;i++){
            map.put(str2[i],map.getOrDefault(str2[i],0)+1);
        }*/

        for(String s : str1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s : str2){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String> list=new ArrayList<>();
        
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        String []ans=new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
        

    }
}