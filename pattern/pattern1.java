import java.util.*;
public class pattern1 {
    static void pat1(int row,int col)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void pat2(int row,int col)
    {
        for(int i=row;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat3(int row,int col)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pat4(int row)
    {
        int t1=row/2;
        int t2=t1+1;
        for(int i=1;i<=t1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=t2;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat5(int row)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }


            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    static void pat6(int row)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=row-i+1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat7(int row)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i+1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat8(int row)
    {
        int x=1;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*row-i-x;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            x++;
        }
    }
    static void pat9(int row)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
               System.out.print("*"+" "); 
            }
            System.out.println();
        }
    }
    static void pat10(int row)
    {
    
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=row-i;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        
        }
    }
    static void pat11(int row)
    {
        if(row%2==0)
        {
            int t1=row/2;
            int t2=t1;
        
        for(int i=0;i<t1;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=t1-i;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        
        }
        for(int i=0;i<t2;i++)
        {
            for(int j=0;j<t2-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
               System.out.print("*"+" "); 
            }
            System.out.println();
        }

        }
        else 
        {
            System.out.println("please enter even number");
        }
    }
    static void pat12(int row)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row-i-1;j++)
            {
                System.out.print(" ");
            }
            if(i==0)
            {
                System.out.println("*");
            }
            else if(i==row-1)
            {
                for(int k=1;k<=2*row-1;k++)
                {
                    System.out.print("*");
                }
            }
            else 
            {
                System.out.print("*");
                for(int l=0;l<2*i-1;l++)
                {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
    static void pat13(int row)
    {
    int x=2;
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<i;j++)
        {
            System.out.print(" ");
        }
        if(i==0)
        {
            for(int k=1;k<=2*row-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        else if(i==row-1)
        {
            System.out.println("*");
        }
        else 
        {
            for(int l=1;l<=2*row-i-x;l++)
            {
                if(l==1 )
                {
                    System.out.print("*"+" ");
                }
                else if(l==2*row-i-x)
                {
                    System.out.println("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
        
        }
        x++;
    }
    }

    public static void main(String[] args) {
        pat13(50);

    }

    
}
