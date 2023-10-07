import java.util.Scanner;
class Types_Of_Numbers
{
    public  void Num()
       {
        int choice=0;
        while(choice!=8008)
        {
           Scanner sc=new Scanner(System.in);
           System.out.println("");
           System.out.println("");
           System.out.println("");
           System.out.println("(っ◔◡◔)っ * MENU *");
           System.out.println("========================");
           System.out.println("1.  Armstrong Number");
           System.out.println("2.  Automorphic Number");
           System.out.println("3.  Buzz Number");
           System.out.println("4.  Krishnamurthy Number");
           System.out.println("5.  Neon Number");
           System.out.println("6.  Naveen Number");
           System.out.println("7.  Prime Number");
           System.out.println("8.  Perfect Number");
           System.out.println("9.  Palindrome Number");
           System.out.println("10. Pronic Number");
           System.out.println("11. Spy Number");
           System.out.println("12. Special Number");
           System.out.println("13. Tech Number");
           System.out.println("14. Ugly Number");
           System.out.println("15. LCM__HCF");
           System.out.println("16. Magic Number");          
           System.out.println("17. Emrip Number");
           System.out.println("18. Exit");
           int menu=sc.nextInt();
           switch(menu)
           {
            case 1:
                {
                    System.out.println("ARMSTRONG NUMBER");
                    System.out.println("An armstrong number is a positive number which is equal to the sum of the cubes of its digits.\n for e.g.153");
                    int num,rem,cube,i;
                    int sum=0;
                    System.out.println("Enter the number to be checked: ");
                    num=sc.nextInt();
                    for(i=num;i>0;i/=10)
                    {
                        rem=i%10;
                        cube=rem*rem*rem;
                        sum=sum+cube;
                    }
                    if(sum==num)
                    System.out.println(num+" is an Armstrong Number");
                    else
                    System.out.println(num+" is not an Armstrong Number");
                    break;
                }
            case 2:
               {
                   System.out.println("AUTOMORPHIC NUMBER");
                   System.out.println("Enter the number to be checked: ");
                   String num=sc.next();
                   int len=num.length();
                   int num1=Integer.parseInt(num);
                   int sq=num1*num1;
                   if(len==1)
                   {
                       int r=sq%10;
                       if(r==num1)
                       System.out.println("The number is Automorphic");
                       else
                       System.out.println("The number is not Automorphic");
                   }
                       else if(len==2)
                       {
                           int r=sq%100;
                           if(r==num1)
                           System.out.println("The number is Automorphic");
                           else
                           System.out.println("The number is not Automorphic");
                       }
                   break;
               }
           case 3:
              {
                  System.out.println("BUZZ NUMBER");
                  System.out.println("A number which is either divsible by 7 or ends with 7 is called Buzz NUmber.For e.g. 77");
                  System.out.println("Enter the number");
                  int num=sc.nextInt();
                  if(num%7==0)
                  System.out.println("The number is Buzz Number");
                  else
                  System.out.println("The number is not Buzz Number");
                  break;
              }
           case 4:
              {
                  System.out.println("KRISHNAMURTHY NUMBER");
                  System.out.println("A number whose sum of fractorial of digits is equal to the number itself is called KrishnaMurthy Number. \n  For e.g.1,2,145");
                  System.out.println("Enter any number:");
                  int num=sc.nextInt();
                  int temp=num;
                  int digit,sum=0;
                  while(num==0)
                  {
                      digit=num%10;
                  }
                  if(temp==sum)
                  {
                      System.out.println("The number is KrishnaMurthy Number");
                  }
                  else
                  {
                      System.out.println("The number is not KrishnaMurthy Number");
                  }
                  break;
              }
           case 5:
              {
                  System.out.println("NEON NUMBER");
                  System.out.println("A number is said to be neon number if the sum of the digits or square of the digits are equal to the number.");
                  System.out.println("Enter the number to be checked");
                  int num=sc.nextInt();
                  int sq=num*num;
                  int sum=0;
                  while(sq!=0)
                  {
                      int d=sq%10;
                      sum +=d;
                      sq /=10;
                  }
                  if(num==sum)
                  System.out.println(num+ " is a neon number");
                  else
                  System.out.println(num+ " is not a neon number");
                  break;
              }
          case 6:
              {
                  System.out.println("NAVEEN NUMBER");
                  System.out.println("A number is said to be naveen if the base of a given number divisible by the sum of its digits. \n For e.g.1, 10");
                  int n,num,r;
                  int sum=0;
                  System.out.println("Enter the number: ");
                  n=sc.nextInt();
                  num=n;
                  while(num>0)
                  {
                      r=num%10;
                      sum=sum+r;
                      num=num/10;
                  }
                  if(n%sum==0)
                  {
                      System.out.println("It is a Naveen Number");
                  }
                  else
                  {
                      System.out.println("It is not a Naveen Number");
                  }

                  break;
              }
           case 7:
              {
                  System.out.println("PRIME NUMBER");
                  System.out.println("The number that can be divided exactly by one and the number itself is called Prime Number. \n For e.g.2,3,5,7");
                  boolean number=false;
                  System.out.println("Enter the number");
                  int num=sc.nextInt();
                  for(int i=2;i<=num/2;++i)
                  {
                      if(num%i==0)
                      {
                          number=true;
                          break;
                      }
                  }
                  if(!number)
                  System.out.println(num+" is a prime number");
                  else
                  System.out.println("The number is not prime number");
                  break;
              }
           case 8:
              {
                  System.out.println("PERFECT NUMBER");
                  System.out.println(" A number whose sum of factors is equal to the number is called a perfect number.e.g.28");
                  int n,sum=0;
                  System.out.print("Enter the number:");
                  n=sc.nextInt();
                  int i=1;
                  while(i<=n/2)
                  {
                      if(n%i==0)
                      {
                          sum=sum+i;
                      }
                      i++;
                  }
                  if(sum==n)
                  {
                      System.out.println(n+ "is a perfect number.");
                  }
                  else
                  {
                      System.out.println(n+ "is not a perfect number.");
                  }
                  break;
              }
           case 9:
              {
                  System.out.println("PALINDROME NUMBER");
                  System.out.println("A palindromic number is a number that reamins same even its digits are reversed.For e.g.121");
                  int rem=0,rev=0;
                  System.out.println("Enter the number:");
                  int num=sc.nextInt();
                  int temp=num;
                  while(num>0)
                  {
                      rem=num%10;
                      rev=rev*10+rem;
                      num=num/10;
                  }
                  if(temp==rev)
                  System.out.println(temp+" is Palindrone:");
                  break;
              }
           case 10:
              {
                  System.out.println("PRONIC NUMBER");
                  System.out.println("A number is said to be pronic if the product of two consecutive integers.For e.g.2,6,12");
                  int a,i,pro=0,st=0;
                  System.out.println("Enter the to be checked number:");
                  a=sc.nextInt();
                  for(i=1;a<=a;i++)
                  {
                      pro=i*(i+1);
                      if(pro==a)
                      st=1;
                      break;
                  }
                  if(st==1)
                  {
                      System.out.println("The number is Pronic ");
                  }
                  else
                  {
                      System.out.println("The number is not pronic");
                  }
                  break;
              }
           case 11:
              {
                  System.out.println("SPY NUMBER");
                  System.out.println("A positive integer is called a spy number if the sum and product of its digits are equal. For e.g.123 ");
                  int rem,quo,pro,sum,ano;
                  System.out.println("Enter the number ");
                  int num=sc.nextInt();
                  if(num<100)
                  {
                      rem=num%10;
                      quo=num/10;
                      pro=rem*quo;
                      sum=rem =quo;
                      if(pro==sum)
                      System.out.println("It is a spy number");
                      else
                      System.out.println("It is not a spy number");
                  }
                  else if(num>100&&num<1000)
                  {
                      rem=num%10;
                      int temp=num/10;
                      quo=temp%10;
                      ano=num/100;
                      sum=rem+quo+ano;
                      pro=rem*quo*ano;
                      if(pro==sum)
                      System.out.println("It is a spy number");
                      else
                      System.out.println("It is not a spy number");
                  }
                  else
                  System.out.println("INVALID INPUT");
                  break;
              }
           case 12:
              {
                  System.out.println("SPECIAL NUMBER");
                  System.out.println("A special number is a number whose sum of factorial is equal to the number itself.For e.g.1");
                  System.out.println("Enter the number: ");
                  int num=sc.nextInt();
                  int sum=0;
                  int temp=num;
                  while(temp!=0)
                  {
                      int a=temp%10;
                      int fact=1;
                      for(int i=1;i<a;i++)
                      {
                          fact=fact*i;
                      }
                      sum=sum+fact;
                      temp=temp/10;
                  }
                  if(sum==num)
                  {
                      System.out.println(num+" is a special number");
                  }
                  else
                  {
                      System.out.println(num+" is not a special number");
                  }
                  break;
                  }
           case 13:
              {
                  System.out.println("TECH NUMBER");
                  System.out.println("A number is tech number if the given number has an even number of digits and \n it can be exactly divided into two parts.For e.g.2025");
                  System.out.println("Enter the number");
                  int num=sc.nextInt();
                  int co=0;
                  while(num>0)
                  {
                      int d=num%10;
                      co++;
                      num=num/10;
                  }
                  if(co%2==0)
                  {
                      int s=num%100;
                      int t=num/100;
                      int sum=s+t;
                      int pro=sum*sum;
                      if(pro==num)
                      {
                          System.out.println("Given number is a tech number");
                      }
                  }
                  else
                  System.out.println("Given number is not a tech number ");
                  break;
              }
           case 14:
              {
                  System.out.println("UGLY NUMBER");
                  System.out.println("If a number has only 2,3 or 5 prime factors and by convention 1 is also included the number is called Ugly number. \n  For e.g. 3,4,6,89,10,");
                  System.out.println("Input the Integer Number:");
                  int n=sc.nextInt();
                  if(n<=0)
                  {
                      System.out.println("Input a Correct Number");
                  }
                  int x=0;
                  while(n!=1)
                  {
                          if(n%5==0)
                      {
                          n/=5;
                      }
                          else if(n%3==0)
                      {
                          n/=3;
                      }
                          else if(n%2==0)
                      {
                          n/=2;
                      }
                          else
                      {
                          System.out.println("It is not an Ugly Number");
                          x=1;
                          break;
                      }
                  }
                   if(x==0)
                    System.out.println("It is an Ugly Number");
                     break;
              }
           case 15:
              {
                  System.out.println("LCM and HCF");
                  System.out.println("LCM is the lowest possible number that can be divisible by two numbers.");
                  System.out.println("HCF is the largest possible integer that can exactly divide two numbers.");
                  int hcf=0,a;
                  System.out.println("Enter the first number:");
                  int num1=sc.nextInt();
                  System.out.println("Enter the second number:");
                  int num2=sc.nextInt();
                  int pro=(num1*num2);
                  for(a=1;a<=pro;a++)
                  {
                      if(num1%a==0 && num2%a==0)
                      hcf=a;
                  }
                  System.out.println("The HCF of the given numbers are: "+hcf);
                  int lcm=(num1*num2)/hcf;
                  System.out.println("The LCM of the given numbers are: "+lcm);
                  break;
              }
           case 16:
              {
                  System.out.println("MAGIC NUMBER");
                  System.out.println("A magic number is a number which gives sum exactly 1 when its digits are recursively added.For e.g.1252");
                  int n,rem=1,num;
                  int sum=0;
                  System.out.println("Enter the number: ");
                  n=sc.nextInt();
                  num=n;
                  while(num>9)
                  {
                      while(num>0)
                      {
                          rem=num&10;
                          sum=sum+rem;
                          num=num/10;
                      }
                      num=sum;
                      sum=0;
                  }
                  if(num==1)
                  {
                      System.out.println("The enterd number is a magic number");
                  }
                  else
                  {
                      System.out.println("The enterd number is not a magic number");
                  }
                  break;
              }
           case 17:
              {
                  System.out.println("EMRIP NUMBER");
                  System.out.println("An emrip number is a prime number that results in a different prime when its decimal digits are reversed.For e.g.13");
                  int num=0;
                  int temp=num;
                  int rev=0,rem=0,count=0;
                  System.out.println("Enter the number to be checked:");
                  num=sc.nextInt();
                  for(int i=2;i<=num/2;++i)
                  {
                      if(num%i==0)
                      {
                          count++;
                      }
                  }
                  while(num>0)
                  {
                      rem=num%10;
                      rev=rev*10+rem;
                      num=num/10;
                  }
                  int co=0;
                  for(int i=2;i<=rev/2;++i)
                  {
                      if(rev%i==0)
                      {
                          co++;
                      }
                  }
                  if(co==count)
                  System.out.println("ITS EMRIP NUMBER");
                  else
                  System.out.println("Its not emrip number");
                  break;
                  }
           case 18:
                  System.out.println("Exiting............");
                  System.out.println("(っ◔◡◔)っ -: THANK YOU FOR USING THIS PROGRAM :-");
                  choice=8008;
                  break;               
           }   
           } 
       }
}