#pragma GCC optimize("Ofast")
#include <bits/stdc++.h>
using namespace std;

int32_t main()
{
	
	int n;
	cin>>n;

	for(int i=0;i<n;i++)
	{
		for(int k=0;k<i+1;k++)
			cout<<" ";

		for(int j=0;j<2*n-i*2;j++)
			cout<<"*";
		
		cout<<"\n";


	}

	for(int i=0;i<n;i++)
	{


		for(int k=n;k>i;k--)
			cout<<" ";

		for(int j=0;j<(2*i+2);j++)
			cout<<"*";
		cout<<"\n";
	}
	


}

