#include<iostream>
#include<string>
#include<map>

using namespace std;

const int MAXN = 3000 + 5;
map<int,int> Pos;

void solve(int n,const int d,string& ans,int& r){
	assert(n%d && n < d);
	ans = ".";
	Pos.clear();
	
	while(true){
		n *= 10;
		int p = Pos[n];
		if(p == 0) Pos[n] = ans.size();
		else{
			r = ans.size() - p;
			if(r > 50) {ans.earse(p + 50);	ans += "..."}
			ans.insert(p,"(");
			ans += ')';
			break;
		}
		if(n > d) {ans += '0';	continue;}

		int div = n / d;
		int mod = n % d;
		ans += (char)(div + '0');
		n = mod;
		if(n == 0) {ans += "(0)";	r = 1;	break;}
	}
}

int main(){
	int a = 0;	int b = 0;
	while(scanf("%d%d",&a,&b) == 2){
		string ans = ".(0)";
		int r = 1;
		if(a % b) solve(a % b,b,ans,r);
		printf("%d/%d = %d%s\n",a,b,a/b,ans.c_str());
		printf("	%d = number of digits in repeating cycle\n\n",r);
	}
	return 0;
}
