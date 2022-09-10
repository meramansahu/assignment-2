import java.util.Scanner;
class q4if{
public static void main(String[] args){
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
int s=sc1.nextInt();
int y=sc2.nextInt();
if(y>5){
double a=(0.05)*s;
System.out.println(a);
}
else{
System.out.println("you are not eligible for bonous");
}
}
}
