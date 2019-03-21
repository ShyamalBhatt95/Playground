#include <stdio.h>
int main() {
	
	int n,r,temp;
	int f,sum=0;
	int no;
	scanf("%d",&n);
	
	temp=n;
	

	while(n>0)
	{
		
		no=n%10;
		
	
		
		f=1;
		while(no>0)
		{
			f=f*no;
			no=no-1;
		}
		sum=sum+f;
	
	n=n/10;
	
	}
	

	
	if(sum==temp)
	printf("Yes");
	else
	printf("No");
	
	//Type your code
	return 0;
}