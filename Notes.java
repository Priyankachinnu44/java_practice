import java.util.Scanner;
class Notes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int amount=1700;
int fcount=amount/500;
amount=amount-fcount*500;
System.out.println("500 notes are:"+fcount);
int tcount=amount/200;
amount=amount-tcount*200;
System.out.println("200 notes are:"+tcount);
int hcount=amount/100;
amount=amount-hcount*100;
System.out.println("100 notes are:"+hcount);
}
}