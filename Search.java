import java.io.*;
class Search{

public static void main(String args[])throws IOException{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("enter no of strings");

int n=Integer.parseInt(br.readLine());

String str[]=new String[n];

for(int i=0;i<n;i++)
{

System.out.println("Enter the string");
str[i]=br.readLine();

}
System.out.println("enter string to search");
String search=br.readLine();

boolean found=false;

for(int i=0;i<n;i++)
{
if(search.equalsIgnoreCase(str[i]))

{
System.out.println("found position is"+ (i+1));
found=true;
}
}
if(!found)
{
System.out.println("Not found String");
}

}
}


