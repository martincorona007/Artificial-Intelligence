package examples.mlr;
import jade.core.AID;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MLRGui extends JFrame{
    private MLRAgent myAgent;
    private JTextField xField,x1Field;
    public MLRGui(MLRAgent a){
        super(a.getLocalName());
        myAgent=a;
        JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 2));
		p.add(new JLabel("X1:"));
		xField = new JTextField(15);
		p.add(xField);
        p.setLayout(new GridLayout(2, 2));
		p.add(new JLabel("X2:"));
		x1Field = new JTextField(15);
		p.add(x1Field);
		getContentPane().add(p, BorderLayout.CENTER);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				try {
					String y = xField.getText().trim();
                    String y1 = x1Field.getText().trim();
                    
					myAgent.predition(Double.parseDouble(y),Double.parseDouble(y1));
					xField.setText("");
                    x1Field.setText("");
					
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(MLRGui.this, "Invalid values. "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
				}
			}
		} );
		p = new JPanel();
		p.add(addButton);
		getContentPane().add(p, BorderLayout.SOUTH);
		
		// Make the agent terminate when the user closes 
		// the GUI using the button on the upper right corner	
		addWindowListener(new	WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				myAgent.doDelete();
			}
		} );
		
		setResizable(false);
    }
    public void showGui() {
		pack();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int centerX = (int)screenSize.getWidth() / 2;
		int centerY = (int)screenSize.getHeight() / 2;
		setLocation(centerX - getWidth() / 2, centerY - getHeight() / 2);
		super.setVisible(true);
	}	
}
