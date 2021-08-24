#include<iostream>

using namespace std;

int main ()
{
    int n;
    // Taking user input
    cout << "Enter Number of rows: " << endl;
    cin >> n;

    // Using nested for loops for printing rows and columns
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            cout << i * j << "  ";
        }
        // Printing new lines after every row ends
        cout<<endl;
    }
}
