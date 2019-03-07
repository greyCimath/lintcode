/***********************
 * 给出一个物质的分子式（不带括号），求分子量。本题中只包含4种院子，分别位C H O N
 * 原子量分别为12.01,1.008,16.00,14.01.
 * *********************/

#include<iostream>
#include<string>
/*
double Molar[256];
Molar['C'] = 12.01,Molar['H'] = 1.008,Molar['O'] = 16.00,Molar['N'] = 14.01;
*/
using namespace std;

double MolarMass(string &s){
    int pos = 0;    int len = s.length();   int num = 0;
    int tmp = 0;    double ans = 0.0;
    double Molar[256];
    Molar['C'] = 12.01,Molar['H'] = 1.008,Molar['O'] = 16.00,Molar['N'] = 14.01;
    while(pos < len){
        num = 1;
        if(isupper(s[pos])){
            num = 0;   tmp = 1;
            if(!isdigit(s[pos + 1])){
                num = 1;
            } else {
                for(tmp = 1;isdigit(s[pos + tmp]);tmp++){
                    num += num * 10 + s[pos + tmp] - '0';
                }
            }
            ans += Molar[s[pos]] * num;
        }
        pos += tmp;
    }
    return ans;
}

int main(){
    string s;   double ans = 0.0;
    while(cin >> s){
        ans = MolarMass(s);
        cout << ans << endl;
    }
    return 0;
}
