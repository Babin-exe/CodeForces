// Problem link : https://codeforces.com/problemset/problem/1794/B
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
        vector<int> hehe(n);
        cin >> hehe[0];
        if (hehe[0] == 1)
            hehe[0] = 2;
        for (int i = 1; i < n; i++)
        {
            int take;
            cin >> take;
            if (take == 1)
                take = 2;
            if (take % hehe[i - 1] == 0)
                hehe[i] = (take + 1);
            else
                hehe[i] = take;
        }
        for (int i = 0; i < n; i++)
        {
            cout << hehe[i] << " ";
        }
        cout << endl;
    }
    return 0;
}
