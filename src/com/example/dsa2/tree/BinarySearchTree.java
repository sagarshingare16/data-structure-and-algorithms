package com.example.dsa2.tree;

public class BinarySearchTree {

    private TreeNode root;

    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void insert(int value){
        root = insert(root,value);
    }

    public TreeNode insert(TreeNode root,int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.data){
            root.left = insert(root.left,value);
        }else {
            root.right =  insert(root.right,value);
        }
        return root;
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public TreeNode search(int key){
        return search(root,key);
    }

    public TreeNode search(TreeNode root,int key){
        if(root == null || root.data == key){
            return root;
        }
        if(key < root.data){
            return search(root.left,key);
        }else {
            return search(root.right,key);
        }
    }

    public boolean isValid(TreeNode root,long min,long max){
        if(root == null){
            return true;
        }
        if(root.data <= min || root.data >= max){
            return false;
        }
        boolean left = isValid(root.left,min,root.data);
        if(left){
            boolean right = isValid(root.right,root.data,max);
            return right;
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(2);
        bst.insert(1);
        bst.insert(8);
        //bst.insert(3);
        bst.insert(6);

        bst.inOrder();

        if(null!= bst.search(5)){
            System.out.println("Key Found");
        }else {
            System.out.println("Key not found");
        }

        boolean result= bst.isValid(bst.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.println(result);
    }

}
