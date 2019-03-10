#include<iostream>
#include<vector>

using namespace std;

int islandPerimeter(vector<vector<int> > &grid){
	int ans = 0;	int i = 0;	int j = 0;
	for(i = 0;i < grid.size();i++){
		for(j = 0;j < grid[0].size();j++){
			if(grid[i][j]){
				ans += (i == 0 || !grid[i - 1][j])
					 + (i == grid.size() - 1 || !grid[i + 1][j])
					 + (j == 0 || !grid[i][j - 1])
					 + (j == grid[0].size() || !grid[i][j + 1]);
			}
		}
	}
	return ans;
}

int main(){
	vector<vector<int> > grid;	int tmp = 0;	
	int width = 0;	int hight = 0;	int i = 0;	int j = 0;
	int ans = 0;

	cin >> hight >> width;
	grid.resize(hight,vector<int>(width));
	for(i = 0;i < hight;i++){
		for(j = 0;j < width;j++){
			cin >> tmp;
			grid[i][j] = tmp;
		}
	}

	cout << islandPerimeter(grid) << endl;

	return 0;
}
