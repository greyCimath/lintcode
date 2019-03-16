#include<iostream>
#include<string>

using namespace std;

string convertToBase7(int num){
    string s = "";  bool flag = true;
    if(num < 0){
        flag = false;
        num = -num;
    }
    while(num){
        s = to_string(num % 7) + s;
        num /= 7;
    }
    if(!flag){
        s = "-" + s;
    }
    return s;
}

int main(){
    int num = 0;
    while(cin >> num){
        string s;
        s = convertToBase7(num);
        cout << s << endl;
    }
    return 0;
}
