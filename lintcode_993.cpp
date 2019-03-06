#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int arrayPairSum(vector<int> &nums){
    int pos = 0;    int ans = 0;
    sort(nums.begin(),nums.end());
    while(pos < nums.size()){
        ans += (nums[pos] ? nums[pos + 1] : nums[pos] <= nums[pos + 1]);
        cout << ans << endl;
        pos += 2;
    }
    return ans;
}

int main(){
    vector<int> nums;   int n = 0;  int tmp = 0;
    cin >> n;
    while(--n){
        cin >> tmp;
        nums.push_back(tmp);
    }
    tmp = arrayPairSum(nums);
    cout << tmp << endl;

    return 0;
}
