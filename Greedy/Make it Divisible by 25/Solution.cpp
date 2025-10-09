// Problem Link : https://codeforces.com/problemset/problem/1593/B
#include <bits/stdc++.h>
using namespace std;
int give(const string &n, const string &hehe) {
    int index = hehe.size() - 1;
    int ans = 0;
    for (int i = n.size() - 1; i >= 0; i--) {
        if (n[i] == hehe[index]) {
            index--;
            if (index < 0)
                break;
        } else {
            ans++;
        }
    }
    if (index >= 0) 
        return INT_MAX;
    return ans;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--) {
        long long x;
        cin >> x;
        string n = to_string(x);
        string hehe[4] = {"00", "25", "50", "75"};

        int ans = INT_MAX;
        for (int i = 0; i < 4; i++) {
            ans = min(ans, give(n, hehe[i]));
        }
        cout << ans << "\n";
    }

    return 0;
}
