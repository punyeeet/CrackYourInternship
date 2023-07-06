class Solution {
    public void moveZeroes(int[] nums) {
        int snowBall = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)snowBall++;
            else{
                swap(nums,i,i-snowBall);
            }
        }
    }
    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    
}
//best approach single iteration , snowBall analogy
