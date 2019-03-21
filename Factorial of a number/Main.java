#include <stdio.h>
int main() {
	
	int n,r;
	int f=1;
	scanf("%d",&n);
	
	while(n>0)
	{
		f=f*n;
		n=n-1;
	}
	
	printf("%d",f);
	
	
	//Type your code
	return 0;
}