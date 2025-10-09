// Problem Link : https://codeforces.com/problemset/problem/1559/A

#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--)
    {
        int n;
        cin >> n;
        vector<long> hehe(n);
        for (int i = 0; i < n; i++)
        {
            cin >> hehe[i];
        }
        long val = hehe[0];
        for (int i = 1; i < n; i++)
        {
            val &= hehe[i];
        }
        cout << val << "\n";
    }

    return 0;
}
