import java.util.Scanner;
class q8if{
public static void main(String[] args){
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
int h=sc1.nextInt();
double a=sc2.nextDouble();
double c=(a/h)*100;
if(c>75)
{
System.out.println(c+"% you are elligible for exam");
}
else{
System.out.println(c+"% you are not elligible for exam");
}
}
}