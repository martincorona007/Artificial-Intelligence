import java.lang.Math;
import java.util.Random;
public class Individual{
    private int[] chromosome;
    private double fitness=-1;
    
    public Individual(){}
    public Individual(int chromosomeLength){
        this.chromosome=new int[chromosomeLength];
        //System.out.print("Indi "+chromosomeLength);
        for(int i=0;i<chromosomeLength;i++){
            if(0.5<Math.random()){
                this.setGene(i,1);
            }else{
                this.setGene(i,0);
            }
        }
    }
    
    public int[] getChromosome(){
        return this.chromosome;
    }
    public int getChromosomeLength(){
        return this.chromosome.length;
    }
    public void setGene(int offset,int gene){
        this.chromosome[offset]=gene;
    }
    public int getGene(int offset){
        return this.chromosome[offset];
    }
    public void setFitness(double fitness){
        this.fitness=fitness;
    }
    public double getFitness(){
        return this.fitness;
    }
    public String toString(){
        String output="";
        for(int i=0;i<this.chromosome.length;i++){
            output+=this.chromosome[i];
        }
        return output;
    }
    public int getI(){
        int output=0;
        for(int i=0;i<this.chromosome.length;i++){
            if(this.chromosome[i]==1){
                output+=1;
            }
        }
        return output;
    }












    public void setLength(){

    }
    
    public void setGene(){

    }
    public void setFitness(){

    }
    /*public int getLength(){

    }
    public int getChromosome(){

    }

    public int getFitness(){

    }
*/
}