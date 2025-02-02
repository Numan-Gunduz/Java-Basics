public class FirstString {
    public static void main(String[] args) {
        String first = "Test otomasyonu";
        System.out.println(first);
        String second = "Test Selenium";
        System.out.println(second);
        int  sayi = first.length();
        System.out.println(sayi);
        String buyukdeger = first.toUpperCase();
        System.out.println(buyukdeger);
        String kucukDeger = first.toLowerCase();
        System.out.println(kucukDeger);

        System.out.println(kucukDeger+buyukdeger+sayi);
        String yeniString = "En sevdiğim \"film\" Avatar";
        System.out.println(yeniString);
      //  System.out.println(buyukdeger);
        /*
        * stringler ile işlem yaparken bir stringi belirlemeye çalışırken tırnak işaretelri arasında
        * onu gösterirken  \"xxxx\" sembolü ile gösterebiliriz.
        * */
    }
}
