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
	/*
	计算数字 k 在 0 到 n 中的出现的次数，k 可能是 0~9 的一个值。
	*/
	public int LintCode_3(int k,int num){
		int ans = 0;	int tmp = 0;
		if(num == 0 && k == 0){
			ans = 1;
			return ans;
		}else if(num == 0 && k != 0){
			return ans;
		}else if(k < 0){
			return ans;
		}else{
			for(int i = 0;i <= num;i++){
				tmp = i;
				while(tmp > 0){
					tmp = tmp % 10;
					if(tmp == k){
						ans += 1;
					}
					tmp /= 10;
				}
			}
			return ans;
		}	
	}
}