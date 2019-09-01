#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

int maximumProduct(vector<int> &nums){
    int a = 0;  int b = 0;  int len = nums.size();
    sort(nums.begin(),nums.end());
    a = nums[0] * nums[1] * nums[len - 1];
    b = nums[len - 1] * nums[len - 2] * nums[len - 3];
    if(a > b){
        return a;
    }else {
        return b;
    }
}

int main(){
    int tmp = 0;    vector<int> nums;
    while(cin >> tmp){
        nums.push_back(tmp);
    }
    tmp = maximumProduct(nums);
    cout << tmp << endl;

    return 0;
}
