#pragma GCC optimize("Ofast")
#include <bits/stdc++.h>
using namespace std;

int32_t main()
{
	
	int n;
	cin>>n;
		
	int f=1;
	// we have two cases for if n is odd and even 
	// for n=5 1,3,5,3,1 n=6 1,3,5,5,3,1

	int g=(n%2==0)?n-1:n;

	for(int i=0;i<n/2;i++)
	{
	
		for(int k=n/2;k>i;k--)
			cout<<" ";
		for (int j=0;j<f;j++)
			cout<<"*";
		cout<<"\n";
			f+=2;

	}
		
	for(int i=0;i<n/2+1;i++)
	{
		
		int h=(n%2==0)?i+1:i;
		for(int k=0;k<h;k++)
			cout<<" ";

		for(int j=g;j>0;j--)
			cout<<"*";
		cout<<"\n";
		g-=2;
	}

}

