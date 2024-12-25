public class Insurance {
    private String ssn;
    private boolean isActivated;
    private float reductionRate;

    public Insurance(String ssn, boolean isActivated, float reductionRate) {
        this.ssn = ssn;
        this.isActivated = isActivated;
        this.reductionRate = reductionRate;
    }

    // Getters and Setters

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public float getReductionRate() {
        return reductionRate;
    }

    public void setReductionRate(float reductionRate) {
        this.reductionRate = reductionRate;
    }

}
