#include<stdio.h>

int add(int n)
{
	int i,sum=0;
	
	for(i=1;i<=n;i++)
	{
		sum = sum + i;
	}
  return sum;
	
	
}

int main() {
   // Type your code here
   int n,n1;
   scanf("%d",&n);
   n1=add(n);
   printf("%d",n1);
   return 0;
}