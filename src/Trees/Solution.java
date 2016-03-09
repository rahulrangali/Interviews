package Trees;
public class Solution {
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
    
    public boolean isValidBST(TreeNode root) {
    
        return isValidBSTUtil(root,null,null);
    }
    public boolean isValidBSTUtil(TreeNode root, Integer min, Integer max){
        if(root == null){
            return true;
        }
        if((min!= null && root.val <= min) || (max!= null && root.val >= max) ){
            return false;
        }
        if(!(isValidBSTUtil(root.left,min,root.val))||!(isValidBSTUtil(root.right,root.val,max))){
            return false;
        }
        return true;
    }
}
}