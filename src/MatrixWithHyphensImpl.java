public class MatrixWithHyphensImpl extends MatrixImpl{
    protected MatrixWithHyphensImpl(String[][] matrix) {
        super(matrix);
    }

    @Override
    public String[][] fillMatrix(){
        String[][] matrix = this.getMatrix();
        for (int i = 0; i < this.getMatrix().length; i++) {
            for (int j = 0; j < this.getMatrix()[0].length; j++) {
                matrix[i][j] = "-";
            }
        }

        return matrix;
    }
}
