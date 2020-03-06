print(getEnv("temp"));

description("Math Test");

setCurrentBrowser("Page1")
execute("MathScenario.Addition", {"a":10, "b":2.5});
execute("MathScenario.Substraction", { "a":10, "b":2.5});
execute("MathScenario.NextPage");
switchToNewBrowser("Page2")
execute("MathScenario.Multiplication", { "a":10, "b":2.5});
execute("MathScenario.Division", { "a":10, "b":2.5});
switchToBrowser("Page1")
execute("MathScenario.Addition", {"a":10, "b":2.5});
execute("MathScenario.Substraction", { "a":10, "b":2.5});
