import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.Random;

public class MyFactory extends AbstractCandidateFactory<double[]> {

    private int dimension;

    public MyFactory(int dimension) {
        this.dimension = dimension;
    }

    public double[] generateRandomCandidate(Random random) {
        double[] solution = new double[dimension]; //dimension = 2
        // x from -5.0 to 5.0
        
        // your implementation:
        //инициализируем вектор значениями -5.0 .. +5.0
        for (int i = 0; i < dimension; i++) {
            solution[i] = (random.nextDouble()-0.5); //-0.5 .. +0.5
            solution[i] *= 10; //-5.0 .. +5.0
        }
        

        return solution;
    }
}
