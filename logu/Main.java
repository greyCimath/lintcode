import java.io.*;
import java.util.*;

public class Main{
	// LuoGu P1000
	public static void P1000(){
		System.out.println("                ********");
		System.out.println("               ************");
		System.out.println("               ####....#.");
		System.out.println("             #..###.....##....");
		System.out.println("             ###.......######              ###            ###");
		System.out.println("                ...........               #...#          #...#");
		System.out.println("               ##*#######                 #.#.#          #.#.#");
		System.out.println("            ####*******######             #.#.#          #.#.#");
		System.out.println("           ...#***.****.*###....          #...#          #...#");
		System.out.println("           ....**********##.....           ###            ###");
		System.out.println("           ....****    *****....");
		System.out.println("             ####        ####");
		System.out.println("           ######        ######");
		System.out.println("##############################################################");
		System.out.println("#...#......#.##...#......#.##...#......#.##------------------#");
		System.out.println("###########################################------------------#");
		System.out.println("#..#....#....##..#....#....##..#....#....#####################");
		System.out.println("##########################################    #----------#");
		System.out.println("#.....#......##.....#......##.....#......#    #----------#");
		System.out.println("##########################################    #----------#");
		System.out.println("#.#..#....#..##.#..#....#..##.#..#....#..#    #----------#");
		System.out.println("##########################################    ############");
	}
	
	// Luogu P1001
	// ������������a,b��������ǵĺ�(|a|,|b|<=10^9)
	public static void P1001(){
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		System.out.println(a + b);
	}
	
	// Luogu P1421
	// �����θ�С��һ�����񣬵��ľߵ����������ǩ�ֱʡ�
	// ��֪һֻǩ�ֱʵļ۸���1Ԫ9�ǣ��������θ�С���Ǯ��aԪb�ǣ�С����֪����������������ֻǩ�ֱ��ء�
	public static void P1421(){
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int ans = 0;
		ans = (a * 10 + b) / 19;
		System.out.println(ans);
	}
	
	// LuoGu P1425
	/*
	* ��һ�죬С����Լ�����Ӿʱ�����˾�ȷ�ļ�ʱ�������еļ�ʱ����24Сʱ�Ƽ��㣩��
	* �������Լ���aʱb��һֱ��Ӿ�������cʱd�֣������С�����һ�£�������һ�����˶���ʱ���أ�
	*/
	public static void P1425(){
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		int d = cin.nextInt();
		int e = 0;	int f = 0;
		
		if(d < b){
			e = c - a - 1;
			f = d + 60 - b;
		} else {
			e = c - a;
			f = d - b;
		}
		System.out.println(e + " " + f);
	}
	
	// LuoGu P1422
	/*
	* ���õ�����150ǧ��ʱ�����²��ְ�ÿǧ��ʱ0.4463Ԫִ�У����õ�����151~400ǧ��ʱ�Ĳ��ְ�ÿǧ��ʱ0.4663Ԫִ�У�
	* ���õ�����401ǧ��ʱ�����ϲ��ְ�ÿǧ��ʱ0.5663Ԫִ��;С�����Լ���֤һ�£�
	* ���֪ͨ����Ӧ����ѵ���Ŀ�����Ƿ���ȷ�ء�
	*/
	public static void P1422(){
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		double ans = 0.0;
		if(a <= 150 && a >= 0){
			ans = a * 0.4463;
		} else if(a >= 151 && a <= 400){
			ans = 150 * 0.4463 + (a - 150) * 0.4663;
		} else{
			ans = 150 * 0.4463 + 250 * 0.4663 + (a - 400) * 0.5663;
		}
		System.out.printf("%.1f",ans);
	}
	
	// LuoGu P1085
	// ������һ���Ͽγ����˸�Сʱ�ͻ᲻���ˣ������ϵ�Խ�þͻ�Խ�����ˡ������򲻻���Ϊ�����²����ˣ�
	// �������Ĳ����˲���������ڶ��졣�����æ���һ�½�����ܵ��ճ̰��ţ�
	// �����������᲻�᲻���ˣ������Ļ������������
	public static void P1085(){
		Scanner cin = new Scanner(System.in);
		int a = 0;	int b = 0;
		int ans = 0;	int tmp = -1;
		for(int times = 1;times < 8;times++){
			a = cin.nextInt();
			b = cin.nextInt();
			if(a + b - 8 > tmp){
				ans = times;
				tmp = a + b - 8;
			}
		}
		System.out.println(ans);
	}
	
	// LuoGu P1089
	// ÿ���µ��³���������300300ԪǮ����������ʱ�����ٵ�Ǯ���������������ĩ�������20\%20%�������
	// ��˽���ƶ���һ������ƻ���ÿ���µ��³����ڵõ���������㻨Ǯ��
	// �����Ԥ�Ƶ�����µ���ĩ���л����ж���100100Ԫ��ǡ��100100Ԫ�����ͻ�����ٵ�Ǯ�����������ʣ���Ǯ�����Լ����С�
	// �жϻ᲻��������������������ᣬ���㵽2004����ĩ�����轫���ƽ�����Ǯ����20���������֮�󣬽�����л��ж���Ǯ��
	public static void P1089(){
		int ans_1 = 13;	int ans_2 = 0;	
		int tmp = 0;	int num = 0;
		Scanner cin = new Scanner(System.in);
		for(int month = 1;month < 13;month++){
			num = cin.nextInt();
			tmp = tmp + 300 - num;
			if(tmp < 0 && month < ans_1){
				ans_1 = month;
			} else {
				ans_2 = ans_2 + (tmp / 100) * 100;
				tmp = tmp % 100;
			}
		}
		if(ans_1 < 13){
			System.out.println("-"+ans_1);
		} else {
			ans_2 = ans_2 * 6 / 5 + tmp;
			System.out.println(ans_2);
		}
	}
	
	// LuoGu P1909
	// �������̵�һ���� 33�ְ�װ��Ǧ�ʣ���ͬ��װ�ڵ�Ǧ�������п��ܲ�ͬ���۸�Ҳ�п��ܲ�ͬ��
	// Ϊ�˹�ƽ�� ����P��ʦ����ֻ��ͬһ�ְ�װ��Ǧ�ʡ��̵겻����Ǧ�ʵİ�װ�𿪣�
	// ���P��ʦ������Ҫ���򳬹�nn֧Ǧ�ʲŹ���С�� ���Ƿ��������P��ʦ��֪�������̵�ÿ�ְ�װ���������㹻������£�
	// Ҫ������nn֧Ǧ��������Ҫ���Ѷ���Ǯ
	public static void P1909(){
		int num = 0;	double ans = Double.MAX_VALUE;
		int a_1 = 0;	int a_2 = 0;	double tmp = 0;
		Scanner cin = new Scanner(System.in);
		num = cin.nextInt();
		for(int times = 0;times < 3;times++){
			a_1 = cin.nextInt();
			a_2 = cin.nextInt();
			tmp = Math.ceil((double)num / (double)a_1) * a_2;
			if(tmp < ans){
				ans = tmp;
			}
		}
		System.out.printf("%.0f",ans);
	}
	
	// LuoGu P1008
	// ��1,2, \cdots ,91,2,?,9��99�����ֳ�33�飬�ֱ����3����λ����
	// ��ʹ��33����λ������1:2:3�ı������������������������3����λ����
	public static void P1008(){
		int[] num = new int[9];
		int tmp_1 = 0;	int tmp_2 = 0;
		int temp = 1;
		for(int i = 123;i <= 329;i++){
			tmp_1 = i * 2;
			tmp_2 = i * 3;
			
			num[0] = i / 100;
			num[1] = i / 10 - 10 * num[0];
			num[2] = i % 10;
			num[3] = tmp_1 / 100;
			num[4] = tmp_1 / 10 - 10 * num[3];
			num[5] = tmp_1 % 10;
			num[6] = tmp_2 / 100;
			num[7] = tmp_2 / 10 - 10 * num[6];
			num[8] = tmp_2 % 10;
			
			temp = 1;
			for(int j = 0;j < 9;j++){
				temp *= num[j];
			}
			if(temp == 362880){
				System.out.println(i + " " + tmp_1 + " " + tmp_2);
			}
		}
	}
	
	// LuoGu P1035
	// �������
	public static void P1035(){
		int K = 0;	double ans = 0.0;	double n = 0.0;
		Scanner cin = new Scanner(System.in);
		K = cin.nextInt();
		while(ans <= K){
			n += 1.0;
			ans = ans + 1 / n;
		}
		System.out.printf("%.0f",n);
	}
	
	// LuoGu P1423
	// ��֪С���һ������2�ף���������Խ��Խ�ۣ�����Խ��ԽС������������ÿһ����ֻ���γ���һ�������98%��
	// ����С����֪�������Ҫ�ε�����x�׵ĵط�������Ҫ�ζ��ٲ���
	public static void P1423(){
		double ans = 2.0;	double n = 2.0;	double K = 0;	int step = 1;	
		Scanner cin = new Scanner(System.in);
		K = cin.nextDouble();
		while(ans <= K){
			n *= 0.98;
			ans += n;
			step++;
		}
		System.out.println(step);
	}
	
	// LuoGu P1424
	// ��ƽ��ÿ����Ӿ 250 �����ĩ��Ϣ��ʵ��˫����)��������� x(1\le x \le 7)x(1��x��7) ��ʼ����
	// ���� n(n\le 10^6)n(n��10^6)���Ժ�С��һ���ۼ���Ӿ�˶��ٹ����أ�
	public static void P1424(){
		int[] length = {0,250,250,250,250,250,0};
		Scanner cin = new Scanner(System.in);
		int x = 0;	int n = 0;	long ans = 0L;
		x = cin.nextInt();
		n = cin.nextInt();
		ans = n / 7 * 1250;
		n = n % 7;
		for(int i = 0;i < n;i++){
			ans += length[(x + i) % 7];
		}
		System.out.println(ans);
	}
	
	// LuoGu P1980
	// �Լ��������� 11 �� n n�����������У����� x(0 �� x �� 9)x(0��x��9)�������˶��ٴΣ�
	public static void P1980(){
		int n = 0;	int x = 0;	long ans = 0L;	int i = 0;
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		x = cin.nextInt();
		for(i = 1;i <= n;i++){
			int tmp = i;
			while(tmp > 0){
				if((tmp % 10) == x){
					ans += 1;
				}
				tmp = tmp / 10;
			}
		}
		System.out.println(ans);
	}
	
	// LuoGu P1046
	// �����и�3030���׸ߵİ��������֪1010��ƻ��������ĸ߶ȣ�
	// �Լ����հ�����ֱ��ʱ���ܹ��ﵽ�����߶ȣ����������һ�����ܹ�ժ����ƻ������Ŀ��
	public static void P1046(){
		int[] hight = new int[10];
		int h = 0;	int ans = 0;
		Scanner cin = new Scanner(System.in);
		for(int i = 0;i < 10;i++){
			hight[i] = cin.nextInt();
		}
		h = cin.nextInt();
		for(int i = 0;i < 10;i++){
			if((h + 30) >= hight[i]){
				ans += 1;
			}
		}
		System.out.println(ans);
	}
	
	// LuoGu P1047
	// �����ϵ�ÿ�������㣬��0,1,2,��,L0,1,2,��,L��������һ��������֪��һ�������ʼ�����ֹ������궼������������֮��������غϵĲ��֡�
	// ����Ҫ����Щ�����е�������������˵㴦�������������ߡ���������Ǽ��㽫��Щ�������ߺ���·�ϻ��ж��ٿ���
	public static void P1047(){
		int L = 0;	int M = 0;	int ans = 0;
		Scanner cin = new Scanner(System.in);
		L = cin.nextInt();
		M = cin.nextInt();
		int[] location = new int[2 * M];
		for(int i = 0;i < 2 * M;i++){
			location[i] = cin.nextInt();
		}
		ans = L + 1;
		for(int j = 0;j <= L;j++){
			for(int i = 0;i < 2 * M;i += 2){
				if(j >= location[i] && j <= location[i + 1]){
					ans -= 1;
					break;
				}
			}	
		}
		System.out.println(ans);
	}
	
	// LuoGu P1427
	// �ѿ�����һ�����֣����Ȳ�һ������0��������಻����100�������ֲ�����2^32-1������ס��Ȼ���������
	public static void P1427(){
		ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner cin = new Scanner(System.in);
		int tmp = 0;
		while(true){
			tmp = cin.nextInt();
			if(tmp == 0){
				break;
			} else {
				num.add(tmp);
			}
		}
		for(int i = num.size() - 1;i > 0;i--){
			System.out.printf("%s ",num.get(i));
		}
		System.out.printf("%s",num.get(0));
	}
	
	// LuoGu P1428
	// �������е���ͷ��������ߣ�����ÿֻ��ֻ�ܿ���������ߵ���Ŀɰ��̶ȣ��������ﶼ�ڼ��㣬
	// ���Լ���������Χ���ж���ֻ�㲻���Լ��ɰ���
	public static void P1428(){
		Scanner cin = new Scanner(System.in);
		int ans = 0;	int num = 0;
		num = cin.nextInt();
		int[] cute = new int[num];
		for(int i = 0;i < num;i++){
			cute[i] = cin.nextInt();
		}
		System.out.printf("0");
		for(int i = 1;i < num;i++){
			ans = 0;
			for(int j = 0;j < i;j++){
				if(cute[j] < cute[i]){
					ans += 1;
				}
			}
			System.out.printf(" %s",ans);
		}
	}
	
	// LuoGu P2141
	// �������һ������������,�����ж��ٸ�����ǡ�õ��ڼ�����������������ͬ�ģ���֮�ͣ�
	public static void P2141(){
		int size = 0;	int tmp = 0;	int ans = 0;
		Scanner cin = new Scanner(System.in);
		size = cin.nextInt();
		int[] number = new int[size];
		int[] num_flag = new int[size];
		for(int i = 0;i < size;i++){
			number[i] = cin.nextInt();
			num_flag[i] = 0;
		}
		for(int i = 0;i < size - 1;i++){
			for(int j = i + 1;j < size;j++){
				tmp = number[i] + number[j];
				for(int k = 0;k < size;k++){
					if(tmp == number[k] && num_flag[k] == 0){
						num_flag[k] = 1;
					}
				}
			}
		}
		for(int i = 0;i < size;i++){
			ans += num_flag[i];
		}
		System.out.println(ans);
	}
	
	// LuoGu P1567
	// �������һֱ���������������
	public static void P1567(){
		int num = 0;	int ans_tmp = 0;	int ans = -1;
		int tmp_l = 0;	int tmp = 0;
		Scanner cin = new Scanner(System.in);
		num = cin.nextInt();
		tmp_l = cin.nextInt();
		while(--num > 0){
			tmp = cin.nextInt();
			if(tmp > tmp_l){
				ans_tmp += 1;
			} else {
				if(ans < ans_tmp){
					ans = ans_tmp;
				}
				ans_tmp = 0;
			}
			tmp_l = tmp;
		}
		System.out.println(ans + 1);
	}
	
	public static void main(String[] args){
		Main sol = new Main();
		sol.P1567();
	}
}