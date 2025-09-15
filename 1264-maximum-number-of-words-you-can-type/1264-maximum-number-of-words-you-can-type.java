class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int cnt=0;
        HashSet<Character> map=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            map.add(brokenLetters.charAt(i));
        }
       String[] words=text.split(" ");
       for(String str : words){
        int i=0;
        for( ;i<str.length();i++){
            if(map.contains(str.charAt(i))){
                break;
            }
        }
        if( i==str.length())
        {
            cnt++;
        }
       }

    return cnt;
    }
}