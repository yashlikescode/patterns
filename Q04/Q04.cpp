#pragma GCC optimize("Ofast")
#include <bits/stdc++.h>
using namespace std;

//cpp solution for Q04


int32_t main()
{
	int n;
	cin>>n;
	
	for(int i=0;i<n;i++)
	{

		for(int j=n;j>i+1;j--)
			cout<<" ";
		for(int k=0;k<i+1;k++)
			cout<<"*";
		cout<<"\n";
	}	


}

