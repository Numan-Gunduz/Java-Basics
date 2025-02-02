public class Arrays
{
    public static void main(String[] args)
    {

        String[] isimler = {"Numan","Abdulkadir","Ayşe","Murat","İlknur"} ;
        int [] sayilar = {4,5,6,7,8,9,1,};
        System.out.println(sayilar[0]);
        System.out.println(isimler[2]);
        int toplam = 0;
        isimler[3] = "Ayşe Gündüz";
        System.out.println(isimler[3]);
        String [] webUrl  = {"www.sayfa.com","www.sayfa2.com"};
        System.out.println(webUrl.length);

        for (int i= 0 ; i<isimler.length; i++)
        {
            System.out.println(isimler[i]);
           // toplam += sayilar[i];
        }
        System.out.println(toplam);
    }
}
