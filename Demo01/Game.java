package Demo01;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;

//import org.omg.Messaging.SyncScopeHelper;


public class Game {
	private static ArrayList<Hero> list;
	

	public static void main(String[] args) {
		ArrayList<Hero> list = new ArrayList<>();
	//	System.err.println("�����ļ������ݵ����ϵ��С�");
		boolean isNew = list.size() == 0;
		System.err.println("�ⲻ���¶���:"+isNew);
		if(isNew){
			addFiveHeros(list);
		}
		System.out.println("���Ƕ���������ǣ�");
		showHeros(list);
		int totalAttack = getTotalAttack(list);
		
		System.out.println("���Ƕ������ս�����ǣ�"+totalAttack);
		System.out.println("�˳���Ϸ");
		
		
		
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
			System.out.println("Ӣ�����֣�"+hero.getName()+"��������"+hero.getAttack()+"����"+hero.getType());
		}
		
	}
	public static void addFiveHeros(ArrayList<Hero> list){
		
	
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=5;i++){
		System.out.println("�������"+i+"Ӣ�۵����֣�");
		String name = sc.next();
		System.out.println("�������"+i+"Ӣ�۵Ĺ�������");
		int attack = sc.nextInt();
		System.err.println("�������"+i+"Ӣ�۵����ͣ�");
		String type = sc.next();
		
		Hero hero = new Hero(name,attack,type);
		list.add(hero);
		
		}
	}
	

}
