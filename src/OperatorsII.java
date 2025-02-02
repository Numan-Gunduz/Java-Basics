public class OperatorsII {
    public static void main(String[] args) {
        int a = 30 ;
        int b = 40;

        int c = 60 ;
        //karşılaştırma operatörleri
        // ==, != ,>,<;>=,<=

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);

        if(a<b && c<=60)
        {
            System.out.println(a + " degeri " + b +" değerinden küçüktür");
        }
    }
}
