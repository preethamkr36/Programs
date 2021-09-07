class Mall
{
 static String shopName[] = new String[5];
 static int shopNo[] = {1,2,3,4,5};
public static void main(String a[])
{ 
 shopName[0] = "Trends";
 shopName[1] = "HP Showroom";
 shopName[2] = "fbb";
 shopName[3] = "Spar Super Market";
 shopName[4] = "Reliance Digital";

System.out.println("Welcome to Bearys City Center Shimogga \n");
for(int i=0;i<shopNo.length;i++)
{
System.out.println("Shop number " + shopNo[i] + ": " + shopName[i] );
}
}
}