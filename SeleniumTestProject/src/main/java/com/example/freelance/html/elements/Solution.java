package com.example.freelance.html.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;




	public class Solution {
		
		 public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        int k = in.nextInt();
		        String number = in.next();
		        
		        ArrayList<String> numbers = new ArrayList<String>();
		        
		        
		       char arr [] =  number.toCharArray();
		       int num [] = new int[arr.length];
		       for(int i= 0; i <arr.length ;i ++){
		    	   
		    	   num[i] =  Character.getNumericValue(arr[i]);
		       }
		       
		       ArrayList<Integer> it  = new ArrayList<Integer>();
		       for(int j =0,l=num.length-1 ; j < l && (l >=0) ; j++,l++){
		    	   
		    	   if(num[j] == num [l]){
		    		   
		    		   
		    	   }else{
		    		   
		    		   it.add(j);
		    		   it.add(l);
		    	   }
		       }
		      
		       if(!it.isEmpty()){
		    	   
		    	   int t = it.size();
		    	   for(int p= 1 ; p <= t;p++){
		    		   
		    		   int temp = num[it.get(p)];
		    		   num[it.get(p)]= num[it.get(p+1)] ;
		    		   
		    		   p= p+1;
		    	   }
		    	   
		    	   
		    	   
		       }
		       
		    }
		
	}
