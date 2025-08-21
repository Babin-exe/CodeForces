// Problem link : https://codeforces.com/problemset/problem/2130/A


#include <iostream>
using namespace std;
int main()
{

    int t;
    cin >> t;
    while (t--)
    {

        unsigned int n;
        cin >> n;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            int inp;
            cin >> inp;
            sum += max(inp, 1);
        }
        cout << sum << endl;
    }

    return 0;
}
