class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] arr = s.toCharArray();
        while(left<right){
            if(isVowel(arr[left]) && isVowel(arr[right])){
            char ch = arr[left];
            arr[left] = arr[right];
            arr[right] = ch;
            left++;
            right--;
            }
            else if(!isVowel(arr[left]))
            left++;
            else
            right--;
        }
        return new String(arr);
    }
    public boolean isVowel(char ch){
        char h = Character.toLowerCase(ch);
        if(h=='a'|| h=='e'||h=='i'||h=='o'||h=='u')
        return true;
        return false;
    }
}