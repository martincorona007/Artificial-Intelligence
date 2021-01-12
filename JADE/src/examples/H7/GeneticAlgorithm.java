package examples.H7;
import java.util.Arrays;
public class GeneticAlgorithm{
    private int populationSize;
    private double mutationRate;
    private double crossoverRate;
    private int elitismCount;
    private int totalFitness;
    public GeneticAlgorithm(int populationSize,double mutationRate,double crossoverRate,int elitismCount){
        this.populationSize=populationSize;
        this.mutationRate=mutationRate;
        this.crossoverRate=crossoverRate;
        this.elitismCount=elitismCount;
    }
    public Population initPopulation(int n){
        Population obj_pop=new Population(this.populationSize,n);
        return obj_pop;
    }
    public double calcFitness(Individual individual){
        int correctGenes=0;
        for(int i=0;i<individual.getChromosomeLength();i++){
            if(individual.getGene(i)==1){
                correctGenes+=1;
                
            }
        }
        //System.out.print(" {"+correctGenes+"}");
       // System.out.print(" *"+individual.getI());
        //setTotalFitness(correctGenes);
        double fitness=(double)correctGenes/individual.getChromosomeLength();
        //System.out.print(" +"+fitness);
        individual.setFitness(fitness);
        return fitness;
    }

    public void evalPopulation(Population population){
        double populationFitness=0;
        for(Individual individual:population.getIndividuals()){
            populationFitness+=calcFitness(individual);
        }
        population.setPopulationFitness(populationFitness);
    }
    public boolean isTerminationConditionMet(Population population){
        for(Individual individual: population.getIndividuals()){
            if(individual.getFitness()==1){
                return true;
            }
        }
        return false;
    }
    public Individual selectParent(Population population){
        Individual individuals[]=population.getIndividuals();
        double populationFitness=population.getPopulationFitness();
        double rouletteWheelPosition=Math.random()*populationFitness;
        double spinWheel=0;
        for(Individual individual:individuals){
            spinWheel+=individual.getFitness();
            if(spinWheel>=rouletteWheelPosition){
                return individual;
            }
        }
        return individuals[population.getSize()-1];
    }
    public Population crossoverPopulation(Population population){
        Population newPopulation =new Population(population.getSize());
        for(int i=0;i<population.getSize();i++){
            Individual parent1=population.getFittest(i);
            if(this.crossoverRate>Math.random() && i>=this.elitismCount){
                Individual offspring=new Individual(parent1.getChromosomeLength());
                Individual parent2=selectParent(population);
                for(int j=0;j<parent1.getChromosomeLength();j++){
        
                        if(0.5>Math.random()){
                            offspring.setGene(j,parent1.getGene(j));
                        }else{
                            offspring.setGene(j,parent2.getGene(j));
                        }
                    
                }
                newPopulation.setIndividual(i,offspring);
            }else{
                newPopulation.setIndividual(i,parent1);
            }
        }
        return newPopulation;
    }
    public Population mutatePopulation(Population population){
        Population newPopulation=new Population(this.populationSize);
        for(int i=0;i<population.getSize();i++){
            Individual individual=population.getFittest(i);
            for(int j=0;j<individual.getChromosomeLength();j++){
                if(i>this.elitismCount){
                    if(this.mutationRate>Math.random()){
                        int newGene=1;
                        if(individual.getGene(j)==1){
                            newGene=0;
                        }
                        individual.setGene(j,newGene);
                    }
                }
                newPopulation.setIndividual(i,individual);
            }
        }
        return newPopulation;
    }
    public void setTotalFitness(int i){
        this.totalFitness=i;
    }
    public int getTotalFitness(){
        return totalFitness;
    }
    
    
    
    /*
    
    public int calculateFitness(){

    }
    public int selectParects(){

    }
    public void getPopulationFitness(){

    }
    public int evaluatePopulation(){

    }*/
}