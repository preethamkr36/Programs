package com.xworkz.clone;

import com.xworkz.clone.dtos.*;

public class Trigger {
	public static void main(String[] args) throws CloneNotSupportedException {
		LaptopDto laptop=new LaptopDto();
		BottelDto bottel=new BottelDto();
		StadiumsDto stadium=new StadiumsDto();
		InstituteDto institute=new InstituteDto();
		PenDto pen=new PenDto();
		MobileDto mobile=new MobileDto();
		HospitalDto hospital=new HospitalDto();
		MallDto mall=new MallDto();
		ShowroomDto showroom=new ShowroomDto();
		CanteenDto canteen=new CanteenDto();
		TravelsDto travels=new TravelsDto();
		
		laptop.setBrand("HP");
		laptop.setColor("gray");
		laptop.setPrice(44000);
		laptop.setStock(true);
		laptop.setStorage("1 TB");
		
		bottel.setBrand("Tapper");
		bottel.setCapacity(1);
		bottel.setColor("Blue");
		bottel.setPrice(100);
		
		stadium.setCapacity(34000);
		stadium.setLocation("Bengalore");
		stadium.setName("New");
		stadium.setNoOfGates(4);
		
		institute.setLocation("Rajajinagar");
		institute.setMainCourse("Java");
		institute.setName("X-workz");
		institute.setNoOfBranch(2);
		institute.setNoOfStudents(250);
		
		pen.setBrand("Bright");
		pen.setInk("blace");
		pen.setPrice(10);
		pen.setType("ink");
		
		mobile.setBrand("Redmi");
		mobile.setModel("Note 4");
		mobile.setPrice(13000);
		mobile.setStock(true);
		mobile.setStorage("64 gb");
		
		hospital.setLocation("Shimoga");
		hospital.setName("City hospital");
		hospital.setNoOfPatients(150);
		hospital.setNoOfWards(25);
		
		mall.setLocation("Rajajinagar");
		mall.setName("Global Mall");
		mall.setNoOfGates(3);
		mall.setNoOfShops(175);
		
		showroom.setLocation("Shimoga");
		showroom.setName("Ravi");
		showroom.setOpen(true);
		showroom.setType("Bike");
		
		canteen.setId(1221);
		canteen.setLocation("Shimoga");
		canteen.setName("Kamat");
		canteen.setOwner("Nagesh Kamat");
		
		travels.setFoundedIn(1998);
		travels.setName("Shree");
		travels.setNoOfBus(70);
		travels.setOwner("Gopal");
		
		LaptopDto laptop1=(LaptopDto)laptop.clone();
		BottelDto bottel1=(BottelDto)bottel.clone();
		StadiumsDto stadium1=(StadiumsDto)stadium.clone();
		InstituteDto institute1=(InstituteDto)institute.clone();
		PenDto pen1=(PenDto)pen.clone();
		MobileDto mobile1=(MobileDto)mobile.clone();
		HospitalDto hospital1=(HospitalDto)hospital.clone();
		MallDto mall1=(MallDto)mall.clone();
		ShowroomDto showroom1=(ShowroomDto)showroom.clone();
		CanteenDto canteen1=(CanteenDto)canteen.clone();
		TravelsDto travels1=(TravelsDto)travels.clone();
		
		System.out.println(laptop1);
		System.out.println(bottel1);
		System.out.println(stadium1);
		System.out.println(institute1);
		System.out.println(pen1);
		System.out.println(mobile1);
		System.out.println(hospital1);
		System.out.println(mall1);
		System.out.println(showroom1);
		System.out.println(canteen1);
		System.out.println(travels1);
	}
}
