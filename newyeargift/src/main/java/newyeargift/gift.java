package newyeargift;

public class gift 
{
	int swtotal;
	int sptotal;
	int cwtotal;
	int cptotal;
	int i;
	int j;
	public void chocolates(int a,int b)
	{
		i=a;
    	j=b;
    	cwtotal=cwtotal+i;
    	cptotal=cptotal+j;
    	System.out.println("total chocolates weight :"+cwtotal);
    	System.out.println("total chocolates price:"+cptotal);
		
		
	}
	
	public void sweets(int a,int b)
	{
			i=a;
	    	j=b;
	    	swtotal=swtotal+i;
	    	sptotal=sptotal+j;
			System.out.println("total sweet weight :"+swtotal);
	    	System.out.println("total sweet price:"+sptotal);
	}

		
		
}
