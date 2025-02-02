public class Operators {
    public static void main(String[] args)
    {
        int a  = 10 ;
        int b = 20 ;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);//bunu interger tanımladğımız için 0 geldi.
        double c = 55.12;
        System.out.println(a+c);


        System.out.println("********************************************************************************************");
        //++,--
        System.out.println(a++);//a'nın mevcut durumunu ekrana yazdırır sonra a bir artırılır.
        System.out.println(b--);
        System.out.println(++a);//a'nın değeri bir artırılır daha sonrasında ekrana yazdırılır.
        System.out.println(--b);

    /*
    beklenen çıktılar :
    10
    20
    12
    18
    * */
        System.out.println("********************************************************************************************");

        /*Atama operatörleri */
        int d = 50 ; //buraDAKİ =  ifadesi bir atama operatörüdür.
        d +=3;
        System.out.println(d);
        d-=2;
        System.out.println(d);
    }
}
