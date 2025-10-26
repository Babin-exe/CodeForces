// Problem Link : https://codeforces.com/problemset/problem/1840/C
#include <bits/stdc++.h>
using namespace std;
#define ll long long
int main()
{
    long long t;
    cin >> t;
    while (t--)
    {
        ll n, k, q;
        cin >> n >> k >> q;
        vector<ll> a(n);
        for (int i = 0; i < n; i++)
        {
            cin >> a[i];
            a[i] = (a[i] > q) ? 0 : 1;
        }

        ll count_of_1s = 0;
        ll ways = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] == 1)
                count_of_1s++;
            else
            {

                if (count_of_1s >= k)
                {
                    ll diff = count_of_1s - k + 1;
                    ways += (diff * (diff + 1)) / 2;
                }
                count_of_1s = 0;
            }
        }

        if (count_of_1s >= k)
        {
            ll diff = count_of_1s - k + 1;
            ways += (diff * (diff + 1)) / 2;
        }

        cout << ways << endl;
    }
    return 0;
}
