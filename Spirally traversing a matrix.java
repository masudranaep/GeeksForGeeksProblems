
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
 
   {
        // code here 

 
int top = 0;

 int bottom = r - 1;
 
int left = 0;
 
int right = c - 1;

 
ArrayList<Integer> res = new ArrayList();
 
//if(matrix.length == 0) return res;

 
  while(top <= bottom && left <= right){
  
    
      for(int i = left; i <= right; i++){
 
         res.add(matrix[top][i]);
   
   }
      
 top++;
 

      for(int i = top; i <= bottom; i++){
 
          res.add(matrix[i][right]);
 
      }
      
 right--;
  
     if(top <= bottom){
  
         for(int i = right; i >= left; i--){

               res.add(matrix[bottom][i]);
   
        }
       }
  
     bottom--;
  
     if(left <= right){
 
          for(int i = bottom; i >= top; i--){
 

              res.add(matrix[i][left]);
 
          }
       }
  
     left++;
    
   
  }
 
 return res;
 

    }
}
