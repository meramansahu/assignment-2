import java.util.Scanner;
class q6if{
public static void main(String[] args){
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
Scanner sc3=new Scanner(System.in);
int n1=sc1.nextInt();
int n2=sc2.nextInt();
int n3=sc3.nextInt();
if(n1>n2&&n1>n3&&(n2>n3))
{
System.out.println(n1+"is oldest");
System.out.println(n3+"is youngest");
}else if(n2>n1&&n2>n3&&(n3>n1))
{System.out.println(n2+"is oldest");
System.out.println(n1+"is youngest");}
else if(n3>n1&&n3>n2&&(n1>n2))
{System.out.println(n3+"is oldest");
System.out.println(n2+"is youngest");
}
}}