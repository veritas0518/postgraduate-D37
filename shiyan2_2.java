import java.util.Scanner;

public class shiyan2_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][]a=new int[3][4];
        int[][]b=new int[4][3];
        int[][]c=new int[3][3];
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++){
                a[i][j]=s.nextInt();
                b[j][i]=a[i][j];

            }
        }
        System.out.printf("Original matrix:\n");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++){
              // System.out.printf("Original matrix:\n");
                System.out.printf("%d\t",a[i][j]);
            }
            System.out.println();
        }
        //b[4][3]=a[3][4];
        System.out.printf("Transpose:\n");
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
               //System.out.printf("Transpose:\n");
                System.out.printf("%d\t",b[i][j]);
            }
            System.out.println();
        }
        System.out.printf("Matrix multiplication:\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int m=0;m<4;m++){
                    c[i][j]+=a[i][m]*b[m][j];

                }
                System.out.printf("%d\t",c[i][j]);
                //System.out.println();
            }
            System.out.println();
        }

    }
}


