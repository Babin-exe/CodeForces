// Problem link : https://codeforces.com/problemset/problem/1696/B

#include <bits/stdc++.h>
using namespace std;

int main()
{
    long long t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int ans = 0;
        vector<int> hehe(n);
        for (int i = 0; i < n; i++)
        {
            cin >> hehe[i];
        }
        for (int i = 0; i < n; i++)
        {
            if (hehe[i] == 0)
                continue;
            ans++;
            while (i < n && hehe[i] != 0)
                i++;
        }
        cout << min(2, ans) << endl;
    }
    return 0;
}
