import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class StateChartTest {

	public static ConverterModelClass model;
	public static ConverterView view;
	public static ConverterController controller;
	
	@Rule
    public ExpectedException thrown= ExpectedException.none();
	
	@Test
	public void choice_selected_no_amount()
	{
		view = new ConverterView();
		view.click_clear();
		view.select_brazil();
		view.click_submit();
		assertEquals(0.00, view.get_amount(),2);
	}
	


@Test
public void amount_selected_no_choice()
{
	view = new ConverterView();
	view.click_clear();
	view.setAmount(1000.00);
	
	assertEquals(false, view.checkEmpty());
	assertEquals(1000,view.get_amount(),2);
}

@Test
public void amount_and_choice_selected()
{
	view = new ConverterView();
	model= new ConverterModelClass();
	controller = new ConverterController(view, model);
	view.click_clear();
	view.select_brazil();
	view.setAmount(1000.00);
	view.click_submit();
	
	
	assertEquals(1000, controller.report_amount(),2);
	
}

@Test
public void co_choice_no_amount()
{
	view = new ConverterView();
	controller = new ConverterController(view, model);
	view.click_clear();
	view.click_submit();		
	
thrown.expect(IllegalArgumentException.class);
throw new IllegalArgumentException();
}




}