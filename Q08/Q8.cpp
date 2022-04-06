#include<bits/stdc++.h>
using namespace std;

int main()
{
    int len;
	printf("Enter width: ");
    cin>>len;
    int cnt = 1 , t = 0 ;
    for(int i = 0 ; i < 2* len -1 ; i++ ){
        for(int j = 0; j < len - cnt ;j++) cout<<" ";
        for(int j = 0; j < cnt ;j++) cout<<"*";
        if(cnt == len) t++;
        if(!t) cnt++;
        else cnt--;
        cout<<"\n";
        
    }
    return 0;
}