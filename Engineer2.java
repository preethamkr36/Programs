class Engineer2
{
 static String branches[] = {"Electrical and Electronics","Electronics and Communication","Civil Engineering","Mechanical Engineering","Computer Science","Information Science"};
 static int strength[] = new int[6];
public static void main(String a[])
{

 strength[0] = 75;
 strength[1] = 93;
 strength[2] = 65; 
 strength[3] = 102;
 strength[4] = 122;
 strength[5] = 68;

System.out.println("Welcome to JNNCE");
for(int i=0;i<branches.length;i++)
{
System.out.println(branches[i] + " : " + strength[i] );
}
}
}