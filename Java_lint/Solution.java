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
	/*
	�������� k �� 0 �� n �еĳ��ֵĴ�����k ������ 0~9 ��һ��ֵ��
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