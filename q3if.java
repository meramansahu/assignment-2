import java.util.Scanner;
class q3if{
public static void main(String[] args){
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
double l=sc1.nextDouble();
if(l>1000)
{
l=l+(0.1)*l;
System.out.println(l);
}
else
{System.out.println(l);
}
}
}
