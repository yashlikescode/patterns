#include <iostream>

using namespace std;

int main()
{
    int n;
    cout<<"Enter number of rows:";
    cin>>n;
    for(int i=0;i<n;i++)
    {
        for(int sp=0; sp< (n-1-i); sp++)
        {
            cout<< " ";
        }

        for(int st=0; st< (2*i)+1; st++)
        {

                cout<< "*";
        }
         cout<<endl;
    }
}
