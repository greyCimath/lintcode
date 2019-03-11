#include<iostream>
#include<vector>

using namespace std;

bool canPlaceFlowers(vector<int> &flowerbed,int n){
    int i = 0;  int len = flowerbed.size();
    for(i = 0;i < len && n > 0;i++){
        if(!flowerbed[i]){
            if(i == 0 && flowerbed[i + 1] == 0){
                n -= 1;
                flowerbed[i] = 1;
            }else if(i == len - 1 && flowerbed[i - 1] == 0){
                n -= 1;
                flowerbed[i] = 1;
            }else if(flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                n -= 1;
                flowerbed[i] = 1;
            }
        }
    }
    if(n){
        return false;
    }else {
        return true;
    }
}

int main(){
    vector<int> flowerbed;  int n = 0;  int tmp = 0;
    bool ans = false;
    cin >> n;
    while(cin >> tmp){
        flowerbed.push_back(tmp);
    }
    ans = canPlaceFlowers(flowerbed,n);
    if(ans){
        cout << "True" << endl;
    }else {
        cout << "False" << endl;
    }

    return 0;
}
