#include<bits/stdc++.h>
using namespace std;

int main()
{
    int len;
    cin>>len;
    int cnt = 1 , t = 0 ;
    for(int i= 0 ; i < len-1;i++)cout<<" "<<" ";
    cout<<1<<endl;
    for(int i = 1 ; i < len ; i++ ){
        for(int j = 0 ; j < len - i -1 ; j++) cout<<" "<<" ";
        int j;
        for( j = 1  ; j < i+1 ;j++)cout<<j<<" ";
        while(j!=0)cout<<j--<<" ";
        cout<<"\n";
        
    }
    return 0;
}
