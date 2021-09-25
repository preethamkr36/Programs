class Exam
{
	public String universityName;
	public int fee;

	public Exam(String universityName,int fee)
	{
		this.universityName=universityName;
		this.fee=fee;
	}

	public static void main(String arg[])
	{
		Exam exam=new Exam("Vtu",1295);
		exam.display();
	}

	public void display()
	{
		System.out.println(universityName+" "+fee);
	}
}