// Problem Link : https://codeforces.com/problemset/problem/1725/B

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

    int n;
    long long d;
    cin >> n >> d;

    vector<long long> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i];

    sort(a.begin(), a.end(), greater<long long>());

    ll i = 0;
    ll j = n - 1;
    ll ans = 0;

    while (i <= j)
    {
        long long power = a[i];
        if (power <= 0)
            break;

        long long k = (d / power) + 1;

        if (j - i + 1 >= k)
        {
            ans++;
            i++;
            j -= (k - 1);
        }
        else
        {
            break;
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

    // long long t = 1;
    // cin >> t;

    // while (t--)
    // {
    solve();
    // }

#ifdef BABIN
    cout << "\nTime taken: " << ((float)(clock() - T)) / CLOCKS_PER_SEC << " seconds";
#endif
    return 0;
}
