package Demo01;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;

//import org.omg.Messaging.SyncScopeHelper;


public class Game {
	private static ArrayList<Hero> list;
	

	public static void main(String[] args) {
		ArrayList<Hero> list = new ArrayList<>();
	//	System.err.println("加载文件的数据到集合当中。");
		boolean isNew = list.size() == 0;
		System.err.println("这不是新队伍:"+isNew);
		if(isNew){
			addFiveHeros(list);
		}
		System.out.println("我们队伍的阵容是：");
		showHeros(list);
		int totalAttack = getTotalAttack(list);
		
		System.out.println("我们队伍的总战斗力是："+totalAttack);
		System.out.println("退出游戏");
		
		
		
	}
	public static int getTotalAttack(ArrayList<Hero> list){
		int total=0;
		for(int i=0;i<list.size();i++){
			Hero hero=list.get(i);
			total +=hero.getAttack();
		}
		return total;
	}
	public static void showHeros(ArrayList<Hero> list){
		for(int i=0;i<list.size();i++){
			Hero hero=list.get(i);
			System.out.println("英雄名字："+hero.getName()+"攻击力："+hero.getAttack()+"类型"+hero.getType());
		}
		
	}
	public static void addFiveHeros(ArrayList<Hero> list){
		
	
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=5;i++){
		System.out.println("请输入第"+i+"英雄的名字：");
		String name = sc.next();
		System.out.println("请输入第"+i+"英雄的攻击力：");
		int attack = sc.nextInt();
		System.err.println("请输入第"+i+"英雄的类型：");
		String type = sc.next();
		
		Hero hero = new Hero(name,attack,type);
		list.add(hero);
		
		}
	}
	

}
