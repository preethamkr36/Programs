class Airport3
{
    static int terminals[] = {1,2,3,4,5};
    static String planeName[] = {"6G 2004","6E 2021","7E 2999","4B 2013","6E 2017"};
    public static void main(String a[])
    {
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