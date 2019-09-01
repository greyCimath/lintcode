#include<iostream>
#include<cmath>

using namespace std;

int arrangeCoins(int num){
    double n = num;     double e = 1.0;
    double x_0 = 1.0;   int ans = 0;
    while(e >= 0.05){
        x_0 = x_0 - (x_0 * x_0 + x_0 - 2 * n) / (2 * x_0 + 1);
        e = x_0 * (x_0 + 1) - 2 * n;
        e = abs(e);
    }
    ans = floor(x_0);
    return ans;
}

int main(){
    int num = 0;    int ans = 0;
    while(cin >> num){
        ans = arrangeCoins(num);
        cout << ans << endl;
    }
    return 0;
}
