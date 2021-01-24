#pragma GCC optimize("Ofast")
#include <bits/stdc++.h>
using namespace std;

int32_t main()
{
	
	int n;
	cin>>n;

	for(int i=0;i<n;i++)
	{

		for(int j=0;j<i+1;j++)
			cout<<"*";
			
		cout<<"\n";

	}

	for(int i=0;i<n-1;i++)
	{
		for(int j=n-1;j>i;j--)
			cout<<"*";
		cout<<"\n";
		
	}


}

