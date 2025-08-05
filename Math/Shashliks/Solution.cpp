// Problem link : https://codeforces.com/problemset/problem/2113/A
#include <iostream>
using namespace std;
int main()
{
 
    int t;
    cin >> t;
    while (t--)
    {
 
        int k, a, b, x, y;
        cin >> k >> a >> b >> x >> y;
        if (x > y)
        {
            swap(x, y);
            swap(a, b);
        }
 
        long  ans = 0;
 
        long diffa = k - a;
        if (diffa >= 0)
        {
            long useX = diffa / x + 1;
            ans += useX;
            k -= useX * x;
        }
 
        long diffb = k - b;
        
        if (diffb >= 0)
        {
            ans += diffb / y + 1;
        }
        cout << ans << endl;
    }
 
    return 0;
}
