class Sanitizer{

static String sanitizerName1="Savlon";
static int quantity1=500;
static int price1=250;
static boolean available1=true;

static String sanitizerName2="Dettol";
static int quantity2=200;
static int price2=180;
static boolean available2=true;

static String sanitizerName3="Biofresh";
static double quantity3=1.2;
static int price3=399;
static boolean available3=true;

public static void main(String a[]){
System.out.println("Sanitizer name "+sanitizerName1);
System.out.println("Quantity - "+quantity1+" ml");
System.out.println("Price - "+price1+" rupees");
System.out.println("Is this product available?\n"+available1);

System.out.println("\nSanitizer name "+sanitizerName2);
System.out.println("Quantity - "+quantity2+" ml");
System.out.println("Price - "+price2+" rupees");
System.out.println("Is this product available?\n"+available2);

System.out.println("\nSanitizer name"+sanitizerName3);
System.out.println("Quantity - "+quantity3+" Ltr");
System.out.println("Price - "+price3+" rupees");
System.out.println("Is this product available?\n"+available3);
}
}