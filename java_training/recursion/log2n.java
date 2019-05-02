public class log2n {
int fun1(int n) 
{ 
  if(n == 1) 
     return 0; 
  else
     return 1 + fun1(n/2); 
}
}