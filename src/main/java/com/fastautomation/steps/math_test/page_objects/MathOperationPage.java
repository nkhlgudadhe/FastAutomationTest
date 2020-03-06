package com.fastautomation.steps.math_test.page_objects;

import org.openqa.selenium.By;

import com.fastautomation.components.WebComponent;

public class MathOperationPage extends WebComponent{

	@Override
	public void waitUntilLoaded() {
		getBrowser().findElement(By.xpath("//h1[text()='Math Operations']")).waitUntilExists();	
	}
		
	public AdditionPanel getAdditionPanel() {
		return getComponent(AdditionPanel.class);
	}
	
	public MultiplicationPanel getMultiplicationPanel() {
		return getComponent(MultiplicationPanel.class);
	}
	
	public SubstractionPanel getSubstractionPanel() {
		return getComponent(SubstractionPanel.class);
	}
	
	public OperationPanel getDivisionPanel() {
		return getComponent(OperationPanel.class, new Object[] {"Div.Panel.html"}, new Class<?>[] {String.class} );
	}
	
	public void goToNextPage() {
		getBrowser().findElement("a").click();
	}

}
