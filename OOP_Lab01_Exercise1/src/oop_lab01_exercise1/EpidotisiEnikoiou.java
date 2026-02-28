package oop_lab01_exercise1;

public class EpidotisiEnikoiou {

    private String fullΝame;
    private int statusCode;
    private double annualIncome;
    private int numberOfChildren;

    public EpidotisiEnikoiou() {
    }

    public EpidotisiEnikoiou(String name, int statusCode, double annualIncome, int number) {
        this.fullΝame = name;
        this.statusCode = statusCode;
        this.annualIncome = annualIncome;
        this.numberOfChildren = number;
    }

    public String getFullΝame() {
        return fullΝame;
    }

    public void setFullΝame(String fullΝame) {
        this.fullΝame = fullΝame;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public boolean Check() {
        if (numberOfChildren >= 3) {
            return annualIncome <= 6000;
        } else if (numberOfChildren == 2) {
            return annualIncome <= 4800;
        } else if (numberOfChildren == 1) {
            return annualIncome <= 4200;
        } else {
            return annualIncome <= 3600;
        }
    }
}
