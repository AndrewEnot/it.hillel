package ua.hillel.school.hw15MVC.model;

public enum POSITIONS {
    CHIEF_EXECUTIVE_OFFICER("Global management"),
    CHIEF_FINANCIAL_OFFICER("Financial operations"),
    CHIEF_ACCOUNTANT("Audit and accounting"),
    BRANCH_MANAGER("Branch management"),
    REGIONAL_MANAGER("Regional management"),
    DEPARTMENT_MANAGER("Store management"),
    SUPPLY("Logistic and supply management"),
    CALL_MANAGER("Works with customers"),
    TRAINEE("Beginner"),
    ANONYMUS("Usual customer");

    private String duties;

    POSITIONS(String duties) {
        this.duties = duties;
    }

    public String getDuties() {
        return duties;
    }
}
