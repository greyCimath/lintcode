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

int findContentChildren(vector<int> &g,vector<int> &s){

}

int main(){
    vector<int> child;  vector<int> cookies;
    int tmp = 0;
    while(cin >> tmp){
        child.push_back(tmp);
    }
    tmp = 0;
    while(cin >> tmp){
        cookies.push_back(tmp);
    }
    cout << cookies;
    cout << endl;

    return 0;
}
