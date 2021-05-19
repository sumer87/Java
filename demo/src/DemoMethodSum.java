public class DemoMethodSum {
    public static void main(String[] args) {
        System.out.println(Sum());
    }
    public static int Sum(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
