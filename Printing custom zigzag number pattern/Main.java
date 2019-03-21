#include<stdio.h>

int main()
{
	int i,j,k,n;
	
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		if(i%2==1)
		{
			for(j=1;j<=n;j++)
			{
				if(j==n)
				printf("%d",i+1);
			
				else
				printf("%d",i);
			}
		}
		
		else 
		{
			for(j=1;j<=n;j++)
			{
				if(j==1)
				printf("%d",i+1);
			
				else
				printf("%d",i);
			}
		}
		
		
		printf("\n");
	}
	
}