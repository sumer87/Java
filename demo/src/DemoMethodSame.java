public class DemoMethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(87,829));
    }
    public static boolean isSame(int a,int b){
       // 方法一
        /*boolean same;
        if (a == b){
            same = true;
        }else{
            same = false;
        }*/
        // 方法二
        // boolean same = a==b?true:false;
        //方法三
        // boolean same = a==b;
        //方法四
        return a==b;
        //return same;
    }
}
