package examples.mlr;
import examples.mlr.*;
import jade.core.Agent;
import jade.core.behaviours.*;
import java.util.*;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;

public class MLRAgent extends Agent{
    private MLRGui myGui;
    public MLR obj1;
    double dt0=0;
    double dt1=0;
    double dt2=0;
    double res=0;
    
    protected void setup(){
        myGui = new MLRGui(this);
        obj1=new MLR();
        myGui.showGui();
        dt0=obj1.wrtBzero();
        dt1=obj1.wrtBone();
        dt2=obj1.wrtBtwo();
        System.out.println("y = B0 "+dt0+"+ B1 "+dt1+" x1 B2 "+dt2+" x2 ");
    }
    public void predition(final double v1,final double v2){
        addBehaviour(new OneShotBehaviour(){
            public void action(){
                res=dt0+(dt1*v1)+(dt2*v2);
                System.out.println("Y= "+res);
            }
        });
    }
}