package fundamental;
import java.util.*;
public class BinaryTreeUse {
	 public static  BinaryTreeNode<Integer>buildTreeHelper(int[] pre,int[] in,int sipre,int eipre,int siin,int eiin){
	       if(sipre>eipre){
	           return null;
	       }
	        
	        int rootdata=pre[sipre];
	        
	        BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(rootdata);
	        int rootindex=-1;
	        for(int i=siin;i<=eiin;i++){
	            if(in[i]==rootdata){
	                rootindex=i;
	                break;
	            }
	        }
	        
	        int sipreleft=sipre+1;
	        int siinleft=siin;
	        int eiinleft=rootindex-1;
	        int siinright=rootindex+1;
	        int eipreright=eipre;
	        int eiinright=eiin;
	        
	        int leftsubtreelength=eiinleft-siinleft+1;
	        int eipreleft=sipreleft+leftsubtreelength-1;
	        int sipreright=eipreleft+1;
	        BinaryTreeNode<Integer> left=buildTreeHelper( pre,in,sipreleft,eipreleft,siinleft,eiinleft);
	        BinaryTreeNode<Integer> right=buildTreeHelper( pre,in,sipreright,eipreright,siinright,eiinright);
	        root.left=left;
	        root.right=right;
	        return root;
	        
	    }

		public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
			//Your code goes here
	        BinaryTreeNode<Integer> root = buildTreeHelper(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
	        return root;
	        
		}
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
      Queue<BinaryTreeNode<Integer>> pendingChildren=new LinkedList<BinaryTreeNode<Integer>>();
       pendingChildren.add(root);
      //  pendingChildren.add(null);
        
        while(!pendingChildren.isEmpty()){
            BinaryTreeNode<Integer> front=pendingChildren.poll();
            System.out.print(front.data +":L:");
            if((front.left!=null)&&(front.right!=null)){
                System.out.print(front.left.data +",R:");
                System.out.println(front.right.data );
                
               pendingChildren.add(front.left);
                pendingChildren.add(front.right);
            }
            else if((front.left==null )&& (front.right!=null)){
                System.out.print("-1"+",R:");
                System.out.println(front.right.data );
                pendingChildren.add(front.right);
            }
            else if(front.left!=null&& front.right==null){
                System.out.print(front.left.data+",R:");
                System.out.println("-1" );
                pendingChildren.add(front.left);
            }
            else{
                 System.out.print("-1"+",R:");
                System.out.println("-1" );
            }
        
        }
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelwise(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data:");
		int rootData = sc.nextInt(); // taking data as input
		if (rootData == -1) { // if the data is -1, means null pointer
		  return null;
		}
		 BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData); 
		Queue< BinaryTreeNode<Integer>> pendingChildren=new LinkedList< BinaryTreeNode<Integer>>();
		pendingChildren.add(root);
		
		while(!pendingChildren.isEmpty()) {
			 BinaryTreeNode<Integer> front=pendingChildren.poll();
			 System.out.println("enter the left data :"+front.data);
			 int left=sc.nextInt();
			 if(left!=-1) {
				 BinaryTreeNode<Integer> leftchild=new  BinaryTreeNode<Integer> (left);
				 front.left=leftchild;
				 pendingChildren.add(leftchild);
				 
			 }
			 System.out.println("enter the right data :"+front.data);
			 int right=sc.nextInt();
			 if(right!=-1) {
				 BinaryTreeNode<Integer> rightchild=new  BinaryTreeNode<Integer> (right);
				 front.right=rightchild;
				 pendingChildren.add(rightchild);
				 
			 }
		}
		return root;		
	}
	public  static BinaryTreeNode<Integer> takeInput() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter data:");
		int rootData = s.nextInt(); // taking data as input
		if (rootData == -1) { // if the data is -1, means null pointer
		return null;
		}
		// Dynamically create root Node which calls constructor of the same class
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		// Recursively calling over left subtree
		BinaryTreeNode<Integer> leftChild = takeInput();
		// Recursively calling over right subtree
		BinaryTreeNode<Integer> rightChild = takeInput();
		root.left = leftChild; // now allotting left and right childs to root
		root.right = rightChild;
		return root;
		}
	public  static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) { // Base case
		return;
		}
		System.out.print(root.data + ":"); //printing the data at root node
		if (root.left != null) { // checking if left not null
		System.out.print("L" + root.left.data);
		}
		if (root.right != null) { // checking if right not null
		System.out.print("R" + root.right.data);
		}
		System.out.println();
		printTree(root.left);//Now recursively, call left and right subtrees
		printTree(root.right);
		}
   public static void main(String[] args) {
	  BinaryTreeNode<Integer>root= takeInputLevelwise();
	  printTree(root);
  }

}

