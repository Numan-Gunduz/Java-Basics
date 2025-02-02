public class ExampleForOperators {
    public static void main(String[] args) {

        int a = 855, b = 40;
        int toplam = a+b ;
        int carpim = a*b;

        System.out.println("Sayıların Toplamı "+ toplam + " dır.");
        if(carpim>3000 && carpim<4000)
        {
            System.out.println("Sayıların çarpım değeri : " + carpim);
        }
        else
        {
            System.out.println("Sayıların çarpım değeri malesef 3000 ile 4000 arasında değil! :(");
        }
    }
}
