/*******************************************************
* 输入m个长度为n的DNA序列，求一个DNA序列，到所有序列的总
* Hamming距离尽量小。两个等长字符串的Hamming距离等于字符
* 不同的位置个数
********************************************************/

#include<iostream>
#include<string>
#include<vector>

using namespace std;

string DNAConsensus(vector<vector<char> > &s){
}

int main(){
	vector<vector<char> > DNAdata;	int m = 0;	int n = 0;
	string resyh;
	int i = 0;	int j = 0;
	cin >> m >> n;
	for(i = 0;i < m;i++){
		vector<char> dna_tmp;
		for(j = 0;j < n;j++){
			char ch;
			cin >> ch;
			dna_tmp.push_back(ch);
		}
		DNAdata.push_back(dna_tmp);
	}
	res = DNAConsensus(DNAdata);
	cout << res << endl;
	
	return 0;
}
