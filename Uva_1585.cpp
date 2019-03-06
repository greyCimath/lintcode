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
