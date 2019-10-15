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
	
	// Luogu P1308 80%
	// ����һ�����ʣ�����������ڸ����������г��ֵĴ����͵�һ�γ��ֵ�λ�á�ע�⣺ƥ�䵥��ʱ�������ִ�Сд��
	// ��Ҫ����ȫƥ�䣬���������ʱ����������е�ĳһ���������ڲ����ִ�Сд���������ȫ��ͬ���μ�����1 ����
	// ����������ʽ���������ĳһ���ʵ�һ��������ƥ�䣨�μ�����2 ����
	public static void P1308(){
		String word;	String article;
		int i = 0;	int j = 0;	boolean flag = true;	int ans = 0;	int loc = 0;
		Scanner cin = new Scanner(System.in);
		word = cin.nextLine();
		article = cin.nextLine();
		int w_len = word.length() + 2;
		int a_len = article.length() + 2;
		String w_tmp = " " + word.toUpperCase() + " ";
		String a_tmp = " " + article.toUpperCase() + " ";
		while(i < a_len - w_len){
			flag = false;
			for(j = 0;j < w_len;j++){
				if(w_tmp.charAt(j) != a_tmp.charAt(j + i)){
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			if(flag){
				if(ans == 0){
					loc = i;
				}
				ans += 1;
				i += w_len;
			} else {
				i++;
			}
		}
		if(ans == 0){
			System.out.println(-1);
		} else {
			System.out.printf("%d %d",ans,loc);
		}
	}
	
	// Luogu P1914
	// ��������ԭ���ַ������ɲ����� 50 ��Сд��ĸ��ɣ���ÿ����ĸ����ƶ� nn λ�γɵ�
	// �������ҵ����ƶ�ǰ��ԭ���ַ����� nn������������롣
	public static void P1914(){
		int n = 0;	String pass;	String ans = "";
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		cin.nextLine();
		pass = cin.next();
		for(int i = 0;i < pass.length();i++){
			ans += (char)((pass.charAt(i) + n -'a') % 26 + 'a');
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		Main sol = new Main();
		sol.P1914();
	}
}