import java.util.Scanner;
class q5if{
public static void main(String[] args){
Scanner sc1=new Scanner(System.in);
int m=sc1.nextInt();
if(m<25)
{System.out.println("fail");
}
else if(m>=25&&m<45)
{
System.out.println("E");
}
else if(m>=45&&m<50)
{
System.out.println("D");
}
else if(m>=50&&m<60)
{
System.out.println("C");
}
else if(m>=60&&m<80)
{
System.out.println("B");
}
else if(m>=80&&m<=100)
{
System.out.println("A");
}
}
}