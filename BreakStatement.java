public class BreakStatement
{
	public static void main(String[] args)
	{
		for(int i=0;i<100;i++)
		{
			if(i==10)
				break;
			System.out.println("I="+i);
		}
		System.out.println("Loop Complet");
	}
}