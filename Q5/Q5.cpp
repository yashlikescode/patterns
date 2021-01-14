#include <iostream>

using namespace std;

int main()
{
    int n;
    cout<<"Enter no of row:";
    cin>>n;
    for(int i=0;i<n;i++)
    {
        for(int sp=0; sp< (i); sp++)
        {
            cout<< " ";
        }

        for(int st=0; st<n-i; st++)
        {

                cout<< "*";
        }
         cout<<endl;
    }
}
