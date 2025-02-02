public class Loops {
    public static void main(String[] args) {
        for (double i  = 0 ; i<10 ; i=i+0.25)
        {
            System.out.println("Değişkenlerimizin Değeri " + i);
        }
        System.out.println("***********************************************************************");
        /*
        * Geliş,miş döngüler */

        String [] isimler   = {"numan", "murat","abdulkadir"};
        for(String ısım: isimler )
        {
            System.out.println("Gelişmiş döngü kullanrak isimler "+ ısım);
        }

    }
}
