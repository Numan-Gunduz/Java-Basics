public class Conditions {
    public static void main(String[] args)
    {
        int saat = 1300;
        if(saat<1200)
        {
            System.out.println("Saat öğleden önce");
        }
        else if(saat==1200)
        {
            System.out.println("saat tam olarak 12:00'dır");
        }
        else
        {
            System.out.println("Saat öğleden sonra");
        }

    }
}
