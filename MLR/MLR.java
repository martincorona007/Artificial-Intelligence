import java.util.ArrayList;
import java.lang.Math; 
public class MLR{
    ArrayList<Double> ds_Xi1=new ArrayList<Double>();
    ArrayList<Double> ds_Xi2=new ArrayList<Double>();
    ArrayList<Double> ds_Yi=new ArrayList<Double>();
    

    public MLR(){
        addData();
    }
    public double wrtBzero(){
        double result=0;
        double numerator=0;
        double denominator=0;
        /*double p3=(sumYi()*sumX2i1()*sumX2i2());
        double p1=(sumYi()*sumX2i1()*sumX2i2())+(sumXi1()*sumXi1Xi2()*sumXi2Yi())+(sumXi2()*sumXi1Yi()*sumXi1Xi2());
        double p2=(sumXi2Yi()*sumX2i1()*sumXi2())-(sumXi1Xi2()*sumXi1Xi2()*sumYi())-(sumX2i2()*sumXi1Yi()*sumXi1());
        System.out.println("\t p1 "+p1+" p2 "+p2+" p3 "+p3);*/
        numerator=((sumYi()*sumX2i1()*sumX2i2())+(sumXi1()*sumXi1Xi2()*sumXi2Yi())+(sumXi2()*sumXi1Yi()*sumXi1Xi2()))-((sumXi2Yi()*sumX2i1()*sumXi2())-(sumXi1Xi2()*sumXi1Xi2()*sumYi())-(sumX2i2()*sumXi1Yi()*sumXi1()));
        denominator=DS();
        //System.out.println("\n B0 N "+numerator+" D"+denominator);
        result=numerator/denominator;
        return result;
    }

    public double wrtBone(){
        double result=0;
        double numerator=0;
        double denominator=0;
        double p1=ds_Xi1.size()*sumXi1Yi()*sumX2i2();
        double p2=sumYi()*sumXi1Xi2()*sumXi2();
        double p3=sumXi2()*sumXi1()*sumXi2Yi();
        System.out.println("\t p1 "+p1+" p2 "+p2+" p3 "+p3);
        //double p1=(ds_Xi1.size()*sumXi1Yi()*sumX2i2())+(sumYi()*sumXi1Xi2()*sumXi2())+(sumXi2()*sumXi1()*sumXi2Yi());
        //double p2=(sumXi2()*sumXi1Yi()*sumXi2())-(sumXi2Yi()*sumXi1Xi2()*ds_Xi1.size())-(sumX2i2()*sumXi1()*sumYi());
        //System.out.println("\t p1 "+p1+" p2 "+p2);
        numerator=((ds_Xi1.size()*sumXi1Yi()*sumX2i2())+(sumYi()*sumXi1Xi2()*sumXi2())+(sumXi2()*sumXi1()*sumXi2Yi()))-((sumXi2()*sumXi1Yi()*sumXi2())-(sumXi2Yi()*sumXi1Xi2()*ds_Xi1.size())-(sumX2i2()*sumXi1()*sumYi()));
        denominator=DS();
        System.out.println("\n B1 N "+numerator+" D "+denominator);
        result=numerator/denominator;
        return result;
    }
    public double wrtBtwo(){
        double result=0;
        double numerator=0;
        double denominator=0;
        numerator=((ds_Xi1.size()*sumX2i1()*sumX2i2())+(sumXi1()*sumXi1Xi2()*sumXi2())+(sumXi2()*sumXi1()*sumXi1Xi2()))-((sumXi2()*sumX2i1()*sumYi())-(sumXi1Xi2()*sumXi1Yi()*ds_Xi1.size())-(sumXi2Yi()*sumXi1()*sumXi1()));
        denominator=DS();
       // System.out.println("\n B2 N "+numerator+" D"+denominator);
        result=numerator/denominator;
        return result;
    }
    //determinat of the system
    public double DS(){
        //double p1=(ds_Xi1.size()*sumX2i1()*sumX2i2())+(sumXi1()*sumXi1Xi2()*sumXi2())+(sumXi2()*sumXi1()*sumXi1Xi2());
        //double p2=(sumXi2()*sumX2i1()*sumXi2())-(sumXi1Xi2()*sumXi1Xi2()*ds_Xi1.size())-(sumX2i2()*sumXi1()*sumXi1());
        //double p3=p1-p2;
        //System.out.println("Determinat p1 "+p1+" p2 "+p2+" p3 "+p3);
        return ((ds_Xi1.size()*sumX2i1()*sumX2i2())+(sumXi1()*sumXi1Xi2()*sumXi2())+(sumXi2()*sumXi1()*sumXi1Xi2()))-((sumXi2()*sumX2i1()*sumXi2())-(sumXi1Xi2()*sumXi1Xi2()*ds_Xi1.size())-(sumX2i2()*sumXi1()*sumXi1()));
    }
    public double sumX2i1(){
        double val=0;
        for(int it=0;it<ds_Xi1.size();it++){
            val +=Math.pow(ds_Xi1.get(it),2);
            //System.out.println("it "+it+" get "+ds_Xi1.get(it)+" pow "+Math.pow(ds_Xi1.get(it),2) +" inside "+val);
        } 
        return val;
    }
    public double sumX2i2(){
        double val=0;
        for(int it=0;it<ds_Xi2.size();it++){
            val +=Math.pow(ds_Xi2.get(it),2);
           // System.out.println("it "+it+" get "+ds_Xi2.get(it)+" pow "+Math.pow(ds_Xi2.get(it),2) +" inside "+val);
        } 
        return val;
    }
    public double sumXi1Xi2(){
       double val=0;
        for(int it=0;it<ds_Xi1.size();it++){
            val+=ds_Xi1.get(it)*ds_Xi2.get(it);
        }
        return val; 
    }
    
    public double sumXi2Yi(){
        double val=0;
        for(int it=0;it<ds_Xi2.size();it++){
            val+=ds_Xi2.get(it)*ds_Yi.get(it);
        }
        return val;
    }
    
    public double sumXi1Yi(){
        double val=0;
        for(int it=0;it<ds_Xi1.size();it++){
            val+=ds_Xi1.get(it)*ds_Yi.get(it);
        }
        return val;
    }
    
    public double sumXi1(){
        double val=0;
        for(int it=0;it<ds_Xi1.size();it++){
            val+=ds_Xi1.get(it);
        }
        return val;
    }
    
    public double sumXi2(){
        double val=0;
        for(int it=0;it<ds_Xi2.size();it++){
            val+=ds_Xi2.get(it);
        }
        return val;
    }
    public double sumYi(){
        double val=0;
        for(int it=0;it<ds_Yi.size();it++){
            val+=ds_Yi.get(it);
        }
        return val;
    }
    public void addData(){
        ds_Xi1.add(41.9);
        ds_Xi1.add(43.4);
        ds_Xi1.add(43.9);
        ds_Xi1.add(44.5);
        ds_Xi1.add(47.3);
        ds_Xi1.add(47.5);
        ds_Xi1.add(47.9);
        ds_Xi1.add(50.2);
        ds_Xi1.add(52.8);
        ds_Xi1.add(53.2);
        ds_Xi1.add(56.7);
        ds_Xi1.add(57.0);
        ds_Xi1.add(63.5);
        ds_Xi1.add(65.3);
        ds_Xi1.add(71.1);
        ds_Xi1.add(77.0);
        ds_Xi1.add(77.8);

        ds_Xi2.add(29.1);
        ds_Xi2.add(29.3);
        ds_Xi2.add(29.5);
        ds_Xi2.add(29.7);
        ds_Xi2.add(29.9);
        ds_Xi2.add(30.3);
        ds_Xi2.add(30.5);
        ds_Xi2.add(30.7);
        ds_Xi2.add(30.8);
        ds_Xi2.add(30.9);
        ds_Xi2.add(31.5);
        ds_Xi2.add(31.7);
        ds_Xi2.add(31.9);
        ds_Xi2.add(32.0);
        ds_Xi2.add(32.1);
        ds_Xi2.add(32.5);
        ds_Xi2.add(32.9);
        
        ds_Yi.add(251.3);
        ds_Yi.add(251.3);
        ds_Yi.add(248.3);
        ds_Yi.add(267.5);
        ds_Yi.add(273.0);
        ds_Yi.add(276.5);
        ds_Yi.add(270.3);
        ds_Yi.add(274.9);
        ds_Yi.add(285.0);
        ds_Yi.add(290.0);
        ds_Yi.add(297.0);
        ds_Yi.add(302.5);
        ds_Yi.add(304.5);
        ds_Yi.add(309.3);
        ds_Yi.add(321.7);
        ds_Yi.add(330.7);
        ds_Yi.add(349.0);
    }
    public static void main(String[]args){
        MLR obj1=new MLR();
        double x1=71.1;
        double x2=32.1;
        double val=0;
        System.out.println("xi1 "+obj1.sumXi1());
        System.out.println("xi2 "+obj1.sumXi2());
        System.out.println("yi "+obj1.sumYi());
        System.out.println("x2i1 "+obj1.sumX2i1());
        System.out.println("x2i2 "+obj1.sumX2i2());
        System.out.println("xi1*xi2 "+obj1.sumXi1Xi2());
        System.out.println("xi2*yi "+obj1.sumXi2Yi());
        System.out.println("xi1*yi "+obj1.sumXi1Yi());
        
        System.out.println("\n");        
        System.out.println("+DS "+obj1.DS());
        
        System.out.println("+B0 "+obj1.wrtBzero());
        System.out.println("+B1 "+obj1.wrtBone());
        System.out.println("+B2 "+obj1.wrtBtwo());
        val=obj1.wrtBzero()+(obj1.wrtBone()*x1)+(obj1.wrtBtwo()*x2);
        System.out.println("y "+val);
    }
}