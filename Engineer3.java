class Engineer3
{
    static String branches[] = {"Electrical and Electronics","Electronics and Communication","Civil Engineering","Mechanical Engineering","Computer Science","Information Science"};
    static int strength[] = {75,93,65,102,122,68};
    public static void main(String a[])
    {

        System.out.println("Welcome to JNNCE");
        getBranchName();
    }
    public static void getBranchName()
    {
        for(int i=0;i<branches.length;i++)
        {
            System.out.println(branches[i] + " : " + strength[i] );
        }
    }
}