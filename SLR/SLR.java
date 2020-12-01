import java.util.ArrayList;
public class SLR{
    ArrayList<float> data_set_x=new ArrayList<float>();
    ArrayList<float> data_set_y=new ArrayList<float>();
    public SLR(){

    }
    public float wrtBZero(){
            float result=0;
            for(int i=0;i<data_set_x.size();i++){
                for(int j=0;j<data_set_y.size();j++){
                    result=(1*(data_set_x.get(i)*data_set_y.get(j)))-(data_set_x.get(i)*data_set_y.get(j))/(data_set_x.get(i)*data_set_x.get(i))-(data_set_x.get(i)*data_set_x.get(i));
                }
            }
            return result;
    }
    public float wrtBOne(){
            float result=0;
            for(int i=0;i<data_set_x.size();i++){
                for(int j=0;j<data_set_y.size();j++){
                    result=((data_set_x.get(i)*data_set_x.get(i))*data_set_y.get(j))-(data_set_x.get(i)*(data_set_x.get(i)*data_set_y.get(j)))/(data_set_x.get(i)*data_set_x.get(i))-(data_set_x.get(i)*data_set_x.get(i));
                }
            }
            return result;
    }
    
    public void addData(){
        data_set_x.add(23);
        data_set_x.add(26);
        data_set_x.add(30);
        data_set_x.add(34);
        data_set_x.add(43);
        data_set_x.add(48);
        data_set_x.add(52);
        data_set_x.add(57);
        data_set_x.add(58);

        data_set_y.add(651);
        data_set_y.add(762);
        data_set_y.add(856);
        data_set_y.add(1063);
        data_set_y.add(1190);
        data_set_y.add(1298);
        data_set_y.add(1421);
        data_set_y.add(1440);
        data_set_y.add(1518);
    }



}