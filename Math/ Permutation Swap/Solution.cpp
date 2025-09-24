// Problem link : https://codeforces.com/problemset/problem/1828/B

// Taking inp - i gives us the distance to travel so %k must be ==0 to make sure we can travel the gap 
// we know from a set of values to find a (max)x which divides all we must take gcd

#include <bits/stdc++.h>
using namespace std;

int main()
{
    long long  t;
    cin >> t;
    while (t--)
    {
        long long n;
        cin >> n;
        long long hehe;
        long long ans = 0;
        for (long long i = 1; i <= n; i++)
        {
            cin >> hehe;
            ans = gcd(ans, abs(hehe - i));
        }
        cout << ans << endl;
    }

    return 0;
}
