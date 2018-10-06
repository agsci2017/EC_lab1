
//import static MyAlg.iteration;
import org.uncommons.watchmaker.framework.EvolutionaryOperator;



import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!
        
        
        
        //STRATEGY #1 one gene mutation
        //score is 9.3 for 10000 pop, 10000 gen
        
        //for (int i = 0; i < population.size(); i++) {
                //double[] x = population.get(i); //read a vector
                
                ////change one gene
                //x[random.nextInt(x.length)] +=(random.nextDouble()-0.5)/10000.0; 
                
                //population.set(i, x); //write a vector
        //}
        
        
        
        //STRATEGY #2 all genes mutation
        //foreach x in population
        //score is 9.8 for 10000 pop, 10000 gen
        
        for (int i = 0; i < population.size(); i++) {
            
            double[] x = population.get(i);
            
            if (MyAlg.iteration<1000)
            for (int j = 0; j < x.length; j++) {
               x[j]+=(random.nextDouble()-0.5)/10.0;//-0.05 .. +0.05 
            }
            
            if (MyAlg.iteration<2000 && MyAlg.iteration>=1000)
            for (int j = 0; j < x.length; j++) {
               x[j]+=(random.nextDouble()-0.5)/100.0;//-0.005 .. +0.005 
            }
            
            if (MyAlg.iteration<4000 && MyAlg.iteration>=2000)
            for (int j = 0; j < x.length; j++) {
               x[j]+=(random.nextDouble()-0.5)/1000.0;//-0.0005 .. +0.0005 
            }
            
            if (MyAlg.iteration<8000 && MyAlg.iteration>=4000)
            for (int j = 0; j < x.length; j++) {
               x[j]+=(random.nextDouble()-0.5)/10000.0;//-0.00005 .. +0.00005 
            }
            
            if (MyAlg.iteration<10000 && MyAlg.iteration>=8000)
            for (int j = 0; j < x.length; j++) {
               x[j]+=(random.nextDouble()-0.5)/100000.0;//-0.000005 .. +0.000005 
            }
            
            population.set(i, x);
        }

        //result population
        return population;
    }
}
