#include<iostream>
#include<string>
using namespace std;

/*
  Enter your function under this line
*/
bool isVowel(char c){
	bool ans = false;
	if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
	   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
	   	ans = true;
	   }
	return ans;
}

string reverseVowels(string &s){
	int front = 0;	int behind = s.length() - 1;
	bool fro = false;	bool beh = false;
	while(front < behind){
		fro = isVowel(s[front]);
		beh = isVowel(s[behind]);
		if(!fro){
			front++;
		} else if(!beh){
			behind--;
		} else{
			swap(s[front],s[behind]);
			front++;
			behind--;
		}
	}
	//cout << s << endl;
	return s;
}

int main(){
	string s;	int i = 0;	bool flag = false;
	while(cin >> s){
		s = reverseVowels(s);
	}
	return 0;
}

