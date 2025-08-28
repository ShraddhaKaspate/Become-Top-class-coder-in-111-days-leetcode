class Solution {
    public String largestGoodInteger(String num) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i = 0; i <= num.length() - 3; i++ ){
            String sub = num.substring(i, i + 3);
            map.put(sub,map.getOrDefault(sub,0)+1);
        }

        String ans = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.charAt(0) == key.charAt(1) && key.charAt(1) == key.charAt(2)) {
                 if (ans.isEmpty() || key.compareTo(ans) > 0) {
                    ans = key;
                }
            }
        }
        return ans;
    }
}