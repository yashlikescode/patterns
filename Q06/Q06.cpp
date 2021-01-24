#pragma GCC optimize("Ofast")
#include <bits/stdc++.h>
using namespace std;

int32_t main()
{
	int n;
	cin>>n;
	int f=1; //for stars
	for(int i=0;i<n;i++)
	{
	
		for(int j=n;j>i+1;j--)
			cout<<" ";
		for(int k=0;k<f;k++)
			cout<<"*";  
			// every time stars increase by 2...1,3,5,7...
		f+=2;
		cout<<"\n";
	}


}

