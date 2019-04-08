#include<iostream>
#include<vector>

using namespace std;

vector<int> subbarySum(vector<int> &nums){
	vector<int> ans;	int pos = 0;	int ppos = 0;	int sum = 0;
	for(pos = 0;pos < nums.size() - 1;pos++){
		if(nums[pos] == 0){
			ans.push_back(pos);
			return ans;
		}
		sum = nums[pos];
		for(ppos = pos + 1;ppos < nums.size();ppos++){
			sum += nums[ppos];
			if(sum == 0){
				ans.push_back(pos);
				ans.push_back(ppos);
				return ans;
			}
		}
	}
}

int main(){
	vector<int> nums;	vector<int> ans;
	int num = 0;
	
	while(cin >> num){
		nums.push_back(num);
	}

	ans = subbarySum(nums);
	
	cout << "[";
	for(num = 0;num < ans.size() - 1;num++){
		cout << nums[num] << " ";
	}
	cout << nums[num] << "]" << endl;
}
