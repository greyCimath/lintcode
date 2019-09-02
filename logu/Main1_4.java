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
	// 输入两个整数a,b，输出它们的和(|a|,|b|<=10^9)
	public static void P1001(){
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		System.out.println(a + b);
	}
	
	// Luogu P1421
	// 班主任给小玉一个任务，到文具店里买尽量多的签字笔。
	// 已知一只签字笔的价格是1元9角，而班主任给小玉的钱是a元b角，小玉想知道，她最多能买多少只签字笔呢。
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
	* 这一天，小鱼给自己的游泳时间做了精确的计时（本题中的计时都按24小时制计算），
	* 它发现自己从a时b分一直游泳到当天的c时d分，请你帮小鱼计算一下，它这天一共游了多少时间呢？
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
	* 月用电量在150千瓦时及以下部分按每千瓦时0.4463元执行，月用电量在151~400千瓦时的部分按每千瓦时0.4663元执行，
	* 月用电量在401千瓦时及以上部分按每千瓦时0.5663元执行;小玉想自己验证一下，
	* 电费通知单上应交电费的数目到底是否正确呢。
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
	// 津津如果一天上课超过八个小时就会不高兴，而且上得越久就会越不高兴。假设津津不会因为其它事不高兴，
	// 并且她的不高兴不会持续到第二天。请你帮忙检查一下津津下周的日程安排，
	// 看看下周她会不会不高兴；如果会的话，哪天最不高兴
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
	// 每个月的月初妈妈给津津300300元钱，津津可以随时把整百的钱存在她那里，到了年末她会加上20\%20%还给津津
	// 因此津津制定了一个储蓄计划：每个月的月初，在得到妈妈给的零花钱后，
	// 如果她预计到这个月的月末手中还会有多于100100元或恰好100100元，她就会把整百的钱存在妈妈那里，剩余的钱留在自己手中。
	// 判断会不会出现这种情况。如果不会，计算到2004年年末，妈妈将津津平常存的钱加上20％还给津津之后，津津手中会有多少钱。
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
	// 她发现商店一共有 33种包装的铅笔，不同包装内的铅笔数量有可能不同，价格也有可能不同。
	// 为了公平起 见，P老师决定只买同一种包装的铅笔。商店不允许将铅笔的包装拆开，
	// 因此P老师可能需要购买超过nn支铅笔才够给小朋 友们发礼物。现在P老师想知道，在商店每种包装的数量都足够的情况下，
	// 要买够至少nn支铅笔最少需要花费多少钱
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
	// 将1,2, \cdots ,91,2,?,9共99个数分成33组，分别组成3个三位数，
	// 且使这33个三位数构成1:2:3的比例，试求出所有满足条件的3个三位数。
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
	// 级数求和
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
	// 已知小玉第一步能游2米，可是随着越来越累，力气越来越小，她接下来的每一步都只能游出上一步距离的98%。
	// 现在小玉想知道，如果要游到距离x米的地方，她需要游多少步呢
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
	// 它平日每天游泳 250 公里，周末休息（实行双休日)，假设从周 x(1\le x \le 7)x(1≤x≤7) 开始算起，
	// 过了 n(n\le 10^6)n(n≤10^6)天以后，小鱼一共累计游泳了多少公里呢？
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
	// 试计算在区间 11 到 n n的所有整数中，数字 x(0 ≤ x ≤ 9)x(0≤x≤9)共出现了多少次？
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
	// 陶陶有个3030厘米高的板凳现在已知1010个苹果到地面的高度，
	// 以及陶陶把手伸直的时候能够达到的最大高度，请帮陶陶算一下她能够摘到的苹果的数目。
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
	// 数轴上的每个整数点，即0,1,2,…,L0,1,2,…,L，都种有一棵树。已知任一区域的起始点和终止点的坐标都是整数，区域之间可能有重合的部分。
	// 现在要把这些区域中的树（包括区域端点处的两棵树）移走。你的任务是计算将这些树都移走后，马路上还有多少棵树
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
	// 把看到的一串数字（长度不一定，以0结束，最多不超过100个，数字不超过2^32-1），记住了然后反着念出来
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
	// 由于所有的鱼头都朝向左边，所以每只鱼只能看见在它左边的鱼的可爱程度，它们心里都在计算，
	// 在自己的眼力范围内有多少只鱼不如自己可爱呢
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
	// 随机生成一个正整数集合,其中有多少个数，恰好等于集合中另外两个（不同的）数之和？
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
	// 最高气温一直上升的最长连续天数
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