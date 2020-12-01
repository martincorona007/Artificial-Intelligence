public class main{
    public static void main(String[]args){
        int dt0=0;
        int dt1=0;
        SLR obj1=new SLR();
        //obj1.SLR();
        dt0=(int)obj1.wrtBZero();
        dt1=(int)obj1.wrtBOne();
        System.out.println("B0 "+dt0+" B1 "+dt1);
    }
}