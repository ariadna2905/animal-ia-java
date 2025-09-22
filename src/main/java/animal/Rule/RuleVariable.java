package animal.rule;

public class RuleVariable {
    private String name;
    private String value;
    private BooleanRuleBase ruleBase;

    public RuleVariable(BooleanRuleBase ruleBase, String name) {
        this.ruleBase = ruleBase;
        this.name = name;
        this.value = "unknown";
        ruleBase.addVariable(this);
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}