class Tree{
  
  Map<Integer,Integer> map = new TreeMap<>();
  
  void dfs(Node root, int level){
   
     if(root == null) return;
     
   if(!map.containsKey(level)) map.put(level,root.data);
 
       dfs(root.left, level+1);
  
      dfs(root.right, level+1);
  
  }
 
   ArrayList<Integer> leftView(Node root){
  
      dfs(root,0);
       
 return new ArrayList<>(map.values());
 
   }

}