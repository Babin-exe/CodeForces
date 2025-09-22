// Problem link : https://codeforces.com/problemset/problem/1850/D

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
        vector<int> take(n);
        for (int i = 0; i < n; i++)
            cin >> take[i];
        sort(begin(take), end(take));
        if (n == 1)
            cout << 0 << endl;
        else
        {

            int val = 1;
            int i = 0, j = 1;

            while (j < n)
            {
                if (take[j] - take[j - 1] <= k)
                {
                    val = max(val, j - i + 1);
                    j++;
                }
                else
                {
                    i = j;
                    j++;
                }
            }
            cout << n - val << endl;
        }
    }

    return 0;
}
