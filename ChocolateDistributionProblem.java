class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int ans = Integer.MAX_VALUE;
        for(int i=0,j=m-1;j<n;i++,j++){
            ans = Math.min(a.get(j)-a.get(i),ans);
        }
        return ans;
    }
}
