public class Demo2{
	public static void main(String[] args){
		int num = (int) 100L;
		System.out.println(num);
		
		int num1 = (int) 8.7;
		System.out.println(num1);
		
		char zifu = 'X';
		System.out.println(zifu+1);
		
		byte num4 = 40;  //����ת��Ϊint���͡�
		byte num3 = 30;
		int num5 = num3 + num4;  // byte + byte --> int + int
		System.out.println(num5);
		
		int number = 87;
		number++;   //����ʹ��ʱ��++��ǰ�����ں󣬽����һ��
		System.out.println(number);
		++number;
		System.out.println(number);
		//���ʹ��ʱ��++��ǰ���ȼӺ��ã�++�ں����ú��
		System.out.println(number++);
		System.out.println(number);
		System.out.println(++number);
	}
}