public class Main{
    public static void main(String[]args){
        GeneticAlgorithm obj_ga=new GeneticAlgorithm(100,0,0,0);
        Population obj_pop=obj_ga.initChromosomeLength(50);
        while (obj_pop.maxOne()==false){
            //obj_pop.print();
            //System.out.println("nope");
        }
   