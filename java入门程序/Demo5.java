public class Demo5{
	public static void main(String[] args){
		int i = 1;
		int sum = 0;
		while (i <= 100){
			if (i%2 == 0){
				sum += i;
			}
			i += 1;
		}
		System.out.println("结果是：" + sum);
		System.out.println("===============");
		do{
			if (i%2 == 0){
				sum +=i;
			}
			i+=1;
		}while(i<=100);
		System.out.println("结果是：" + sum);
	}
}