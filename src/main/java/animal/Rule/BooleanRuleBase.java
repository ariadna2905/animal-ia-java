package animal.rule;

import java.util.*;

public class BooleanRuleBase {
    private String name;
    private List<Rule> rules;
    private Map<String, RuleVariable> variables;

    public BooleanRuleBase(String name) {
        this.name = name;
        this.rules = new ArrayList<>();
        this.variables = new HashMap<>();
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public RuleVariable getVariable(String name) {
        return variables.get(name);
    }

    public void addVariable(RuleVariable variable) {
        variables.put(variable.getName(), variable);
    }

    public void forwardChain() {
        boolean changed;
        do {
            changed = false;
            for (Rule rule : rules) {
                if (rule.isTriggered() && !rule.isFired()) {
                    rule.fire();
                    changed = true;
                }
            }
        } while (changed);
    }

    public List<Rule> getRules() {
        return rules;
    }
}