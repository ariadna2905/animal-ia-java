package animal.rule;

public class Condition {
    private String operator;

    public Condition(String operator) {
        this.operator = operator;
    }

    public boolean evaluate(String variableValue, String expectedValue) {
        if ("=".equals(operator)) {
            return variableValue.equals(expectedValue);
        }
        // Puedes añadir más operadores aquí si es necesario
        return false;
    }

    public String getOperator() {
        return operator;
    }
}