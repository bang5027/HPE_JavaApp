package Exercise;

public class Excercise4_3 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("1부터 100까지의 3의 배수 : ");
		for(int i =1; i<=100; i++) {
			if(i % 3 ==0) {
				sum+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println("\n1부터 100까지의 3의 배수의 합 :"+sum);
	}
}
