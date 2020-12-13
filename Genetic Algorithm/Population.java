public class Population{
    Individual[] individual;
    private int populationFitness;
    
    public Population(int sizePopulation){
        individual =new Individual[sizePopulation];
    }
    public int getPopulationFitness(){
        int count_Popu=0;
        for(int i=0;i<individual.length;i++){
            if(individual[i]==1){
                count_Popu++;
            }
        }
        return count_Popu;
    }










    /*public void setIndividual(){

    }
    public void setPopulationFitness(){

    }
    public int getIndividual(){

    }
    public int getFitness(){

    }
    
    public int getSize(){

    }*/

}