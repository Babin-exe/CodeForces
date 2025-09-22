// Problem link : https://codeforces.com/problemset/problem/1855/B

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {

        long long n;
        cin >> n;
        if (n % 2 == 1)
        {
            cout << 1 << endl;
        }
        else
        {
            int ans = 1;
            for (int i = 2;; i++)
            {
                if (n % i == 0)
                    ans++;
                else
                    break;
            }
            cout << ans << endl;
        }
    }
    return 0;
}
