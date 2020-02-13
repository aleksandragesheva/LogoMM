public class MatrixDiagonalsSequenceImpl extends MatrixDiagonalsImpl{

    protected MatrixDiagonalsSequenceImpl(String[][] matrix, int n) {
        super(matrix, n);
    }

    @Override
    public String[][] fillFirstDiagonal(int columnIndex) {
        String[][] matrix = this.getMatrix();
        int diagonals = this.getN();

        while (diagonals-- > 0) {

            matrix = super.fillFirstDiagonal(columnIndex);
            columnIndex++;
        }
        return matrix;
    }

    @Override
    public String[][] fillSecondDiagonal(int colIndex) {
        String[][] matrix = this.getMatrix();
        int diagonals = this.getN();
        while (diagonals-- > 0) {
            matrix = super.fillSecondDiagonal(colIndex);
            colIndex++;
        }
        return matrix;
    }
}
