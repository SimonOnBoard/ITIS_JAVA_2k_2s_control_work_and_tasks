import java.util.Collection;

public class Mass {
    public static void main(String[] args) {
        int[][] a = new int[8][8];
        //[][][][][][][]
        //[][][][][][][]
        //[][][][][][][]
        //[][][][][][][]
        //[][][][][][][]
        int[][] b = new int[3][];
        b[0] = new int[]{3,5,4,7};
        b[1] = new int[]{24,56,41,73,5236,254,234};
        b[2] = new int[]{5332,135355,125537};
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + ' ');
            }
            System.out.print('\n');
        }


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == j) {
                    a[i][j] = 1;
                } else {
                    if (j > i) {
                        a[i][j] = 5;
                    } else {
                        if(7==i+j){
                            a[i][j] = 3;
                        }
                        else {
                            if(i + j > 7){
                                a[i][j] = 7;
                            }
                            else {
                                a[i][j] = 0;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
