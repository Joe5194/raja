class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n0){    
   r=n%10;  getting remainder  
   sum=(sum10)+r;    
   n=n10;    
  }    
  if(temp==sum)    
   System.out.println(palindrome number );    
  else    
   System.out.println(not palindrome);    
}  
}  