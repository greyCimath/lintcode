#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

template<typename T>
ostream& operator<<(ostream& os,const vector<T>& v){
    for(int i = 0;i < v.size();i++){
        os << v[i] << " ";
    }
    return os;
}

int arrayPairSum(vector<int> &nums){
    int pos = 0;    int ans = 0;
    sort(nums.begin(),nums.end());
    for(pos = 0;pos < nums.size();pos += 2){
        ans += nums[pos];
    }

    return ans;
}

/*
int readInt(){
    int x = 0;
    cin >> x;
    return x;
}
*/

int main(){
    vector<int> nums;   int n = 0;  int tmp = 0;
    cin >> n;
    n *= 2;
    while(n--){
        cin >> tmp;
        nums.push_back(tmp);
    }
    //cout << nums;

    tmp = arrayPairSum(nums);
    cout << tmp << endl;

    return 0;
}
