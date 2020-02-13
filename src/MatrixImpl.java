import interfaces.Matrix;

public abstract class MatrixImpl implements Matrix {
    private String[][] matrix;

    protected MatrixImpl(String[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public String[][] getMatrix() {
        return this.matrix;
    }

    @Override
    public abstract String[][] fillMatrix();

    @Override
    public  void printMatrix(){
        for (int i = 0; i < this.getMatrix().length; i++) {
            for (int j = 0; j < this.getMatrix()[0].length; j++) {
                System.out.print(this.getMatrix()[i][j]);
            }
            System.out.println();
        }
    }
}
