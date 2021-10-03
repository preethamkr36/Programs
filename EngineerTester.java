class EngineerTester
{
	public static void main(String arg[])
	{
		Eee eee=new Eee();
		eee.department="Electrical And Electronics Engineering";
		eee.engineerName="Ajay";
		eee.isAvaliable=true;
		eee.display();
		eee.problemSolving();

		Ece ece=new Ece();
		ece.department="Electronics And Communication Engineering";
		ece.engineerName="Bharath";
		ece.isAvaliable=true;
		ece.display();
		ece.problemSolving();

		Mech mech=new Mech();
		mech.department="Mechanical Engineering";
		mech.engineerName="Chandan";
		mech.isAvaliable=true;
		mech.display();
		mech.problemSolving();

		Cse cse=new Cse();
		cse.department="Computer Science Engineering";
		cse.engineerName="Dhanraj";
		cse.isAvaliable=true;
		cse.display();
		cse.problemSolving();

		Civil civil=new Civil();
		civil.department="Civil Engineering";
		civil.engineerName="Girish";
		civil.isAvaliable=true;
		civil.display();
		civil.problemSolving();
	}
}