import java.util.Scanner;
class q12if{
public static void main(String[] args){
Scanner sc1=new Scanner(System.in);
int y=sc1.nextInt();
if(y%4==0&&y%400==0||y%100!=0)
{System.out.println(y+"is leap year");
}
else
{
System.out.println(y+"is not a leap year");
}
}
}