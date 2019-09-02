import java.util.*;
import java.io.*;

public class Main{
	// Luogu P1055
	// ��д�����ж������ISBN������ʶ�����Ƿ���ȷ
	public static void P1055(){
		String ISBN;	int times = 1;	int ans = 0;	char ch;
		Scanner cin = new Scanner(System.in);
		ISBN = cin.next();
		for(int i = 0;i < ISBN.length() - 1;i++){
			if(ISBN.charAt(i) != '-'){
				ans += (ISBN.charAt(i) - '0') * times;
				times += 1;
			}
		}
		ans %= 11;
		if(ans == 10){
			ch = 'X';
		} else {
			ch = (char)(ans + '0');
		}
		if(ch == ISBN.charAt(ISBN.length() - 1)){
			System.out.println("Right");
		}else{
			for(int i = 0;i < ISBN.length() - 1;i++){
				System.out.printf("%c",ISBN.charAt(i));
			}
			System.out.printf("%c",ch);
		}
	}
	
	// Luogu P1200
	// С�������������������з�ʽת����һ�����֣����յ����־���������������ĸ�Ļ�������AA��11��ZZ��2626��
	// ���С������� \bmod 47mod47�������ǵ����� \bmod 47mod47,��͵ø������С����Ҫ׼���ñ����ߣ�
	public static void P1200(){
		String UFO;		int num_UFO = 1;
		String Member;	int num_Member = 1;
		Scanner cin = new Scanner(System.in);
		UFO = cin.next();
		Member = cin.next();
		for(int i = 0;i < UFO.length();i++){
			num_UFO *= (UFO.charAt(i) - 'A' + 1);
			num_UFO %= 47;
		}
		for(int i = 0;i < Member.length();i++){
			num_Member *= (Member.charAt(i) - 'A' + 1);
			num_Member %= 47;
		}
		if(num_UFO == num_Member){
			System.out.println("GO");
		} else {
			System.out.println("STAY");
		}
	}
	
	// Luogu P1308
	// ����һ�����ʣ�����������ڸ����������г��ֵĴ����͵�һ�γ��ֵ�λ�á�ע�⣺ƥ�䵥��ʱ�������ִ�Сд��
	// ��Ҫ����ȫƥ�䣬���������ʱ����������е�ĳһ���������ڲ����ִ�Сд���������ȫ��ͬ���μ�����1 ����
	// ����������ʽ���������ĳһ���ʵ�һ��������ƥ�䣨�μ�����2 ����
	public static void P1308(){
		String word;	String article;
		int i = 0;	int j = 0;	boolean flag = true;
		Scanner cin = new Scanner(System.in);
		word = cin.next();
		cin.nextLine();
		article = cin.nextLine();
		int w_len = word.length();	int a_len = article.length();
		while(i < a_len - w_len){
			flag = true;
			for(j = 0;j < w_len;j++){
				int t = article.charAt(i + j) - word.charAt(j);
				if(t == 0 || t == 32 || t == -32){
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if( flag && (i == 0 || article.charAt(i) == ' ') && 
				(i + w_len == a_len || article.charAt(i + w_len) == ' ')){
				System.out.println(i);
				return;
			} else {
				i++;
			}
		}
		if(!flag){
			System.out.println(-1);
		}
	}
	
	public static void main(String[] args){
		Main sol = new Main();
		sol.P1308();
	}
}