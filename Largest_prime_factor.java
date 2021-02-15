   static long largestPrimeFactor(int N) {
  
      // code here
 
long maxPrime = -1;
 
while(N % 2 == 0){
    
 maxPrime = 2;
   
  N >>= 1;
 
}
 
for(int i = 3; i <= Math.sqrt(N); i += 2){

     while(N % i == 0){
 
        maxPrime = i;
 
        N = N /i;
 
    }

 }

 if(N > 2)
 
    maxPrime = N;
 
    return  maxPrime;
 

    }

}