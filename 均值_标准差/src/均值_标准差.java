import java.util.Scanner;

public class 均值_标准差 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("请连续输入十个数，求其均值与标准差：");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int sum = 0;
		double mean = 0;
		double deviation = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		mean = (double) sum / arr.length;
		double sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum2 = sum2 + Math.pow((arr[i] - mean), 2);
		}
		deviation = Math.sqrt(sum2 / ((arr.length) - 1));
		System.out.printf("均值为：%.2f\n", mean);
		System.out.printf("标准差为：%.2f", deviation);
	}
}