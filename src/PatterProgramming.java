public class PatterProgramming {
    //------Star Pattern--------//
    public static void HollowTriangle(int n){
        int i,j,k;
        for(i=1;i<=n;i++){
            for (j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++){
                if(k==1||i==n||k==(2*i-1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void RevereseHollowTriangle(int n){
        int i,j,k;
        for(i=n;i>=1;i--){
            for (j=i;j<n;j++){
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++){
                if(k==1||i==n||k==(2*i-1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void LeftPyramid(int n){
        int i,j;
        for (i=0;i<n;i++){
            for (j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void RightPyramid(int n){
        int i,j;
        for (i=0;i<n;i++){

            for (j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Triangle(int n){
        int i,j;
        for (i=0;i<n;i++){
            for (j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Diamond(int n){
        int row,col,s;
        for (row=0;row<2*n;row++){
            int c= row>n ? 2*n-row : row;
            for (s=0;s<=n-c;s++){
                System.out.print(" ");
            }
            for (col=0;col<c;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void RightPascal(int n){
        int row,col,s;
        for (row=0;row<2*n;row++){
            int c= row>n ? 2*n-row : row;
            for (col=0;col<c;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //------Number Pattern--------//

    public static void Rightnumbers(int n){
        int i,j;
        for (i=0;i<n;i++){
            for (j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void Leftnumbers(int n){
        int i,j;
        for (i=0;i<n;i++){
            for (j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void PascalTriangle(int n){
        int i,j,k;
        for(i=0;i<=n;i++){
            for(j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            int x=1;
            for (k=1;k<=i;k++){
                System.out.print(x+" ");
                x=x*(i-k)/k;
            }
            System.out.println("");
        }
    }
    public static void ReverseNumberTriangle(int n){
        int i,j;
        for (i=1;i<=n;i++){
            for (int s=1;s<i;s++){
                System.out.print(" ");
            }
            for (j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void NumberincreaseTriangle(int n){
        int i,j,k=1;
        for (i=0;i<=n;i++){
            for (int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void PalindromeDiamod(int n){
        for (int row=1;row<=2*n;row++){
            int c= row>n ? 2*n-row : row;
            for (int s=0;s<n-c;s++){
                System.out.print("  ");
            }
            for (int col =c;col>=1;col--){
                System.out.print(col+" ");
            }
            for (int col=2;col<=c;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void PalindromeTriangle(int n){
        for (int row=1;row<=n;row++){
            for (int s=0;s<=n-row;s++){
                System.out.print("  ");
            }
            for (int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for (int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        //------Star Pattern--------//

        //RevereseHollowTriangle(n);
        //HollowTriangle(n);
        //RightPascal(n);
        //LeftPyramid(n);
        RightPyramid(n);
        //Triangle(n);
        //Diamond(n);

        //------Number Pattern--------//

        //Rightnumbers(n);
        //Leftnumbers(n);
        //PascalTriangle(n);
        //ReverseNumberTriangle(n);
        //NumberincreaseTriangle(n);
        //PalindromeDiamod(n);
        //PalindromeTriangle(n);
    }
}
