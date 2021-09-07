class Mall2
{
    static String shopName[] = {"Trends","HP Showroom","fbb","Spar Super Market","Reliance Digital"};
    static int shopNo[] = {1,2,3,4,5};

    public static void main(String a[])
    {
        System.out.println("Welcome to Bearys City Center Shimogga \n");
        getShopName();
    }
    public static void getShopName()
    {
        for(int i=0;i<shopNo.length;i++)
        {
            System.out.println("Shop number " + shopNo[i] + ": " + shopName[i] );
        }
    }
}