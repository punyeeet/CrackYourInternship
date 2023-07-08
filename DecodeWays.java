class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        

        dp[n] = 1;

        for(int index=n-1;index>=0;index--){
           int takeOne = 0 ,takeTwo = 0;
        
            if(!(index<n-1 && s.charAt(index+1)=='0') && s.charAt(index)!='0')
            takeOne = dp[index+1];

            if(n-1>=index+1){
                int nextTwoVal = (s.charAt(index)-'0')*10 + s.charAt(index+1)-'0';

                if( nextTwoVal< 27 && nextTwoVal>9){
                    
                    takeTwo = dp[index+2];
                }
            }

            dp[index] = takeOne+takeTwo;
        }

        return dp[0];
    }
    
}
