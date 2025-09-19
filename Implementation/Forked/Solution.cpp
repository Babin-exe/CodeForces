//  Problem link : https://codeforces.com/problemset/problem/1904/A

#include <bits/stdc++.h>
int dx[4] = {1, -1, -1, 1}, dy[4] = {1, 1, -1, -1};
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        long long a, b;
        cin >> a >> b;
        long long x_king, y_king;
        cin >> x_king >> y_king;
        long long x_queen, y_queen;
        cin >> x_queen >> y_queen;

        set<pair<int, int>> k, q;
        for (int i = 0; i < 4; i++)
        {
            k.insert({x_king + dx[i] * a, y_king + dy[i] * b});
            k.insert({x_king + dx[i] * b, y_king + dy[i] * a});
            q.insert({x_queen + dx[i] * a, y_queen + dy[i] * b});
            q.insert({x_queen + dx[i] * b, y_queen + dy[i] * a});
        }
        int ans = 0;
        for (auto pos : k)
        {
            if (q.find(pos) != q.end())
            {
                ans++;
            }
        }
        cout << ans << endl;
    }
    return 0;
}
