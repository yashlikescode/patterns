#include<iostream>
using namespace std;

void pattern(int n)
{
    for(int i=n;i>0;--i)
    {
        cout<<"\n";
        for(int j=1;j<=i;++j)
            cout<<"*";
    }       
    for(int i=2;i<=n;++i)
    {
        cout<<"\n";
        for(int j=1;j<=i;++j)
            cout<<"*";
    } 
}

int main()
{
    int n;
    cout<<"Enter no. of columns: ";
    cin>>n;
    pattern(n);
    return 0;
}

/*Eg: 
Enter no. of columns: 5
*****
****
***
**
*
**
***
****
*****

*/