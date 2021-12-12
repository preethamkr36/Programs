package com.xworkz.lamda;



public class Trigger {
	public static void main(String[] args) {
		PresidentDTO dto[]=new PresidentDTO[50];
		 dto[0]=new PresidentDTO("Ram Nath Kovind", "76","India","Hindi");
		 dto[1]=new PresidentDTO("Joko Widodo", "60","Indonesia","Bahasa");
		 dto[2]=new PresidentDTO("Jose Maria Neves","61","Cape Verde","Portuguese");
		 dto[3]=new PresidentDTO("Faustin-Archange Touadera","64","Central African Republic"," French");
		 dto[4]=new PresidentDTO("Janos Ader","62","Hungary","Hungarian");
		 dto[5]=new PresidentDTO("Guoni Th. Johannesson","53","Iceland","Icelandic") ;
		 dto[6]=new PresidentDTO("Maia Sandu","49","Moldova","Romanian") ;
		 dto[7]=new PresidentDTO("Bidhya Devi Bhandari","60","Nepal","Nepali") ;
		 dto[8]=new PresidentDTO("Mohamed Bazoum","61","Niger","French") ;
		 dto[9]=new PresidentDTO("Stevo Pendarovski","58","North Macedonia","Albanian") ;
		 dto[10]=new PresidentDTO("Isaac Herzog","61","Israel","Hebrew") ;
		 dto[11]=new PresidentDTO("Egils Levits","66","Latvia","Latvian") ;
		 dto[12]=new PresidentDTO("Michel Aoun","88","Lebanon","Arabic") ;
		 dto[13]=new PresidentDTO("Gitanas Nauseda","57","Lithuania","Lithuanian ") ;
		 dto[14]=new PresidentDTO("Mahmoud Abbas","86","Palestine","Arabic") ;
		 dto[15]=new PresidentDTO("Klaus Iohannis","62","Romania","Romanian") ;
		 dto[16]=new PresidentDTO("Vladimir Putin","69","Russia","Russian") ;
		 dto[17]=new PresidentDTO("Felix Tshisekedi","58","Congo","Frech");
		 dto[18]=new PresidentDTO("Zoran Milanovic","55" ,"Croatia","Standard Croatian");
	     dto[19]=new PresidentDTO("Sahle-Work Zewde","71","Ethiopia","Amharic") ;
	     dto[20]=new PresidentDTO("Sauli Niinisto","73","Finland","Finnish and Swedish") ;
		 dto[21]=new PresidentDTO("Ilham Aliyev","59" ,"Azerbaijan","Azerbaijan");
		 dto[22]=new PresidentDTO("Lazarus Chakwera","66","Malawi","English") ;
		 dto[23]=new PresidentDTO("Abdul Hamid", "77","Bangladesh","Bengali");
		 dto[24]=new PresidentDTO("Ismail Omar Guelleh","74" ," Djibouti"," French and Arabic");
		 dto[25]=new PresidentDTO("Andry Rajoelina","47","Madagascar","French") ;
		 dto[26]=new PresidentDTO("George Vella","65","Malta","Maltese") ;
	     dto[27]=new PresidentDTO("Mohamed Ould Ghazouani","65","Mauritania","Arabic") ;
		 dto[28]=new PresidentDTO("Abdel Fattah el-Sisi","67","Egypt","Modern Standard Arabic") ;
		 dto[29]=new PresidentDTO("Nayib Bukele","40","El Salvador","Spanish") ;
	     dto[30]=new PresidentDTO("Alar Karis","63"," Estonian","Estonia") ;
		 dto[31]=new PresidentDTO("Prithvirajsing Roopun","62","Mauritius","English") ;
		 dto[32]=new PresidentDTO("Charles Savarin","78" ,"Dominica","English");
		 dto[33]=new PresidentDTO("Francisco Guterres","67","East Timor","Austronesian") ;
	     dto[34]=new PresidentDTO("Salome Zourabichvili","69","Georgia","kartuli ena") ;
 	     dto[35]=new PresidentDTO("Abdrabbuh Mansur Hadi","76","Yemen","Arabic");
 	     dto[36]=new PresidentDTO("Dame Sandra Mason","72","Barbados","English");
	     dto[37]=new PresidentDTO("Alexander Lukashenko","67" ,"Belarus","Belarusian ");
	     dto[38]=new PresidentDTO("Rumen Radev","58","Bulgaria","Turkish");
		 dto[39]=new PresidentDTO("Roch Marc Christian Kabore","64" ,"Burkina Faso","French");
		 dto[40]=new PresidentDTO("Ilham Aliyev","59" ,"Azerbaijan","Azerbaijani");
		 dto[41]=new PresidentDTO("Alexander Van der Bellen","77","Austria","German");
		 dto[42]=new PresidentDTO("Armen Sarksyan","68" ,"Armenia","Armenia");
		 dto[43]=new PresidentDTO("Frank-Walter Steinmeier","65","Germany","Indo-European");
	     dto[44]=new PresidentDTO("Katerina Sakellaropoulou","69","Greece","Greek");
	     dto[45]=new PresidentDTO("Umaro Sissoco Embalo","49","Guinea-Bissau","Portuguese");
		 dto[46]=new PresidentDTO("Milos Zeman ","77" ,"Czech Republic","Czech");
		 dto[47]=new PresidentDTO("Ilir Meta","52","Albania","Indo-European");
		 dto[48]=new PresidentDTO("Ali Khamenei","82" ,"Iran","Farsi");
		 dto[49]=new PresidentDTO("Barham Salih","61" ,"Iraq","Arabic and Kurdish");
		 DAO dao=new DAO();
		 
		 for (int i = 0; i < dto.length; i++) {
			dao.save(dto[i]);
		}
		 
		 boolean found= dao.find((dto1,ele)->(dto1.getName()).equalsIgnoreCase(ele), "Ram Nath Kovind");
		 System.out.println(found);
		 
		 found=dao.find((dto1,ele)->(dto1.getCountry()).equalsIgnoreCase(ele), "India");
		 System.out.println(found);
		 
		 found=dao.find((dto1,ele)->(dto1.getLanguage()).equalsIgnoreCase(ele), "hindi");
		 System.out.println(found);
		 
		 found=dao.find((dto1,ele)->Integer.parseInt(dto1.getAge())>Integer.parseInt(ele), "90");
		 System.out.println(found);
		 
		 
	}
}
