public class ExampleForLoops {
    public static void main(String[] args) {
        String metin = "Hello Worlood";

        char [] dizim = metin.toCharArray();
        System.out.println(metin.length());
        for (int i = 0 ; i<dizim.length;i++)
        {
            if(dizim[i]=='o')
            {
               dizim [i]=0;
            }

        }
        System.out.println(dizim);
    }
}
