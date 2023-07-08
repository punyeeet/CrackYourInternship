// intuition of this problem is that either diameter can be Max diameter of (left Subtree, right Subtree) 
// or the sum of the depth of left and right subtrees; 
// so I coded a solution on my own with two recursive functions which stands very clear with the intuition above.

//efficient code --> 
  class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }
    
    private int depth(TreeNode root){
        if(root==null)return 0;
        int left = depth(root.left);
        int right = depth(root.right);

        max = Math.max(max,left+right);

        return Math.max(left,right)+1;
    }
}

//-> my code 
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        //base case
        if(root==null)return 0;

        int diaLeft = diameterOfBinaryTree(root.left);
        int diaRight = diameterOfBinaryTree(root.right);

        int ans = Math.max(depth(root.left)+depth(root.right),Math.max(diaLeft,diaRight));

        // if(root.right!=null)ans++;
        // if(root.left!=null)ans++;
        

        return ans;
    }
    private int depth(TreeNode root){
        if(root==null)return 0;

        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
