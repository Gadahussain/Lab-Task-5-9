// below email and password are registered in this program
//1 java12@gmail.com  	password = 1111
//2 hussain@gmail.com	password = 2222
//3 someone@gmail.com   password = 3333
//4 gadahussain@gmail.com    pas = 4444
//5 hello@gmail.com     password = 5555

import java.util.*;
class email5{
public static void main(String[]arg){
String email, pwd;
System.out.print("\nEnter your email:");
Scanner obj=new Scanner(System.in);
email=obj.nextLine();
System.out.print("Enter your password to Login:");
pwd=obj.nextLine();
if (email.equals("java12@gmail.com")&&(pwd.equals("1111")))
{
System.out.println("Login Successfully");
System.out.println("Hellow world I am Gada Hussain soomro");
System.out.println("My father's name is Illahi Bux");
}

else if (email.equals("hussain@gmail.com")&&(pwd.equals("2222"))){

System.out.println("welcome to desktop");
System.out.println("my name is Muhammad");
}
else if (email.equals("someone@gmail.com")&&(pwd.equals("3333")))
{

System.out.println("My name is Farman Ali");
System.out.println("My e-mail address is farmanali@gmail.com");
}
else if (email.equals("gadahussain@gmail.com")&&(pwd.equals("4444")))
{

System.out.println("Welcome to screen");
System.out.println("My name is Ramzan Ali");
}
else if (email.equals("hello@gmail.com")&&(pwd.equals("5555")))
{
System.out.println("Welcome to computer");
System.out.println("My name is Shahid Hussain");
}
else
{
System.out.print("Invalid password or email please try again");}
}}




