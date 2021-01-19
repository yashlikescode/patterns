#include <iostream>

using namespace std;

int main()
{
    int n;
    cout<<"Enter length of middle row:";
    cin>>n;
    for(int i=0;i<n;i++)
    {
        for(int fs=0;fs<=i; fs++)
        {
            cout<< "*";
        }
        cout<<endl;
    }

        for(int p=0; p< (n-1); p++)
        {
            for(int ss=(n-1-p); ss>0; ss--)
            {
                cout<< "*";
            }
            cout<<endl;
        }


}
