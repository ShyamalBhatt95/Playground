#include<stdio.h>
int main()
{
	
	int a[100]; 
	int i,n,n1,n2,max =0 ;
	
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);


	max = a[0];
	
	for(i=0;i<5;i++)
	{
		if(a[i] >= max)
		{
		
			max = a[i];		
		}
		
		else continue;	
		
	}
	
	printf("%d",max);
	
  return 0;
}