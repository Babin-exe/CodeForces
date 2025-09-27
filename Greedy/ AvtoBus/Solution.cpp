// Problem Link : https://codeforces.com/problemset/problem/1679/A 

#include <bits/stdc++.h>
using namespace std;
using ll = long long;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        ll n;
        cin >> n;
        if (n < 4 || n % 2 != 0)
        {
            cout << -1 << endl;
        }
        else
        {
            ll maxi = n / 4;
            ll mini = ceil(n * 1.0 / 6);
            cout << mini << " " << maxi << endl;
        }
    }
    return 0;
}
