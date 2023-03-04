import java.io.*;
class Evenodd
{
    public static void main(String args[])throws IOException
    {
        int num;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter a number");
        num=Integer.parseInt(br.readLine());
        if(num%2==0)
            System.out.println(num+ "is even");
        else
            System.out.println(num+ "is odd");
    }
}