package com.java.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**叶子相同的树
 *
 */
public class LeafSimilar {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> seq1=new ArrayList<>();
        sdf(root1,seq1);

        List<Integer> seq2=new ArrayList<>();
        sdf(root2,seq2);
        return seq2.equals(seq1);
    }

    public void sdf(TreeNode node,List<Integer> list){

        if(node.left==null&&node.right==null){
            list.add(node.val);
        }else{
            if(node.left!=null) {
                sdf(node.left, list);
            }
            if(node.right!=null){
                sdf(node.right,list);
            }
        }
    }
}

class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
