// Problem link : https://codeforces.com/problemset/problem/1624/B

#include <bits/stdc++.h>
using namespace std;
using ll = long long;
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--)
    {

        ll a, b, c;
        cin >> a >> b >> c;
        if (a != 0 && (2 * b - c) > 0 && (2 * b - c) % a == 0)
        {
            cout << "YES" << "\n";
            continue;
        }
        else if (b != 0 && (a + c) > 0 && (a + c) % (2 * b) == 0)
        {
            cout << "YES" << "\n";
            continue;
        }
        else if (c != 0 && (2 * b - a) > 0 && (2 * b - a) % c == 0)
        {
            cout << "YES" << "\n";
            continue;
        }
        else
        {
            cout << "NO" << "\n";
        }
    }

    return 0;
}
