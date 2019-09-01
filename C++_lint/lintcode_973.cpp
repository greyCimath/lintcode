#include<iostream>
#include<vector>

using namespace std;

bool isOneBitCharacter(vector<int> &bits){
    int pos = 0;
    while(pos < bits.size()){
        if(pos == bits.size() - 1){
            return true;
        } else if(pos == bits.size()){
            return false;
        }
        if(bits[pos] == 0){
            pos += 1;
        } else {
            pos += 2;
        }
    }
}

int main(){
    vector<int> bits;   int tmp = 0;    bool ans = false;
    while(cin >> tmp){
        bits.push_back(tmp);
    }
    ans = isOneBitCharacter(bits);
    if(ans){
        cout << "True";
    } else{
        cout << "False";
    }
    cout << endl;

    return 0;
}
