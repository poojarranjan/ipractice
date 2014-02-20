
import java.math.BigDecimal;

public class ConverterModel {
    //... Constants
    private static final String INITIAL_VALUE = "0.0";
    private ConverterView  m_view;
   
    private BigDecimal m_total; 
    private BigDecimal b; 
    private BigDecimal c; 
    private BigDecimal e; 
    private BigDecimal j; 
    //============================================================== constructor
    /** Constructor */
    ConverterModel(ConverterView view) {
    	m_view = view;
        reset();
    }
    
    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        m_total = new BigDecimal(INITIAL_VALUE);
    }
    
    
      public String convert(String dollar,String country) {
    	m_total=new BigDecimal(dollar);
    	b=new BigDecimal("2.0841");
    	c=new BigDecimal("1.0017");
    	e=new BigDecimal("0.7857");
    	j=new BigDecimal("81.22");
    	if(country.equals("Brazil"))
        	m_total=m_total.multiply(b);
    	else if(country.equals("Canada"))
    		m_total=m_total.multiply(c);
    	else if(country.equals("Europe"))
    		m_total=m_total.multiply(e);
    	else if(country.equals("Japan"))
    		m_total=m_total.multiply(j);
    	else setValue(" ");   	
    	return m_total.toString();
    }
    
    //================================================================= setValue

      /** Set the total value. 
    *@param value New value that should be used for the calculator total. 
    */
    public void setValue(String value) {
        m_total = new BigDecimal(value);
    }
    
    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return m_total.toString();
    }
}