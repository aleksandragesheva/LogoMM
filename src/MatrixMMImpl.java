import interfaces.MatrixWithTwoMLetters;

public class MatrixMMImpl extends MatrixDiagonalsSequenceImpl implements MatrixWithTwoMLetters {
    private static final int PARTS_OF_TWO_M = 8;
    private static final int HALF_PARTS_OF_TWO_M = 4;

    protected MatrixMMImpl(String[][] matrix, int n) {
        super(matrix, n);
    }

    @Override
    public String[][] fillMatrixWithTwoM() {
        String[][] matrix = this.getMatrix();

        for (int i = 0; i < HALF_PARTS_OF_TWO_M; i++) {
            int index = this.getN() * i;
            if (i % 2 == 0) {
                matrix = this.fillFirstDiagonal(index);
            } else {
                matrix = this.fillSecondDiagonal(index);

            }
        }

        for (int i = HALF_PARTS_OF_TWO_M + 1; i <= PARTS_OF_TWO_M; i++) {
            int index = this.getN() * i;
            if(i % 2 != 0){
                matrix = this.fillFirstDiagonal(index);
            }else {
                matrix = this.fillSecondDiagonal(index);
            }

        }

        return matrix;
    }
}
