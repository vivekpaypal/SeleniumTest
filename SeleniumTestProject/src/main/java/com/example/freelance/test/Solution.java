package com.example.freelance.test;

class Solution {
	
	public static void main(String[] args) {
		
		/*long [] a = {2,5,4,6,8};
		long b =2;
		System.out.println(doubleSize(a, b));*/
		
		pascalTriangle(4);
		
	}
	
   static long doubleSize(long[] a, long b) {

             
	   
	   for(Long l : a){
		   
		   if(l == b){
			   b = b*2;
		   }
	   }
	   
	   return b;
        
        
    }
	
   
   static void pascalTriangle(int k) {

	   //n! /(r! * (n-r)!)
	   for(int n = 0 ; n < k ;n++){
		   
		   
		   for(int r =0; r <= n; r++){
			   
			   System.out.print( factorial(n) / ((factorial(r)* (factorial(n-r)))));
			   System.out.print(" ");
			   
			   
		   }
		   
		   System.out.println("");
		   
	   }
   }
   
   static int factorial(int n){
	   
	   if(n==0)
		   return 1;
	   int fact =1;
	   for(int i =n; i > 0; i--){
		   
		   fact = fact * i;
	   }
	return fact;
   }

}