/*************************
 * 给出一个由O和X组成的串（长度为1~80），统计每个字符的得分之和。每个O的得分位已经连续出现
 * O的个数，X的得分为0.
 * ex：OOXXOXXOOO 得分为1+2+0+0+1+0+1+2+3
 **************************/


#include<iostream>
#include<string>

using namespace std;

int sorce_string(string s){
    int tmp = 0;    int sum = 0;    int pos = 0;
    for(pos = 0;pos < s.length();pos++){
        if(s[tmp] == 'O'){
            tmp += 1;
        } else {
            tmp = 0;
        }
        sum += tmp;
    }
    return sum;
}

int main(){
    string s;   int sum = 0;
    while(cin >> s){
        sum = sorce_string(s);
        cout << sum << endl;
    }
    return 0;
}

/************* Example code ****************
 *
int main(){
    int T;  char buf[128];
    scanf("%d\n",&T);
    while(T--){
        gets(buf);
        int cnt = 0,    sum = 0,    sz = strlen(buf);
        _for(i,0,sz){
            if(buf[i] == 'O')   sum += (++cnt);
            else cnt = 0;
        }
        printf("%d\n",sum);
    }
    return 0;
}
*
*******************************************/
