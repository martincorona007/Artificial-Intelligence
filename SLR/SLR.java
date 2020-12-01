import java.util.ArrayList;
public class SLR{
    ArrayList<Integer> data_set_x=new ArrayList<Integer>();
    ArrayList<Integer> data_set_y=new ArrayList<Integer>();
    public SLR(){
            addData();

    }
    public double wrtBZero(){
            double result=0;
            for(int i=0;i<data_set_x.size();i++){
                for(int j=0;j<data_set_y.size();j++){
                    result=(data_set_x.size()+(data_set_x.get(i)*data_set_y.get(j)))-(data_set_x.get(i)+data_set_y.get(j))/(data_set_x.size()+(data_set_x.get(i)*data_set_x.get(i)))-(data_set_x.get(i)+data_set_x.get(i));
                }
            }
            return result;
    }
    public double wrtBOne(){
            double result=0;
            for(int i=0;i<data_set_x.size();i++){
                for(int j=0;j<data_set_y.size();j++){
                    result=data_set_y.get(j)-(wrtBZero()+data_set_x.get(i))/data_set_x.size();
                }
            }
            return result;
    }
    
    public void addData(){
        /*data_set_x.add(1);
        data_set_x.add(2);
        data_set_x.add(4);
        data_set_x.add(3);
        data_set_x.add(5);

        data_set_y.add(1);
        data_set_y.add(3);
        data_set_y.add(3);
        data_set_y.add(2);
        data_set_y.add(5);*/
      
        /*
        data_set_x.add(651);
        data_set_x.add(762);
        data_set_x.add(856);
        data_set_x.add(1063);
        data_set_x.add(1190);
        data_set_x.add(1298);
        data_set_x.add(1421);
        data_set_x.add(1440);
        data_set_x.add(1518);

        data_set_y.add(23);
        data_set_y.add(26);
        data_set_y.add(30);
        data_set_y.add(34);
        data_set_y.add(43);
        data_set_y.add(48);
        data_set_y.add(52);
        data_set_y.add(57);
        data_set_y.add(58);*/
    }



}