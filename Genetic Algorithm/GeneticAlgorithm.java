public class GeneticAlgorithm{
    private int populationSize;
    private double mutationRate;
    public double crossoverRate;
    public double elitismCount;

    public GeneticAlgorithm(int populationSize,double mutationRate,double crossoverRate, double elitismCount){
        populationSize=populationSize;
        mutationRate=mutationRate;
        crossoverRate=crossoverRate;
        elitismCount=elitismCount;
        setPopulationSize(populationSize);
    }
    public Population initChromosomeLength(int n){
        Population obj_pop= new  Population(getPopulationSize(),n);
        return obj_pop;
    }
    public boolean evaluatePopulation(){
        Population obj=new Population();
        //return obj.maxOne();
        return true;
    }
    public void setPopulationSize(int s){
        populationSize=s;
    }
    public int getPopulationSize(){
        return populationSize;
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