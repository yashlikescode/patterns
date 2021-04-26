#include <iostream>

using namespace std;

int main()
{   int m;
    cin>>m;
    int n=0;
    while(n<m){
        int j=n;
        for(int i=0;i<m;i++){
            cout<<j<<" ";
            j++;
        }
        cout<<endl;
        n++;
    }
    return 0;
}
