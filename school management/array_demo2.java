import java.io.DataInputStream;
class array_demo2
{
	public static void main(String args[])
	{
		int x[]=new int[5];
		int i;
		System.out.println("enter the 5 elements");
		DataInputStream n=new DataInputStream(System.in);
		try
		{
			for(i=0;i<5;i++)
			{
				x[i]=Integer.parseInt(n.readLine());
			}
		}	
		catch(Exception e){}
			System.out.println("the output is:");
		for(i=0;i<5;i++)
		{
			System.out.println(x[i]);
		}
	}
}