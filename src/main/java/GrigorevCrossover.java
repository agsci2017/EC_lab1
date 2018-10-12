import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GrigorevCrossover extends AbstractCrossover<double[]> {
    protected GrigorevCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();

        // your implementation:
        
        //
        int len = p1.length;
        //идем по длине массива
        //случайным образом выбираем от кого наследовать каждый элемент
        
        //random exclusive crossover for 2 childs
        double[] child1 = new double[len];
        double[] child2 = new double[len];
        
        for (int j = 0; j < len; j++) {
            
            if(random.nextBoolean()){
                child1[j] = p1[j];
                child2[j] = p2[j];
            } else {
                child1[j] = p2[j];
                child2[j] = p1[j];
            }
            
        }
        
        children.add(child1);
        children.add(child2);
        //children.add(p1);
        //children.add(p2);
    
        
        return children;
    }
}
