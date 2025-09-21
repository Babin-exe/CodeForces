// Problem link : https://codeforces.com/contest/1878/problem/C

// #include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        long long n, k, x;
        cin >> n >> k >> x;
        long long left_sum = 0, right_sum = 0;
        left_sum = k * (k + 1) / 2;
        long long a = (n - k);
        right_sum = (n * (n + 1) / 2) - (a * (a + 1) / 2);
        if (left_sum <= x && x <= right_sum)
        {
            cout << "YES" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }

    return 0;
}
