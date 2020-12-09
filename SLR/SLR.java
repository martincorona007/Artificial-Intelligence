import java.util.ArrayList;
import java.lang.Math; 
public class SLR{
    //ds_x data set X
    //ds_x data set Y
    ArrayList<Integer> ds_X=new ArrayList<Integer>();
    ArrayList<Integer> ds_Y=new ArrayList<Integer>();
    
    public SLR(){
            addData();
    }
    
    public float wrtBZero(){
            float result=0;
            for(int i=0;i<ds_X.size();i++){
                for(int j=0;j<ds_Y.size();j++){
                    System.out.println("Bzero "+result);
                }
            }
            return result;
    }
    public float wrtBOne(){
            float result=0;
            for(int i=0;i<ds_X.size();i++){
                for(int j=0;j<ds_Y.size();j++){
                    System.out.println("BOne "+result);
                }
            }
            return result;
    }
    public int sumXiYi(){
        int val=0;
        for(int i=0;i<ds_X.size();i++){
            val+=ds_X.get(i)*ds_Y.get(i);
        }
        return val;
        
    }
    public int sumXi(){
        int val=0;
        for(int i=0;i<ds_X.size();i++){
            val+=ds_X.get(i);
        }
        return val;
    }
    public int sumYi(){
        int val=0;
        for(int i=0;i<ds_Y.size();i++){
            val+=ds_Y.get(i);
        }
        return val;
    } 
    public int sumPowerXi(){
        int val=0;
        for(int i=0;i<ds_X.size();i++){
            val+=(int)Math.pow(ds_X.get(i),2);
        }
        return val;
    }
    public void addData(){
        ds_X.add(43);
        ds_X.add(21);
        ds_X.add(25);
        ds_X.add(42);
        ds_X.add(57);
        ds_X.add(59);

        ds_Y.add(99);
        ds_Y.add(65);
        ds_Y.add(79);
        ds_Y.add(75);
        ds_Y.add(87);
        ds_Y.add(81);
        /*ds_X.add(1);
        ds_X.add(2);
        ds_X.add(2);
        ds_X.add(3);
        
        ds_Y.add(1);
        ds_Y.add(2);
        ds_Y.add(3);
        ds_Y.add(6);*/
        /*
        ds_X.add(651);
        ds_X.add(762);
        ds_X.add(856);
        ds_X.add(1063);
        ds_X.add(1190);
        ds_X.add(1298);
        ds_X.add(1421);
        ds_X.add(1440);
        ds_X.add(1518);

        ds_Y.add(23);
        ds_Y.add(26);
        ds_Y.add(30);
        ds_Y.add(34);
        ds_Y.add(43);
        ds_Y.add(48);
        ds_Y.add(52);
        ds_Y.add(57);
        ds_Y.add(58);
        */
    }

public static void main(String[]args){
        float dt0=0;
        float dt1=0;
        SLR obj1=new SLR();
        System.out.println("y "+obj1.sumYi());
        System.out.println("x "+obj1.sumXi());
        System.out.println("xy "+obj1.sumXiYi());
        System.out.println("x2 "+obj1.sumPowerXi());
        //obj1.SLR();
        //dt0=obj1.wrtBZero();
        //dt1=obj1.wrtBOne();
        //System.out.println("B0 "+dt0+" B1 "+dt1);
}

}


