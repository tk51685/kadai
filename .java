
public class Ave {
	public static void main(String[] args) {
		int num[] = new int [10];
		int sum = 0;
		int ave = 11;

		for (int i = 0; i < num.length ; i++) {
			num[i] = (int)(Math.random()*10)+1;
			System.out.println(num[i]);
			sum += num[i];

		}
		ave = (int)sum / num.length;

		for(int i = 0; i < num.length; i++) {
			if( num[i] >= ave) {
				System.out.println("平均値より大きい"+ num[i]+" ");
			}

		}

		System.out.println("平均値："+ave);
		System.out.println("合計値："+sum);
	}
}
