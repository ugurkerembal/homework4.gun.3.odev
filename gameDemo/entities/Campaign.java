package gameDemo.entities;

import gameDemo.abstracts.Entity;


public class Campaign implements Entity {
	private int campaignId;
	private String campaignName;
	private float discount;
	
	public Campaign() {}

	public Campaign(int campaignId, String campaignName, float discount) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discount = discount;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

}
