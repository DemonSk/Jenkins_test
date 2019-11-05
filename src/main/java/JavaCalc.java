public class JavaCalc {
//    public static void main(String[] args) {
//        System.out.println(firstF(2,2,3));
//        System.out.println(proverkanaprostotu(199));
//        System.out.println(hitriyeular(15));
//        System.out.println(Evklid(15,47));
//        System.out.println(BigEvklid(36,60)[1]);
//    }
    public static double firstF(int a , int x, int m){
        double y = Math.pow(a, x) ;
        return y%m;
    }

    static int[] BigEvklid(int a, int b)
    {
        int res[] = new int[3];
        if (b == 0)
        {
            res[0] = a; res[1] = 1; res[2] = 0;
            return res;
        }
        res = BigEvklid(b,a % b);
        int s = res[2];
        res[2] = res[1] - (a / b) * res[2];
        res[1] = s;
        return res;
    }

    public static int Evklid(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static boolean proverkanaprostotu(int num){
        int a=2;
        if (Math.pow(a,num-1)%num==1) {
            return true;
        }
        return false;
}
    static int hitriyeular(int n){
        int p=0;
        int q=0;
        for (int i=2; i<=n/2;i++){
            if (proverkanaprostotu(i)){
                p = i;
                double a = (long)(n);
                if ((a/p)%1==0){
                if (proverkanaprostotu(n/p)){
                    q=n/p;
                    break;
                }
                else{
                    p=0;
                }
            }
            else {
                p=0;
                }}

        }
        if(p==0&&q==0){
            return 0;
        }
        return (p-1)*(q-1);
    }

}
