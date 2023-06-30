import java.util.Scanner;

public class Patterns 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n------Patter Printing Program------");
        System.out.println("""
                           \t1  - Solid_Rectangle
                           \t2  - Hollo_Rectangle
                           \t3  - Half_Pyramid
                           \t4  - Inverted_Half_Pyramid
                           \t5  - Right_Half_Pyramid
                           \t6  - Number_Half_Pyramid1
                           \t7  - Number_Half_Pyramid2
                           \t8  - Inverted_Number_Half_Pyramid
                           \t9  - Number_Pyramid
                           \t10 - Floy's_Triangle
                           \t11 - Binary_Triangle
                           \t12 - ButterFly(r)
                           \t13 - Solid_Rhombus
                           \t14 - Palindromic_Number_Pyramid
                           \t15 - Diamond_Pattern
                           \t0  - Exit""");
        
        
        for(int i=0; i<20; ++i)
        {
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            
            if(choice==0) break;
            
            System.out.print("Enter number of rows: ");
            int r = sc.nextInt();
            
            switch(choice){
                case 1 -> {
                    System.out.print("Enter number of cols.: ");
                    int c = sc.nextInt();
                    solidRectangle(r, c);
                }
                case 2 ->{
                    System.out.print("Enter number of cols.: ");
                    int col = sc.nextInt();
                    holloRectangle(r, col);
                } 
                case 3 -> halfPyramid(r);
                case 4 -> invertedHalfPyramid(r);
                case 5 -> rightHalfPyramid(r);
                case 6 -> numberHalfPyramid1(r);
                case 7 -> numberHalfPyramid2(r);
                case 8 -> iNumberHalfPyramid(r);
                case 9 -> numberPyramid(r);
                case 10 -> floysTriangle(r);
                case 11 -> binaryTriangle(r);
                case 12 -> butterFly(r);
                case 13 -> solidRhombus(r);
                case 14 -> palindromicNumberPyramid(r);
                case 15 -> diamondPattern(r);
                default -> System.out.println("Enter wrong choice");

            }
        }   
    }

    // ---------------------------------------------------------------------------------------------------------------------------
    public static void solidRectangle(int r, int c)
    {
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
                System.out.print("* ");
            System.out.println("");
        }
    }
   
    // ---------------------------------------------------------------------------------------------------------------------------
    public static void holloRectangle(int r, int c)
    {
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(i==0 || j==0 || j==c-1 || i==r-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
    
    // ---------------------------------------------------------------------------------------------------------------------------
    public static void halfPyramid(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
                System.out.print("* ");
            
            System.out.println("");
        }
    }

    // ---------------------------------------------------------------------------------------------------------------------------
    public static void invertedHalfPyramid(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=n; j>i; j--)
                System.out.print("* ");
            
            System.out.println("");
        }
    }

    // ---------------------------------------------------------------------------------------------------------------------------
    public static void rightHalfPyramid(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; ++j)
                System.out.print(" ");
            
            for(int j=1; j<=i; ++j)
                System.out.print("*");
            System.out.println();
        }
    }
    
    // ---------------------------------------------------------------------------------------------------------------------------
    public static void numberHalfPyramid1(int n)
    {
        for(int i=0; i<n; ++i){
            for(int j=0; j<=i; ++j)
                System.out.printf("%d ", i+1);
            System.out.println("");
        }
    }

    // ---------------------------------------------------------------------------------------------------------------------------
    public static void iNumberHalfPyramid(int n)
    {
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--)
                System.out.printf("%d ", j);
            System.out.println("");
        }
    }

    // ---------------------------------------------------------------------------------------------------------------------------
    public static void floysTriangle(int n)
    {
        int c = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++)
                System.out.printf("%d ", ++c);
            System.out.println("");
        }
    }

    // ---------------------------------------------------------------------------------------------------------------------------
    public static void binaryTriangle(int n)
    {
        int c = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                c++;
                if((i+j)%2==0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println("");
        }
    }

    // ---------------------------------------------------------------------------------------------------------------------------



        
    
    


    
}

    

