#include<stdio.h>

int main()
{
    int i,j;
    int n,no=1;
    scanf("%d",&n);
    
    for(i=1;i<=n;i++)
    {
        for(j=n;j>i;j--)
        {
          printf(" ");
        }
        for(j=1;j<=i;j++)
        {
          printf("%d ",no);
          no=no+1;
        }
        printf("\n");
    }
    return 0;
}