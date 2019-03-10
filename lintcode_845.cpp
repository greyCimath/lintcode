#include<iostream>

using namespace std;

int gcd(int a,int b){
    int tmp = 0;
    if(a == b){
        return a;
    }else if(a < b){
        tmp = a;
        a = b;
        b = tmp;
    }
    tmp = a % b;
    if(tmp == 0){
        return b;
    }else {
        a = b;
        b = tmp;
        return gcd(a,b);
    }
}

int main(){
    int a = 0;  int b = 0;  int ans = 0;
    while(cin >> a >> b){
        ans = gcd(a,b);
        cout << ans << endl;
    }

    return 0;
}
