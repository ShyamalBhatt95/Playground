#include<stdio.h>

int sq(int n)
{
	return n*n;
}

int main() {
   // Type your code here
   int n,n1;
   scanf("%d",&n);
   n1=sq(n);
   printf("%d",n1);
   return 0;
}