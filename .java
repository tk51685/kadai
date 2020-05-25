import java.util.Arrays;

public class kadai {
	public static void main(String[] args) {

		int num[] = new int[10];
		for(int i = 0; i < num.length ; i++ ) {
			num[i] = (int)(Math.random()*10)+1;
			int sum = 0;
		        //ここで配列の合計を代入したいですが、方法がわかりません。
			sum += num[i];

			int ave = (int)sum / num.length;
			int min = Arrays.stream(num).min().getAsInt();
			int max = Arrays.stream(num).max().getAsInt();

			System.out.println(num[i]);
			System.out.println("最大値"+max);
			System.out.println("最小値"+ min );
			System.out.println("合計値"+sum);
			System.out.println("平均値"+ave);
			//printlnが10回繰り返されてしまいますが、for文からの抜け方が分かりません。
		}
	}
}
