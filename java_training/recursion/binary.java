void fun2(int n) 
{ 
  if(n == 0) 
    return; 
  
  fun2(n/2); 
  printf("%d", n%2); 
} 