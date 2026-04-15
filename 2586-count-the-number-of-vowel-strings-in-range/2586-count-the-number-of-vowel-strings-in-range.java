class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int cnt=0;
        for(int start=left;start<=right;start++){
            String word=words[start];

            char i=word.charAt(0);
            char j=word.charAt(word.length()-1);
            

             if((i=='a'||i=='e'||i=='i'||i=='o'||i=='u') &&
               (j=='a'||j=='e'||j=='i'||j=='o'||j=='u')){
                cnt++;
            }
        }
        return cnt;
    }
}