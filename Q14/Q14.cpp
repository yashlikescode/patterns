#pragma GCC optimize("Ofast")
#include <bits/stdc++.h>
using namespace std;

int32_t main()
{
	
	int n;
	cin>>n;
		
	int f=1;
	for(int i=0;i<n;i++)
	{

		int cnt=0;
		for (int j=1;j<=2*n+1;j++)
		{
			if(j>n-i && cnt<f)
			{
				cout<<" ";
				cnt++;
			}
			else
				cout<<"*";
		}
		f+=2;
		cout<<"\n";
	}

	cout<<"\n\n";
	int x=2*n-1;
	for(int i=0;i<n;i++)
	{
		int cnt=0;
		for (int j=1;j<=2*n+1;j++)
		{
			if(j>i+1 && cnt<x)
				cout<<" ",cnt++;
			else
				cout<<"*";	
		}
		x-=2;	
		cout<<"\n";

	}


}

