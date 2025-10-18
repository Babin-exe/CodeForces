// Problem Link :  https://codeforces.com/contest/2162/problem/B

#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
// #pragma GCC optimize("Ofast")
// #pragma GCC optimize("unroll-loops")

using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ld long double
#define all(x) (x).begin(), (x).end()
#define f(i, n) for (ll i = 0; i < (n); i++)
#define ia(a, n) \
    ll a[n];     \
    f(i, n) cin >> a[i]
#define iv(v, n)     \
    vector<ll> v(n); \
    f(i, n) cin >> v[i]
#define MOD 1000000007
#define INF 1000000000000000000LL
#define mp make_pair
#define pb push_back
#define nline '\n'
#define yes cout << "YES\n"
#define no cout << "NO\n"

template <typename T>
using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;

template <typename T>
using ordered_multiset = tree<T, null_type, less_equal<T>, rb_tree_tag, tree_order_statistics_node_update>;

// ⚙️ Utility functions
ll gcd(ll a, ll b) { return b == 0 ? a : gcd(b, a % b); }
ll lcm(ll a, ll b) { return (a / gcd(a, b)) * b; }

bool isPowerOfTwo(ll n) { return n > 0 && (n & (n - 1)) == 0; }

void solve()
{

    ll n;
    cin >> n;
    string s;
    cin >> s;
    cout << count(begin(s), end(s), '0') << nline;
    
    f(i, n) if (s[i] == '0')
    {
        cout << i + 1 << " ";
    }
    cout << nline;
}

int main()
{
#ifdef BABIN
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    clock_t T = clock();
#endif

    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    ll t = 1;
    cin >> t;
    while (t--)
    {
        solve();
    }

#ifdef BABIN
    cerr << "\nTime taken: " << fixed << setprecision(6)
         << (double)(clock() - T) / CLOCKS_PER_SEC << "s\n";
#endif
    return 0;
}
