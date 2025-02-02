public class TipDonusumleri {
    public static void main(String[] args) {
        byte myByte = 50; // -128-128
        short myShort = 2500; //32762 -32762
        int myInt = 1500000;
        long myLong = 10000000000L;
        float myFloat = 56.44f;
        double myDouble = 45678.32D;
        char myChar = 'b';
        boolean myBoolen = true ;

        int yeniGenisletme = myByte;
        System.out.println(yeniGenisletme);
        /*
        * yukarda ki örnekte görüldüğü gibi genişletme işlemi yaptık yani küçük veri tipini byte
        * büyük veri tipine dönüştürdük.
        *
        * */

        int veriDaraltma = (int) myDouble;// buradaki örnekte görüldüğü gibi değiştirmek istediğimiz tipi parantez içerisinde yazdeık
        System.out.println(veriDaraltma);




    }
}
