// continue Statement 
class A26
{
	public static void main(String []args)
	{
		
		int i=0;
		while(i<=10)
		{
			i++;
			if (i==5)
			{
				continue;
			}
			System.out.println("Number is :"+i);
		}
	}
}