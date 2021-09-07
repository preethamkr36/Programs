class Temple3{
	static String templesName[ ]={"Kedarnath Temple","Sanchi Stupa","Ramanthaswamy Temple","Vaihno Devi Temple"};
	public static void main(String a[]){
		getTempleName();
	}
	public static void getTempleName()
	{
		for(int i=0;i<templesName.length;i++)
		{
		System.out.println(templesName[i]);
		}
	}
}