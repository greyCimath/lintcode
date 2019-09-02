import java.util.*;
import java.io.*;

public class Main{
	// Luogu P1055
	// 编写程序判断输入的ISBN号码中识别码是否正确
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
	// 小组名和彗星名都以下列方式转换成一个数字：最终的数字就是名字中所有字母的积，其中AA是11，ZZ是2626。
	// 如果小组的数字 \bmod 47mod47等于彗星的数字 \bmod 47mod47,你就得告诉这个小组需要准备好被带走！
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
	// 给定一个单词，请你输出它在给定的文章中出现的次数和第一次出现的位置。注意：匹配单词时，不区分大小写，
	// 但要求完全匹配，即给定单词必须与文章中的某一独立单词在不区分大小写的情况下完全相同（参见样例1 ），
	// 如果给定单词仅是文章中某一单词的一部分则不算匹配（参见样例2 ）。
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