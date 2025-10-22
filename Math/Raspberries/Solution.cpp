// Problem Link : https://codeforces.com/problemset/problem/1883/C
#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>

using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define f(i, n) for (ll i = 0; i < n; i++)
#define ia(a, n) \
    ll a[n];     \
    f(i, n) cin >> a[i]
#define iv(v, n)     \
    vector<ll> v(n); \
    f(i, n) cin >> v[i]
#define MOD (1000000007)
#define INF 1000000000000000000LL
#define mp make_pair
#define nline '\n'
#define yes cout << "YES\n"
#define no cout << "NO\n"

template <typename T>
using os = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;

template <typename T>
using oms = tree<T, null_type, less_equal<T>, rb_tree_tag, tree_order_statistics_node_update>;

void solve()
{
    ll n, k;
    cin >> n >> k;
    ll even_count = 0;
    vector<ll> a(n);
    ll ans = LONG_MAX;
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
        if (a[i] % k == 0)
            ans = 0;
        if (a[i] % 2 == 0)
            even_count++;

        ans = min(ans, (k - a[i] % k));
    }

    if (k == 4)
    {
        if (even_count == 0)
        {
            ans = min(ans, 2LL);
        }
        if (even_count == 1)
        {
            ans = min(ans, 1LL);
        }
        if (even_count >= 2)
        {
            ans = min(ans, 0LL);
        }
    }
    cout << ans << nline;
}

int main()
{
#ifdef BABIN
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    clock_t T = clock();
#endif

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    long long t = 1;
    cin >> t;

    while (t--)
    {
        solve();
    }

#ifdef BABIN
    cout << "\nTime taken: " << ((float)(clock() - T)) / CLOCKS_PER_SEC << " seconds";
#endif
    return 0;
}
