#include<iostream>
#include<vector>
#include<climits>
using namespace std;

bool isPowerOfFour(int num){
    vector<int> data = {1,4,16,64,256,1024,4096,16384,65536,262144,
                        1048576,4194304,16777216,67108864,268435456,1073741824};
    int i = 0;  bool flag = false;
    if(num < 1){
        return false;
    }
    for(i = 0;data[i] < num && i < data.size();i++){
        if(num == data[i]){
            flag = true;
            break;
        } else if(num < data[i]){
            flag = false;
            break;
        }
    }
    return flag;
}

int main(){
    int num = 0;    bool ans = false;
    while(cin >> num){
        ans = isPowerFour(num);
        if(ans){
            cout << "True" << endl;
        }else {
            cout << "False" << endl;
        }
    }
    return 0;
}
