class Solution {
    public String toGoatLatin(String sentence) {
        String[] arr = sentence.split(" ");
        String ans = "";
        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            String res  = "";
            char ch = word.charAt(0);
            if(isVowel(ch)){
                res = word + "ma";
            }
            else
                res = word.substring(1) + ch + "ma";
            int j = 0;
            while(j<i+1){
                res+="a";
                j++;
            }
            ans = ans + res +" ";
        }
        return ans.trim();
    }
    public static boolean isVowel(char ch){
        char c = Character.toLowerCase(ch);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        return false;
    }
}