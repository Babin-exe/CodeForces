// Problem Link : https://codeforces.com/problemset/problem/1543/A
#include <bits/stdc++.h>
using namespace std;

int main()
{

    int t;
    std::cin >> t;

    while (t--)
    {
        long long a, b;
        cin >> a >> b;
        if (a == b)
        {
            cout << "0 0" << "\n";
            continue;
        }
        if (a > b)
            swap(a, b);
        long long g = b - a;
        long long mod = b % g;

        cout << g << " " << min(mod, g - mod) << "\n";
    }

    return 0;
}
