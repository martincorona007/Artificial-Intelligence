public class Population{
    Individual[] population;//array of objects A1 A2 A3
    Individual individual;//A1={0,1,0,0,1} A2={0,1,0,0,1} A3={0,1,0,0,1}
    private int populationFitness;
    
    public Population(int sizePopulation,int lengthChromosome) {
        population =new Individual[sizePopulation];
        for(int i=0;i<sizePopulation;i++){
            individual=new Individual(lengthChromosome);
            population[i]=individual;
        }

    }
    public Population(){

    }
    public int getPopulationFitness(){
        int count_Popu=0;
        for(int i=0;i<population.length;i++){
            count_Popu+=individual.getChromosomeFitness();
        }
        return count_Popu;
    }
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
    }/*
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