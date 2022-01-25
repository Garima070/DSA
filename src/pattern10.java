#include<iostream>
#include<conio.h>
#include<math.h>
int bin(int b)
{
	int s=0,r,p=1;
	while(b>0)
	{
		int r=b%2;
		b=b/2;
		s=s+(r*p);
		p=p*10;
	}
	return s;
}
int count(int a)
{
	int c=0;
		while(a>0)
		{
			a=a/10;
			c++;
		}
		return c;
	}
int main()
{
	int n,c=0,a;
	scanf("%d",&n);
	int l=bin(n);
	int co=count(l);
	for(int i=1;i<=n;i++)
	{
		int z=bin(i);
		int m=count(z);
		//printf("count=%d large=%d %d\n",m,co,co-m);
		for(int j=1;j<=co-m;j++)
		{
			printf(" ");
		}
		printf("%d",z);
		printf("\n");
	}
	getch();
}
