import java.awt.*;
import javax.swing.*;
import javax.swing.text.AbstractDocument.Content;

import java.awt.event.*;

class ConverterView extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//... Constants
    private static final String INITIAL_VALUE = "";
    
    //... Components
    private JTextField m_userInputTf = new JTextField(30);
    private JTextField m_to    = new JTextField(33);
    private JButton    m_compute = new JButton("Compute");
    private JButton    m_clear    = new JButton("Clear");
   // private JButton    m_quit  = new JButton("Quit");
    private JRadioButton r1=new JRadioButton("Brazil");
    private JRadioButton r2=new JRadioButton("Canada");
    private JRadioButton r3=new JRadioButton("Europe");
    private JRadioButton r4=new JRadioButton("Japan");
   private JLabel l=new JLabel("Equivalent to..");
   private ButtonGroup grp=new ButtonGroup();
       /** Constructor */
    //CalcView(CalcModel model) {
    ConverterView() {
        
               
        m_to.setEditable(false);
        
        //... Layout the components.
    
     
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("U.S Dollar Amount"));
        content.add(m_userInputTf);
      
        content.add(l);
        
        content.add(m_to); 
      
        grp.add(r1);
        grp.add(r2);
        grp.add(r3);
        grp.add(r4);
        content.add(r1);
        content.add(r2);
        content.add(r3);
        content.add(r4);
        content.add(m_compute);
        content.add(m_clear);
       // content.add(m_quit);
        //... finalize layout
        this.setContentPane(content);
        this.pack();
        
        this.setTitle("Currency Converter");
        this.setSize(500,300);
        // The window closing event should probably be passed to the 
        // Controller in a real program, but this is a short example.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void reset() {
    	m_userInputTf.setText(INITIAL_VALUE);
        m_to.setText(INITIAL_VALUE);
        l.setText("Equivalent to..");
       grp.clearSelection(); }
    
    String getUserInput() {
        return m_userInputTf.getText();
    }
    String getCountryName(){
    	
    		String s="";
    	
    	if(r1.isSelected()) {
    	l.setText("Equivalent in Brazilian reals" )	;
    	s=r1.getText();}
    	if(r2.isSelected()) {
    		l.setText("Equivalent in Canadian dollars");
    	    		s=r2.getText();
    	}
    	if(r3.isSelected()) {
    		l.setText("Equivalent in European euros");
    		s=r3.getText();}
    	if(r4.isSelected()){ 
    		l.setText("Equivalent in Japanese yens");
    		s=r4.getText();}
    return s;
       	
    }
    
    void setCurrency(String currency) {
        m_to.setText(currency);
    }
    
    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
              
    }
    
    void addComputeListener(ActionListener mal) {
        m_compute.addActionListener(mal);
    }
    
    void addClearListener(ActionListener cal) {
    	        m_clear.addActionListener(cal);
    	        
    }
    void addQuitListener(ActionListener cal) {
     //   m_quit.addActionListener(cal);
        
}

    void setNew(String s)
    {
    			
    	m_to.setText(s);
    }
    void clkcompute(){
    	m_compute.doClick();
    }
    void clkclear(){
    	m_clear.doClick();
    }
    
    void selectBrazil()
    {
    	r1.doClick();
    }
    void selectCanada()
    {
    	r2.doClick();
    }
    void selectEurope()
    {
    	r3.doClick();
    }
    void selectJapan()
    {
    	r4.doClick();
    }
    void setDollar(String s)
    {
    	m_userInputTf.setText(s);
    }
    String getTo()
    {
    	return m_to.getText();
    }
    String getFrom()
    {
    	return m_userInputTf.getText();
    }
    String getLabel()
    {
    	return l.getText();
    }
    void quit()
    {
    	//this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    
    }
}
