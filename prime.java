import java.io.*;
public class prime 
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter the number");
		int n=Integer.parseInt(br.readLine());
		prime ob=new prime();
		int m=ob.check(n);
		if(m==1)
		{
			System.out.println(n+" is prime no");
			
		}
		else
		{
			System.out.print(n+" is not prime");
		}
	}
	public int check(int n1)
	{
		int f=0;
		for(int i=1;i<=n1;i++)
		{
			if(n1%i==0)
				f++;
		}
		if(f==2)
		{
			return 1;
		}
		else
		return 0;
	}
}


