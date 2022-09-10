import java.util.Scanner;
class q11if{
public static void main(String[] args){
Scanner sc1=new Scanner(System.in);
char m=sc1.next().charAt(0);
if(m>='a'&&m<='z')
{
System.out.println("lowercase");
}
else if(m>='A'&&m<='Z')
{
System.out.println("uppercase");
}
else{
System.out.println("not a charecter");
}
}
}