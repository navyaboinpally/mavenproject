package newyeargift;

import java.util.Scanner;

public class finalgift extends gift
{

	public static void main(String[] args)
	{
		System.out.println("****************"+"MENU"+"********************");
		System.out.println("***************"+"CHOCOLATESLIST"+"**************");
		System.out.println("brandname"+"   "+"weight"+"  "+"price");
		System.out.println("milkybar"+"    "+"10kg  "+"   "+"100rs");
		System.out.println("perk    "+"    "+"50kg  "+"   "+"100rs");
		System.out.println("5star   "+"    "+"30kg  "+"   "+"100rs");
		System.out.println("\n");
		System.out.println("***************"+"SWEETSLIST"+"**************");
		System.out.println("brandname"+"   "+"weight"+"  "+"price");
		System.out.println("kaju     "+"    "+"10kg "+"    "+"100rs");
		System.out.println("gulajam  "+"    "+"50kg "+"    "+"100rs");
		System.out.println("ladhuuu  "+"    "+"30kg "+"    "+"100rs");
		Scanner sc =new Scanner(System.in);
		int noofsweets;
		String sweettype;
		System.out.println("************************************");
		System.out.println("enter no of sweets in a gift :");
		noofsweets=sc.nextInt();
		for(int sweetcount=1;sweetcount<=noofsweets;sweetcount++)
		{
			System.out.println("enter the sweet type from the list :");
		    sweettype=sc.next();
			System.out.println("enter the weight of the sweet:");
			int sweetweight=sc.nextInt();
			System.out.println("enter the price of the sweet:");
			int sweetprice=sc.nextInt();
			System.out.println("sweettype:"+sweettype);
			System.out.println("sweetweight:"+sweetweight);
			System.out.println("sweetprice:"+sweetprice);
		
			finalgift obj=new finalgift();
			obj.sweets(sweetweight,sweetprice);
		}
		int noofchocolates;
		String chocolatestype;
		System.out.println("***********************************************");
		System.out.println("enter no of chocolates in a gift :");
		noofchocolates=sc.nextInt();
		for(int chocolatescount=1;chocolatescount<=noofchocolates;chocolatescount++)
		{
			System.out.println("enter the chocolates type from the list :");
			chocolatestype=sc.next();
			System.out.println("enter the weight of the chocolates:");
			int chocolatesweight=sc.nextInt();
			System.out.println("enter the price of the chocolates:");
			int  chocolatesprice=sc.nextInt();
			System.out.println("chocolatestype:"+chocolatestype);
			System.out.println("chocolatesweight:"+chocolatesweight);
			System.out.println("chocolatesprice:"+chocolatesprice);
			finalgift obj=new finalgift();
			obj.chocolates(chocolatesweight,chocolatesprice);
		}
		System.out.println("*******************************************");
		System.out.println("TOTAL NO OF CHOCOLATES IN GIFT IS:"+noofchocolates);
		System.out.println("TOTAL NO OF SWEETS IN GIFT IS:"+noofsweets);
		System.out.println("************************************************");
		System.out.println("**Enjoy the delicious chocolates and sweets**");
		System.out.println("Thankyou");
			
	}

}
