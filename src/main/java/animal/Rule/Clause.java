package animal.rule;

public class Clause {
    private RuleVariable variable;
    private Condition condition;
    private String value;

    public Clause(RuleVariable variable, Condition condition, String value) {
        this.variable = variable;
        this.condition = condition;
        this.value = value;
    }

    public boolean evaluate(String variableValue) {
        return condition.evaluate(variableValue, value);
    }

    public RuleVariable getVariable() {
        return variable;
    }

    public String getValue() {
        return value;
    }
}