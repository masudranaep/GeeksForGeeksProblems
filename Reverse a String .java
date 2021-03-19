 public static String reverseWord(String str)
    {
 
       // Reverse the string str
    
        int n = str.length();
    
    if(n == 0)
      
      return " ";
  
      int l = 0, r = n-1;
    
    char[] ch = str.toCharArray();
 
       while(l < r){
    
        char c = ch[l];
   
         ch[l] = ch[r];
       
     ch[r] = c;
     
       l++;
   
         r--;
    
}
      
  return new String(ch);
    
    }