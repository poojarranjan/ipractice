

public class ConverterMVC {
    //... Create model, view, and controller.  They are
    //    created once here and passed to the parts that
    //    need them so there is only one copy of each.
    public static void main(String[] args) {
        
    	ConverterView       view       = new ConverterView();
    	ConverterModel      model      = new ConverterModel(view);
        ConverterController controller = new ConverterController(model, view);
                
        view.setVisible(true);
    }
}