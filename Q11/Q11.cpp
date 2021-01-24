#pragma GCC optimize("Ofast")
#include <bits/stdc++.h>
using namespace std;

int32_t main()
{
	
	int n;
	cin>>n;

	for(int i=1;i<=n;i++)
	{
		
		for(int k=n;k>i;k--)
			cout<<" ";

		for(int j=1;j<=i;j++)
			cout<<j<<" ";
		
		cout<<"\n";
	
	}

}

