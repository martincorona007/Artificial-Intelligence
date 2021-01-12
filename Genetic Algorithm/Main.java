import java.sql.SQLOutput;
import java.text.DecimalFormat;     
public class Main{
    public static void main(String[]args){
        DecimalFormat df2 = new DecimalFormat("#.###");
        GeneticAlgorithm obj_ga=new GeneticAlgorithm(4,0.01,0.95,0);
        Population obj_pop=obj_ga.initPopulation(8);
        obj_ga.evalPopulation(obj_pop);
        int generation=1;
        int total=0;
      
        while (!obj_ga.isTerminationConditionMet(obj_pop)){
            
            /*Individual individual=new Individual();
            System.out.println("Fitness f(Si) = "+individual.getFitness());*/
            //System.out.println("total 1 "+obj_ga.getTotalFitness());
            //System.out.println("PF "+obj_pop.getPopulationFitness());
           // System.out.println("S "+obj_pop.getFittest(0).getI());
            //total+=obj_pop.getFittest(0).getI();
            //System.out.println("SP "+obj_pop.getSize());
            for(int i=0;i<obj_pop.getSize();i++){
                total+=obj_pop.getFittest(i).getI();

            }
            System.out.println("+++++++++++++++++++++++ Generation "+generation+"+++++++++++++++++++++++++++++++++");
            for(int i=0;i<obj_pop.getSize();i++){
          
                System.out.println("Si "+i+" ["+obj_pop.getFittest(i).toString()+"] f(Si) "+obj_pop.getFittest(i).getI()+" "+df2.format(((float)obj_pop.getFittest(i).getI())/total)+" "+(((float)obj_pop.getFittest(i).getI())/total)*100+"%");

            }
        
            System.out.println("Pupulation Total Fitness "+total);
            //System.out.println(" ["+obj_pop.getFittest(0).toString()+"] ");
          
            total=0;
            //double popuFitness=population.getPopulationFitness();
            //double proporFit=(individual.getFitness()*100)/popuFitness;
            //System.out.println("S "+generation+" ["+obj_pop.getFittest(0).toString()+"] Polulation fitness "+popuFitness+" Fitness f(Si) = "+individual.getFitness()+" Proportionate fitness value: "+proporFit);
            obj_pop=obj_ga.crossoverPopulation(obj_pop);
            obj_pop=obj_ga.mutatePopulation(obj_pop);
            obj_ga.evalPopulation(obj_pop);
            
            generation++;

        }
        System.out.println("Solution Genration "+generation+" ");
        System.out.println("Best solution ["+obj_pop.getFittest(0).toString()+"]");
        
    }
}