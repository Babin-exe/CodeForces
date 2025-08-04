// Problem link : https://codeforces.com/problemset/problem/2117/A

#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, x;
        cin >> n >> x;
 
        int mini = INT_MAX, maxi = INT_MIN;
 
        for (int i = 0; i < n; i++)
        {
            int val;
            cin >> val;
            if (val == 1)
            {
                if (i < mini)
                    mini = i;
                if (i > maxi)
                    maxi = i;
            }
        }
 
        if (maxi - mini + 1 <= x)
            cout << "YES\n";
        else
            cout << "NO\n";
    }
 
    return 0;
}
