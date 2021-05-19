public class Demo2{
	public static void main(String[] args){
		int num = (int) 100L;
		System.out.println(num);
		
		int num1 = (int) 8.7;
		System.out.println(num1);
		
		char zifu = 'X';
		System.out.println(zifu+1);
		
		byte num4 = 40;  //会先转变为int类型。
		byte num3 = 30;
		int num5 = num3 + num4;  // byte + byte --> int + int
		System.out.println(num5);
		
		int number = 87;
		number++;   //单独使用时，++在前还是在后，结果都一样
		System.out.println(number);
		++number;
		System.out.println(number);
		//混合使用时，++在前，先加后用；++在后，先用后加
		System.out.println(number++);
		System.out.println(number);
		System.out.println(++number);
	}
}