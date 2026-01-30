public class Method6{
    public static int add(int a,int b){
        int ans = a+b;
        return ans;
    }
    public static int add(int a,int b,int c){
        int ans = a+b+c;
        return ans;
    }
    public static void main(String[]args){
        int res1 = add(6,3);
        int res2 = add(12,7,4);
        System.out.println(res1);
         System.out.println(res2);

    }
    }
