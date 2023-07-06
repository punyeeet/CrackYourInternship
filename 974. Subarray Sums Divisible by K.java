class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        long sum = 0;
        int ans=  0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);
        for(int curr: nums){
            sum += curr;
            int rem = (int)(sum)%k;
            if(rem<0)rem = rem+k;

            int f = freq.getOrDefault(rem,0);
            
            ans += f;

            freq.put(rem,f+1);
                      
        }
        return ans;
    }
}
// we count the freq of remainders 
// when each remainder repeats , it means one iteration of multiple of K is done hence that part is divsible by k 
// moreover that part can combine with all the previous occurence of remainder to form new subaarays hence we add the previous frequency of remainder 
// to out ans. 
