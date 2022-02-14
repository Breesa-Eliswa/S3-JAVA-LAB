import java.util.*;
import java.io.*;
class file1
{
    public static void main(String agrs[])
    throws Exception
    {
        FileInputStream fin = new FileInputStream("e1.txt");
        int i =1;
        int ch ;
        System.out.print(i+" ");
        while((ch=fin.read())!=-1)
        {
            System.out.println((char)ch);
            if(ch== '\n')
                  System.out.print(++i+" ");
        }
        fin.close();
    }
}
