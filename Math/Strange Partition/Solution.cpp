// Problem Link : https://codeforces.com/problemset/problem/1471/A

#include <bits/stdc++.h>
using namespace std;

int main()
{

    int t;
    std::cin >> t;

    while (t--)
    {
        long long n, x;
        cin >> n >> x;
        long long maxi = 0;
        long long mini = 0;
        for (int i = 0; i < n; i++)
        {
            long long a;
            cin >> a;
            maxi += (a + x - 1) / x;
            mini += a;
        }
        mini = (mini + x - 1) / x;
        cout << mini << " " << maxi << "\n";
    }

    return 0;
}
