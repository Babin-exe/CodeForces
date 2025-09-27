// Problem link : https://codeforces.com/problemset/problem/1675/B
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
        vector<int> hehe(n);
        for (ll i = 0; i < n; i++)
            cin >> hehe[i];
        ll ans = 0;
        for (ll i = n - 2; i >= 0; i--)
        {
            while (hehe[i] >= hehe[i + 1])
            {
                ans++;
                hehe[i] /= 2;
                if (hehe[i] == 0)
                    break;
            }
            if (hehe[i] == 0 && hehe[i + 1] == 0)
            {
                ans = -1;
                break;
            }
        }
        cout << ans << endl;
    }
    return 0;
}
