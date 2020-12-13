import java.lang.Math;
import java.util.Random;
public class Individual{
    private int[] chromosome;
    private int fitness;
    
    public Individual(int length){
        chromosome= new int[length];
        setChromosome();
    }
    public void setChromosome(){
        Random rn = new Random();
        for(int i=0;i<chromosome.length;i++){
    	    //System.out.println("length "+i);
            chromosome[i]=Math.abs(rn.nextInt() % 2);
            // System.out.println("\tdata["+data[i]+"]");
        }
    }

    public int getChromosomeFitness(){
        int cont=0;
        for(int i=0;i<chromosome.length;i++){
            if(chromosome[i]==1){
                cont++;
            }
        }
        return cont;
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