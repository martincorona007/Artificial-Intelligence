package examples.H7;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
public class Population{
    private Individual[] population;//array of objects A1 A2 A3
    //Individual individual;//A1={0,1,0,0,1} A2={0,1,0,0,1} A3={0,1,0,0,1}
    private double populationFitness=-1;
    
    
    public Population(int sizePopulation){
        this.population=new Individual[sizePopulation];
    }
    public Population(int sizePopulation,int lengthChromosome) {
        this.population=new Individual[sizePopulation];
        for(int i=0;i<sizePopulation;i++){
            Individual individual=new Individual(lengthChromosome);
            this.population[i]=individual;
        }

    }
    public Individual[] getIndividuals(){
        return this.population;
    }
    public Individual getFittest(int offset){
        Arrays.sort(this.population,new Comparator<Individual>(){
            public int compare(Individual s1,Individual s2){
                if(s1.getFitness()>s2.getFitness()){
                    return -1;
                }else if(s1.getFitness()<s2.getFitness()){
                    return 1;
                }
                return 0;

            }
        });
        return this.population[offset];
    }
    public void setPopulationFitness(double fitness){
        this.populationFitness=fitness;
    }
    public double getPopulationFitness(){
        return this.populationFitness;
    }
    public int getSize(){
        return this.population.length;
    }
    public Individual setIndividual(int offset,Individual individual){
        return population[offset]=individual;
    }
    public Individual getIndividual(int offset){
        return population[offset];
    }
    public void shuffle(){
        Random rnd =new Random();
        for(int i=population.length-1;i>0;i--){
            int index =rnd.nextInt(i+1);
            Individual a=population[index];
            population[index]=population[i];
            population[i]=a;
        }
    }
    
    /*
    public int getPopulationFitness(){
        int count_Popu=0;
        for(int i=0;i<population.length;i++){
            count_Popu+=individual.getChromosomeFitness();
        }
        return count_Popu;
    }*/
    /*
    public void setPopulationFitness(){
        populationFitness=getPopulationFitness();
    }
    public boolean maxOne(){
        boolean flag =false;
        for(int i=0;i<population.length;i++){
            if(population[i].getChromosomeFitness()==population.length){
                flag = true;
            }
        }
        return flag;
    }*//*
    public void print(){
        for(int i=0;i<population.length;i++){
            System.out.println("pop "+population[i].toString());
        }
    }*/
  /*  public Individual getIndividual(){
        

    }
*/








    /*public void setIndividual(){

    }

    
    public int getFitness(){

    }
    
    public int getSize(){

    }*/

}