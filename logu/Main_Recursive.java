import java.io.*;
import java.util.*;

public class Main_Recursive{
	public static void main(String[] args) {
		Main_Recursive sol = new Main_Recursive();
		sol.P1028();
	}
	
	// Luogu P1028
	// Ҫ���ҳ����������������ĸ���(�����������Ȼ��nn):������һ����Ȼ��n(n n��1000),
	// Ȼ��Դ���Ȼ���������·������д���:�����κδ���;��������߼���һ����Ȼ��,������Ȼ�����ܳ���ԭ����һ��;
	// ��������,�������˹�����д���,ֱ�������ټ���Ȼ��Ϊֹ.
	
	public static void P1028() {
		int n = 0;	int[] ans = new int[1002];
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		for(int i = 0;i <= n;i++) {
			ans[i] = 1;
		}
		for(int i = 2;i <= n;i++) {
			for(int j = 1; j <= i / 2;j++) {
				ans[i] += ans[j]; 
			}
		}
		System.out.println(ans[n]);
		return;
	}
	
}