package day10;

public enum ServicePlan {
	
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);

	private int additionalcost;

	private ServicePlan(int additionalcost) {
		 this.additionalcost=additionalcost;
	}

	public int getAdditionalcost() {
		return additionalcost;
	}

	public void setAdditionalcost(int additionalcost) {
		this.additionalcost = additionalcost;
	}
	
	@Override
	public String toString()
	{
		return name()+"Additional cost is "+additionalcost;
	}
	
}
