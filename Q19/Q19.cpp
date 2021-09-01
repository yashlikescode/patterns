#include <iostream>

using namespace std;

int main()
{
    cout<<"Enter Height: ";
    int n;
    cin>>n;
    for (int i = 0; i < n; i++)
    {
        for (int space  = 0; space < n-1-i; space++)
        {
            cout<<" ";
        }
        for (int star = 0; star < i+1; star++)
        {
            cout<<"*";
        }
        cout<<" ";
        for (int star2 = 0; star2 < i+1; star2++)
        {
            cout<<"*";
        }
        cout<<endl;

    }
    return 0;
}
