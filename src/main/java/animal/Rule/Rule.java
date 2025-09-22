package animal.rule;

public class Rule {
    private String name;
    private Clause[] conditions;
    private Clause[] actions;
    private BooleanRuleBase ruleBase;
    private boolean fired;

    public Rule(BooleanRuleBase ruleBase, String name, Clause[] conditions, Clause[] actions) {
        this.ruleBase = ruleBase;
        this.name = name;
        this.conditions = conditions;
        this.actions = actions;
        this.fired = false;
        ruleBase.addRule(this);
    }

    public Rule(BooleanRuleBase ruleBase, String name, Clause[] conditions, Clause action) {
        this(ruleBase, name, conditions, new Clause[]{action});
    }

    public boolean isTriggered() {
        for (Clause condition : conditions) {
            RuleVariable variable = condition.getVariable();
            if (!condition.evaluate(variable.getValue())) {
                return false;
            }
        }
        return true;
    }

    public void fire() {
        for (Clause action : actions) {
            RuleVariable variable = action.getVariable();
            variable.setValue(action.getValue());
        }
        fired = true;
    }

    public boolean isFired() {
        return fired;
    }

    public String getName() {
        return name;
    }
}