class Airport
{
 static int terminals[] = new int[5];
 static String planeName[] = new String[5];
public static void main(String a[])
{
 terminals[0] = 1;
 terminals[1] = 2;
 terminals[2] = 3;
 terminals[3] = 4;
 terminals[4] = 5;
 
 planeName[0] = "8G 2000";
 planeName[1] = "7G 2021";
 planeName[2] = "5E 2999";
 planeName[3] = "4F 2013";
 planeName[4] = "6B 2017";

System.out.println("Welcome to Kempegowda Airport Bangalore \n");
for(int i=0;i<terminals.length;i++)
{
System.out.println("Terminal " + terminals[i] + ":" + planeName[i] +"\n" );
}
}
}