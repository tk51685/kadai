import java.util.Arrays;

public class kadai {


	public static void main(String[] args) {
		int num[] = new int[10];
		int sum = 0;

		for(int i = 0; i < num.length ; i++ ) {

			num[i] = (int)(Math.random()*10)+1;
			System.out.println(num[i]);
		}

		int min = Arrays.stream(num).min().getAsInt();
		System.out.println("最小値"+ min );

		int max = Arrays.stream(num).max().getAsInt();
		System.out.println("最大値"+max);

		//int ave = sum / num.length;
		//System.out.println("平均値"+ ave);
	}
}
