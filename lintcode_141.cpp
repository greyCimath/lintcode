#include<iostream>
#include<cmath>

using namespace std;

int sqrt(int x){
	double tmp = 1.0;	double e = 1.0;
	int ans = 0;
	if(x < 0){
		return -1;
	}
	if(x == 0){
		return 0;
	}
	while(e > 0.1){
		tmp = tmp - (tmp * tmp - x) / (2 * tmp);
		e = abs(tmp * tmp - x);
	}
	ans = floor(tmp);
	return ans;
}

int main(){
	int x = 0;	int ans = 0;
	while(cin >> x){
		ans = sqrt(x);
		cout << ans << endl;
	}
	return 0;
}
