static int height(Node root) {
      	// Write your code here.
          if(root == null)
                return -1;

        /* If tree is not empty then height = 1 + max of left 
            height and right heights */   
        
        return 1 + Math.max(height(root.left), height(root.right));
    }
