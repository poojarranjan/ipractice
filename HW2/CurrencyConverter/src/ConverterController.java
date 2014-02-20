
import java.awt.event.*;

//import ConverterController.ClearListener;
//import ConverterController.ComputeListener;

public class ConverterController {
    //... The Controller needs to interact with both the Model and View.
    private ConverterModel m_model;
    private ConverterView  m_view;
   
    ConverterController(ConverterModel model, ConverterView view) {
        m_model = model;
        m_view  = view;
        
        //... Add listeners to the view.
        view.addComputeListener(new ComputeListener());
        view.addClearListener(new ClearListener());
    }
    
    class ComputeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "",country="";
            String total=" ";
            try {
                userInput = m_view.getUserInput();
                country=    m_view.getCountryName();
                total=m_model.convert(userInput,country);
                m_view.setNew(total);
                
                
            } catch (NumberFormatException nfex) {
                
                if(country.isEmpty())m_view.showError("Country not selected");
                //if(userInput.isEmpty())
                if(userInput.isEmpty())m_view.showError("dollar amount not entered");
                else m_view.showError("characters not allowed for dollar amount");
            }
            
            
        }
    }class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m_model.reset();
            m_view.reset();
        }
    }
    class QuitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            m_view.quit();
        }
    }
}