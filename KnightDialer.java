//Reccursive memoized code also submitted on leetcode
//this one is the tabular solution 
class Solution {
    int mod = 1000000007;
    public int knightDialer(int n) {
        if(n==1)return 10;

        // index-> number array->possible values we can jump to from that number
        int[][] moves = {{4,6},{6,8},{7,9},{4,8},{0,3,9},{},{0,1,7},{2,6},{1,3},{2,4}};

        int[] arr = new int[10];
        Arrays.fill(arr,1);

        for(int i =2;i<=n;i++){
            int[] temp = new int[10];

            for(int k=0;k<moves.length;k++){
                for(int j=0;j<moves[k].length;j++){
                    temp[k] = (temp[k] + arr[moves[k][j]])%mod;
                }
            }

            arr = temp;
            
        }
        int ans = 0;
        for(int val:arr){
            ans=(ans+val)%mod;
        }
        return ans;

    }
    
}
