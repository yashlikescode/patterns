#include <iostream>

using namespace std;

int main()
{
    int n=0;
    while(n<5){
        int j=n;
        for(int i=0;i<5;i++){
            cout<<j<<" ";
            j++;
        }
        cout<<endl;
        n++;
    }
    return 0;
}
