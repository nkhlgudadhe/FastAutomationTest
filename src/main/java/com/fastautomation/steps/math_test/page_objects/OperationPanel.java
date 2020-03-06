package com.fastautomation.steps.math_test.page_objects;

import com.fastautomation.components.Logger;
import com.fastautomation.components.WebComponent;
import com.fastautomation.core.Frame;

public class OperationPanel extends WebComponent{

	private Logger logger = new Logger(getClass());
	
	private String frameName;
	
	public OperationPanel() {
		// TODO Auto-generated constructor stub
	}
	
	public OperationPanel( String frameName) {
		this.frameName = frameName;
	}
	
	@Override
	public void waitUntilLoaded() {
		
		Frame frame = getBrowser().findFrame("iframe[src='"+getFrameSrc()+"']");
		
		frame.findElement("#input1").waitUntilExists();
		frame.findElement("#input2").waitUntilExists();
		frame.findElement("#result").waitUntilExists();		
	}
	
	public double calculate(double input1, double input2) {
		Frame frame = getBrowser().findFrame("iframe[src='"+getFrameSrc()+"']");
		frame.findElement("#input1").clear();
		frame.findElement("#input2").clear();
		
		frame.findElement("#input1").sendKeys(String.valueOf(input1));
		frame.findElement("#input2").sendKeys(String.valueOf(input2));
		frame.findElement("input[type='button']").click();
		
		String result = frame.findElement("#result").getValue();
		
		logger.info("Result {}", result);
		
		return Double.parseDouble(result);
	}
	
	protected String getFrameSrc() {
		return frameName;
	}
}
