public class Solution{
	/*
	������������ aa �� bb , �����ǵĺ�
	*/
	public int LintCode_1(int a,int b){
		return a + b;
	}
	
	/*
	���һ���㷨�������n�׳���β����ĸ���
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