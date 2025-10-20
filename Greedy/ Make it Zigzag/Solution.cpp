

// Problem Link : https://codeforces.com/contest/2154/problem/B


#include <bits/stdc++.h>
using namespace std;

void solve() {
    long long n;
    cin >> n;
    vector<long long> a(n);
    for (int i = 0; i < n; i++) cin >> a[i];

    long long maxi = a[0];
    long long ans = 0;

    for (int i = 1; i < n; i++) {
        if (i % 2 != 0) { // odd index
            a[i] = max(a[i], maxi);
        }
        maxi = max(maxi, a[i]);
    }

    for (int i = 0; i < n; i += 2) {
        long long mini = LLONG_MAX;

        if (i - 1 >= 0) mini = min(mini, a[i - 1]);
        if (i + 1 < n) mini = min(mini, a[i + 1]);

        if (a[i] >= mini) {
            ans += (a[i] - mini + 1);
        }
    }

    cout << ans << "\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}
