import java.io.*;
import java.util.*;

public class Main_Recursive{
	public static void main(String[] args) {
		Main_Recursive sol = new Main_Recursive();
		sol.P1028();
	}
	
	// Luogu P1028
	// 要求找出具有下列性质数的个数(包含输入的自然数nn):先输入一个自然数n(n n≤1000),
	// 然后对此自然数按照如下方法进行处理:不作任何处理;在它的左边加上一个自然数,但该自然数不能超过原数的一半;
	// 加上数后,继续按此规则进行处理,直到不能再加自然数为止.
	
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