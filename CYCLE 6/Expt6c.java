import java.io.*;
class Expt6c
{
	public static void main(String [] args) 
  throws Exception
	{
		try
		{
			FileInputStream fin = new FileInputStream("expt.txt");
			int i;
			while((i=fin.read())!=-1)
				System.out.println((char)i);
			fin.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
}
