class Solution {
    public int maxScore(String s) {
        int totalone = 0, omes =0, zeroes = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '1')
            totalone++;
        }
        int best =0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0')
            zeroes++;
            else
            omes++;
            int score = zeroes + totalone -omes;
            best = Math.max(best, score);
        }
        return best;
    }
}