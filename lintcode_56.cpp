#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

/*
vector<int> twoSum(vector<int> &numbers,int target){
	vector<int> ans;	int fro = 0;	int beh = 0;	bool status = false;
	for(fro = 0;fro < numbers.size() - 1;fro++){
		for(beh = fro + 1;beh < numbers.size();beh++){
			if(numbers[fro] + numbers[beh] == target){
				ans.push_back(fro);
				ans.push_back(beh);
				status = true;
				break;
			}
		}
	}
	if(!status){
		ans.push_back(-1);
		ans.push_back(-1);
	}
	return ans;
}
*/
vector<int> twoSum(vector<int> &numbers,int target){
	vector<int> ans;	
	int fro = 0;	int beh = 0;	bool status = false;	int sum = 0;
	sort(numbers.begin(),numbers.end());
	for(fro = 0;fro < numbers.size() - 1;fro++){
		for(beh = fro + 1;beh < numbers.size();beh++){
			sum = numbers[fro] + numbers[beh];
			if(sum == target){
				ans.push_back(fro);
				ans.push_back(beh);
				status = true;
				break;
			} else if(sum > target){
				break;
			}
		}
		if(status){
			break;
		}
	}
	if(!status){
		ans.push_back(-1);
		ans.push_back(-1);
	}
	return ans;
}

void print_ans(vector<int> &ans){
	cout << ans[0] << " " << ans[1] << endl;
}

int main(){
	vector<int> numbers;	int tmp = 0;	int target = 0;
	vector<int> ans;
	cin >> target;
	while(cin >> tmp){
		numbers.push_back(tmp);
	}
	ans = twoSum(numbers,target);
	print_ans(ans);

	return 0;
}
