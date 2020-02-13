import interfaces.Matrix;
import interfaces.MatrixWithTwoMLetters;

import java.util.Scanner;

public class EngineImpl implements Runnable{
    private static final Scanner scanner = new Scanner(System.in);

    public EngineImpl() {
    }
    @Override
    public void run() {
        int n = Integer.parseInt(scanner.nextLine());
        int row = n + 1;
        int col = n * 10;

        String[][] array = new String[row][col];

        Matrix matrix = new MatrixMMImpl(array, n);
        matrix.fillMatrix();

        MatrixWithTwoMLetters matrixMM = new MatrixMMImpl(array, n);
        matrixMM.fillMatrixWithTwoM();

        matrix.printMatrix();
    }
}
