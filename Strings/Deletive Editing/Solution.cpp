// Problem link : https://codeforces.com/problemset/problem/1666/D

#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string s, t;
        cin >> s >> t;
        vector<int> freq(26, 0);
        int m = s.length();
        int n = t.length();
        string hehe = "";
        for (int i = 0; i < n; i++)
        {
            freq[t[i] - 'A']++;
        }
        for (int i = m - 1; i >= 0; i--)
        {
            if (freq[s[i] - 'A'] > 0)
            {
                freq[s[i] - 'A']--;
                hehe += s[i];
            }
        }
        reverse(begin(hehe), end(hehe));
        if (t == hehe)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
    return 0;
}
