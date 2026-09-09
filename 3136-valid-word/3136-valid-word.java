class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n<3)
        return false;
        int vow = 0;
        int consot =0;
        int count=0;
        
        for(int i=0;i<n;i++){
            char h = (word.charAt(i));
            char ch =  Character.toLowerCase(h);
            if( (ch >= '0' && ch <= '9') || (ch >='a'&& ch <= 'z'))
            count++;
            else
            return false;
            if(ch == 'a'||ch =='e' || ch == 'i' || ch == 'o'|| ch == 'u')
            vow++;
            else if(ch >= 'a' && ch <='z')
            consot++;
           
        }
        
        if(vow==0 || consot ==0)
        return false;
        return true;

    }
}