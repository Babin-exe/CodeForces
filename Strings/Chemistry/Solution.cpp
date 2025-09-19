// Problem link : https://codeforces.com/problemset/problem/1883/B
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, k;
        cin >> n >> k;
        string s;
        cin >> s;
        int arr[26] = {0};
        for (int i = 0; i < n; i++)
        {
            arr[s[i] - 'a']++;
        }

        int odd_count = 0;
        for (int i = 0; i < 26; i++)
        {
            if (arr[i] % 2 != 0)
                odd_count++;
        }
        if (odd_count - k <= 1)
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
