/*********************
 * 把前n（N <= 10000)个整数按顺序写在一起：1234567891011...数一数0~9各出现多少次
 * 输出10个整数，分别是0,1,2,3，...，9出现的次数
 */

#include<iostream>
#include<string>
#include<vector>

using namespace std;

void DigitCounting(string &s){
    vector<int> ANS(10,0);  int pos = 0;    int tmp = 0;
    for(pos = 0;pos < s.length();pos++){
        tmp = s[pos] - '0';
        ANS[tmp] += 1;
    }
    for(pos = 0;pos < ANS.size();pos++){
        cout << ANS[pos] << " ";
    }
    cout << endl;
}

int main(){
    string s;
    while(cin >> s){
        DigitCounting(s);
    }
    return 0;
}
