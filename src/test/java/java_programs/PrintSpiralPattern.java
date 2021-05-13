package java_programs;

public class PrintSpiralPattern {

    static void printArr(int arr[][]) {

        for (int temp[] : arr) {
            for (int temp_ : temp) {
                System.out.print(temp_ + "\t");
            }
            System.out.println("");
        }
    }

    static void printArrInSpiralPattern(int arr[][]) {

        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        int dir = 0; // 0 = left->right // 1 = top->bottom // 2 = right->left // 3 = bottom->top

        while (top <= bottom && left <= right) {

            if (dir == 0) {

                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i] + "\t");
                }
                top++;
            } else if (dir == 1) {

                for (int i = top; i <= bottom; i++) {
                    System.out.print(arr[i][right] + "\t");
                }
                right--;
            } else if (dir == 2) {

                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + "\t");
                }
                bottom--;
            } else if (dir == 3) {

                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + "\t");
                }
                left++;
            }

            dir = (dir + 1) % 4;

        }


    }

    public static void main(String[] args) {

        int arr[][] = new int[5][4];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;

        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        arr[1][3] = 8;

        arr[2][0] = 9;
        arr[2][1] = 10;
        arr[2][2] = 11;
        arr[2][3] = 12;

        arr[3][0] = 13;
        arr[3][1] = 14;
        arr[3][2] = 15;
        arr[3][3] = 16;

        arr[4][0] = 17;
        arr[4][1] = 18;
        arr[4][2] = 19;
        arr[4][3] = 20;


        printArr(arr);

        printArrInSpiralPattern(arr);

    }
}
