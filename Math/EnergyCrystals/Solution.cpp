// Problem link: https://codeforces.com/problemset/problem/2111/A/
#include <iostream>
using namespace std;
int main()
{

    int t;
    cin >> t;
    while (t--)
    {

        unsigned int x;
        cin >> x;
        int bits = 64 - __builtin_clzll(x);
        cout << 2 * bits + 1 << "\n";
    }

    return 0;
}
