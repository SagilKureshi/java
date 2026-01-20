import java.util.Arrays;

class Jagged_array {
    public static void main(String[] args) {

        int[][] SK = new int[3][];

        SK[0] = new int[3];
        SK[0][0] = 11;

        SK[1] = new int[2];
        SK[1][0] = 23;

        SK[2] = new int[2];
        SK[2][0] = 89;

        System.out.println(Arrays.deepToString(SK));
    }
}

