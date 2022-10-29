import java.io.*;
import java.util.*;
class student 
{ 
 

    public static void main(String args[])
    { 
        Scanner object=new Scanner(System.in);
        int i;
        int n=10;
        String[] string=new String[100];
        int a[]=new int[100];
        int b[]=new int[100];
        long c[]=new long[1000];
        int d[]=new int[100];
        for(i=0;i<n;i++)
        {
            System.out.println("enter the name"); 
            string[i]=object.next();
            System.out.println("enter the roll no");
            a[i]=object.nextInt();
            System.out.println("enter the age");
            b[i]=object.nextInt();
            System.out.println("enter the phone no");
            c[i]=object.nextLong();
            System.out.println("enter the cgpa");
            d[i]=object.nextInt();


        }
        System.out.println("name"+"\trollno"+"\tage"+"\tphone"+"\t    cgpa");
        for(i=0;i<n;i++)
        { 
            System.out.println(string[i]+"\t"+a[i]+"\t"+b[i]+"\t"+c[i]+"\t"+d[i]);
        }
        int larg;
        larg=d[0];
        for(i=0;i<n;i++)
        { 
            if(larg<d[i])
            { 
                larg=d[i];

            }
            
        }
        for(i=0;i<n;i++)
        { 
            if(larg==d[i])
            { 
                System.out.println(string[i]);
            }
        }
        int sml;
        sml=b[0];
        for(i=0;i<n;i++)
        { 
            if(sml>b[i])
            { 
                sml=b[i];
            }
        }
        for(i=0;i<n;i++)
        { 
            if(sml==b[i])
            { 
                System.out.println(a[i]);
            }
        }
        int m=0;
       
       
        
        for(i=0;i<n;i++)
        { 
            if(string[i].compareTo("ANU")==0)
            { 
               m=i;
            }
        }
        System.out.println(c[m]);
        }
}
