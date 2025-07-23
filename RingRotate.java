import java.util.Scanner;

public class RingRotate {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scn.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the " + n + "x" + m + " matrix: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.print("Enter the ring number (sno): ");
        int sno = scn.nextInt();
        System.out.print("Enter the number of rotations (rno): ");
        int rno = scn.nextInt();

        ringrotate(arr, sno, rno);

        display(arr);
    }

    public static void ringrotate(int[][] arr, int sno, int rno) {
        int[] la = fill1Dfrom2D(arr, sno);
        rotateID(la, rno);
        fill2Dfrom1D(arr, la, sno);
    }

    public static int[] fill1Dfrom2D(int[][] arr, int sno) {
        int rmin = sno - 1;
        int cmin = sno - 1;
        int rmax = arr.length - sno;
        int cmax = arr[0].length - sno;

        int sz = 2 * (rmax - rmin + cmax + cmin);

        int[] la = new int[sz];
        int idx = 0;

        for(int row = rmin; row <= rmax; row++) {
            la[idx] = arr[row][cmin];
            idx++;
        }
        cmin++;

        for(int col = cmin; col <= cmax; col++) {
            la[idx] = arr[rmax][col];
            idx++;
        }
        rmax--;

        for(int row = rmax; row >= rmin; row--) {
            la[idx] = arr[row][cmax];
            idx++;
        }
        cmax--;

        for(int col = cmax; col >= cmin; col--) {
            la[idx] = arr[rmin][col];
            idx++;
        }
        rmin++;
    }
}
