public class Solution{
	/*
	给出两个整数 aa 和 bb , 求他们的和
	*/
	public int LintCode_1(int a,int b){
		return a + b;
	}
	
	/*
	设计一个算法，计算出n阶乘中尾部零的个数
	*/
	public int LintCode_2(int num){
		int ans = 0;
		if(num < 5){
			return ans;
		}else{
			while(num > 0){
				num /= 5;
				ans += num;
			}
			return ans;
		}
	}
}