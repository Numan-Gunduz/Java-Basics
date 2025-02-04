public class TryCatch {
    public static void main(String[] args) {

        int [] sayilar = {1,5,10,555,678};
        try
        {
            System.out.println(sayilar[6]);//buradaki kodu koşmaya çalışacağız
        }
        catch(Exception exception)//buradaki kod bir hata alırsa bu hatayı consola yazdırıyoruz
        {
           // exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("hata verdi");
        };
        System.out.println("Hata sonrası konsola yazdır");
    }
}
