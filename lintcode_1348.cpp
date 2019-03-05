#include<iostream>
#include<string> 
using namespace std;

/*
  Enter your function under this line
*/

int titleToNumber(string &s){
	int i = 0;	int ans = 0;
	for(i = 0;i < s.size();i++){
		ans = ans + s[i] - 'A' + 1;
		if(i + 1 < s.size()){
			ans *= 26;
		}
	}
	return ans;
}

/*The Best solution in here*/
/*
int titleToNumber(string &s){
	int ans = 0;
	for(int i = 0;i < s.length();i++){
		ans *= 26;
		ans += s[i] - 'A' + 1;
	}
	return ans;
}
*/

int main(){
	string s;	int ans = 0;
	while(cin >> s){
		ans = titleToNumber(s);
		cout << ans << endl;
	}
	return 0;
}

