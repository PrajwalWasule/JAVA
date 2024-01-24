package core;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),PLATINUM(3000);
    private int additionalcost;

	private ServicePlan(int additionalcost) {
		this.additionalcost = additionalcost;
	}

	public int getAdditionalcost() {
		return additionalcost;
	}

	public void setAdditionalcost(int additionalcost) {
		this.additionalcost = additionalcost;
	}
    public String toString()
    {
    	return name()+""+additionalcost;
    }

}
