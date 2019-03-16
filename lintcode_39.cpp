#include<iostream>
#include<vector>

using namespace std;

void recoverRotatedSortedArray(vector<int> &nums){
    int i = 0;  int time = 0;   int len = nums.size();
    int tmp = 0;
    for(i = 0;i < len - 1;i++){
        if(nums[i] > nums[i + 1]){
            time = len - i - 1;
            break;
        }
    }
    while(time--){
        tmp = nums[len - 1];
        for(i = len - 2;i >= 0;i--){
            nums[i + 1] = nums[i];
        }
        nums[0] = tmp;
    }
}

int main(){
    vector<int> nums;   int tmp = 0;
    while(cin >> tmp){
        nums.push_back(tmp);
    }
    recoverRotatedSortedArray(nums);
    for(tmp = 0;tmp < nums.size();tmp++){
        cout << nums[tmp] << " ";
    }
    cout << endl;

    return 0;
}
