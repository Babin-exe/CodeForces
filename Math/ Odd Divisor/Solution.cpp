// Problem Link : https://codeforces.com/problemset/problem/1475/A

#include <bits/stdc++.h>
using namespace std;

int main()
{

    int t;
    std::cin >> t;

    while (t--)
    {
        long long n;
        cin >> n;
        if (n > 0 && (n & (n - 1)) == 0)
            cout << "NO" << "\n";
        else
            cout << "YES" << "\n";
    }

    return 0;
}
