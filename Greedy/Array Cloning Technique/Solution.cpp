// Problem link : https://codeforces.com/problemset/problem/1665/B

#include <bits/stdc++.h>
using namespace std;
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--)
    {
        long long n;
        cin >> n;
        map<int, int> mp;
        // Let me store all the values in a map
        for (int i = 0; i < n; i++)
        {
            long long take;
            cin >> take;
            mp[take]++;
        }
        long long ans = 0;
        long long maxFreq = 0;
        // I will get the max freq
        for (auto &p : mp)
        {
            if (p.second > maxFreq)
            {
                maxFreq = p.second;
            }
        }
        while (maxFreq < n)
        {
            // Take the copy of the first array
            ans++;
            if (maxFreq * 2 <= n)
            {
                ans += maxFreq;
                maxFreq *= 2;
            }
            else
            {
                ans += (n - maxFreq);
                maxFreq = n;
            }
        }
        cout << ans << "\n";
    }

    return 0;
}
