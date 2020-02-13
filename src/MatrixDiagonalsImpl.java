import interfaces.MatrixDiagonals;

public class MatrixDiagonalsImpl extends MatrixWithHyphensImpl implements MatrixDiagonals {

    private int n;

    protected MatrixDiagonalsImpl(String[][] matrix, int n) {
        super(matrix);
        this.n = n;
    }

    public int getN() {
        return this.n;
    }

    @Override
    public String[][] fillFirstDiagonal(int colIndex) {
        String[][] matrix = this.getMatrix();
        int row = this.getMatrix().length;

        int count = 0;
        for (int i = row - 1; i >= 0; i--) {
            matrix[i][colIndex + count] = "*";
            count++;
        }

        return matrix;
    }


    @Override
    public String[][] fillSecondDiagonal(int colIndex) {
        String[][] matrix = this.getMatrix();

        for (int i = 0; i <= n; i++) {
            matrix[i][i + colIndex] = "*";
        }
        return matrix;
    }
}
