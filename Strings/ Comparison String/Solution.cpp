// Problem link : https://codeforces.com/contest/1837/problem/B
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        string s;
        cin >> s;
        int hehe = 1;
        int auh = 1;
        for (int i = 1; i < n; i++)
        {
            if (s[i - 1] == s[i])
            {

                auh++;
            }
            else
            {

                hehe = max(hehe, auh);
                auh = 1;
            }
        }
        hehe = max(hehe, auh);
        cout << hehe + 1 << endl;
    }

    return 0;
}
