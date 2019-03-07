/************************
 * 如果一个字符串可以由某个长度为k的字符串重复得到，就可以说该串以k位周期。
 * 输入一个长度不超过80的串，输出它的最小周期
 ************************/

#include<iostream>
#include<string>

using namespace std;

int PeriodicStrings(string &s){
    int ans = 0;    int pos = 0;    int len = s.length();
    bool flag = false;
    if(len <= 1){
        return len;
    }
    ans = 1;
    while(ans < len){
        flag = true;
        for(pos = 0;pos < len;pos++){
            if(s[pos] != s[(pos + ans) % len]){
                flag = false;
                break;
            }
        }
        if(!flag){
            ans += 1;
        } else {
            return ans;
        }
    }
    return len;
}

int main(){
    string s;   int ans = 0;
    while(cin >> s){
        ans = PeriodicStrings(s);
        cout << ans << endl;
    }
    return 0;
}
