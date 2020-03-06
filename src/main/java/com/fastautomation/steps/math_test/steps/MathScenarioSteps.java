package com.fastautomation.steps.math_test.steps;

import com.fastautomation.components.Logger;
import com.fastautomation.components.Step;
import com.fastautomation.components.StepContext;
import com.fastautomation.components.StepParam;
import com.fastautomation.components.WebContext;
import com.fastautomation.steps.math_test.page_objects.AdditionPanel;
import com.fastautomation.steps.math_test.page_objects.MathOperationPage;
import com.fastautomation.steps.math_test.page_objects.MultiplicationPanel;
import com.fastautomation.steps.math_test.page_objects.OperationPanel;
import com.fastautomation.steps.math_test.page_objects.SubstractionPanel;

@StepContext("MathScenario")
public class MathScenarioSteps {
	private Logger logger = new Logger(getClass());
	@Step(desc = "Addiation Operation", name = "Addition")
	public void testAddition(WebContext context,  @StepParam("a") double a,  @StepParam("b") double b) {
		logger.info("a {}, b {}",a,b);
		AdditionPanel additionPanel = context.getComponent(MathOperationPage.class).getAdditionPanel();
		
		double result = additionPanel.calculate(a, b);
		if(result != (a + b )) {
			context.setCurrentStepResult(false);
		}
	}
	
	@Step(desc = "Substraction Operation", name = "Substraction")
	public void testSubstraction(WebContext context, @StepParam("a") int a,  @StepParam("b") float b) {
		logger.info("a {}, b {}",a,b);
		SubstractionPanel substractionPanel = context.getComponent(MathOperationPage.class).getSubstractionPanel();
		
		double result = substractionPanel.calculate(a, b);
		if(result != (a - b)) {
			context.setCurrentStepResult(false);
		}
	}
	
	@Step(desc = "Multiplication Operation", name = "Multiplication")
	public void testMultiplication(WebContext context, @StepParam("a") int a,  @StepParam("b") float b) {
		logger.info("a {}, b {}",a,b);
		MultiplicationPanel multiplicationPanel = context.getComponent(MathOperationPage.class).getMultiplicationPanel();
		
		double result = multiplicationPanel.calculate(a, b);
		if(result != (a*b)) {
			context.setCurrentStepResult(false);
		}
	}
	
	@Step(desc = "Division Operation", name = "Division")
	public void testDivision(WebContext context, @StepParam("a") int a,  @StepParam("b") float b) {
		logger.info("a {}, b {}",a,b);
		OperationPanel divisionPanel = context.getComponent(MathOperationPage.class).getDivisionPanel();
		
		double result = divisionPanel.calculate(a, b);
		if(result != (a / b)) {
			context.setCurrentStepResult(false);
		}
	}
	
	@Step(desc = "Go to Next Page", name = "NextPage")
	public void testNextPageNavigation(WebContext context) {
		context.getComponent(MathOperationPage.class).goToNextPage();
	}
}
