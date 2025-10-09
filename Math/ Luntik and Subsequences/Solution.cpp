// Problem Link : https://codeforces.com/problemset/problem/1582/B
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
        int zero_count = 0;
        int one_count = 0;
        for (int i = 0; i < n; i++)
        {
            long long take;
            cin >> take;
            if (take == 1)
                one_count++;
            else if (take == 0)
                zero_count++;
        }

        cout << one_count * (1LL << zero_count) << "\n";
    }

    return 0;
}
