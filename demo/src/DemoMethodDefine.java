public class DemoMethodDefine {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println("=========");
        System.out.println(sum(10,20));
        System.out.println("=========");
        int res = sum(10,20);
        System.out.println(res);
    }
    public static int sum(int a,int b){
        int result = a + b;
        return result;
    }
}
