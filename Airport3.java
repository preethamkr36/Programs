class Airport3
{
    static int terminals[]= new int[5];
    static String planeName[]=new String[5];
    public static void main(String a[])
    {
        terminals[0] = 1;
        terminals[1] = 2;
        terminals[2] = 3;
        terminals[3] = 4;
        terminals[4] = 5;

        planeName[0] ="6G 2004";
        planeName[1] ="6E 2021";
        planeName[2] ="7E 2999";
        planeName[3] ="4B 2013";
        planeName[4] ="6E 2017";
        getPlaneName();
    }
    public static void getPlaneName()
    {
        for(int i=0;i<terminals.length;i++)
        {
            System.out.println("Terminal " + terminals[i] + ":" + planeName[i] +"\n" );
        }
    }
}