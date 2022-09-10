import java.util.Scanner;
class q13if{
public static void main(String[] args){
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);

char s=sc2.next().charAt(0);
int a=sc1.nextInt();
char F;
char M;
if(s=='F')
{
System.out.println("she works in urban areas");
}
else if(s=='M'&&a>=20&&a<=40){
System.out.println("he may work in anywhere");
}
else if (s=='M'&&a>40&&a<=60)
{
System.out.println("he will work in urban area only");
}
else{
System.out.println("ERROR");}
}
}