package com.wanderBe.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Destinations {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int dId;
	private String dName;
	private String dImageUrl;
	
	 @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL
	 )
	     @JoinTable(name = "destinations_activities")
	     private List<Activities> activities;
	 
	public Destinations() {
		super();
		this.dId= 0;
	}

	public Destinations(int dId, String dName, String dImageUrl, List<Activities> activities) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dImageUrl = dImageUrl;
		this.activities = activities;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdImageUrl() {
		return dImageUrl;
	}

	public void setdImageUrl(String dImageUrl) {
		this.dImageUrl = dImageUrl;
	}

	public List<Activities> getActivities() {
		return activities;
	}

	public void setActivities(List<Activities> activities) {
		this.activities = activities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activities == null) ? 0 : activities.hashCode());
		result = prime * result + dId;
		result = prime * result + ((dImageUrl == null) ? 0 : dImageUrl.hashCode());
		result = prime * result + ((dName == null) ? 0 : dName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Destinations other = (Destinations) obj;
		if (activities == null) {
			if (other.activities != null)
				return false;
		} else if (!activities.equals(other.activities))
			return false;
		if (dId != other.dId)
			return false;
		if (dImageUrl == null) {
			if (other.dImageUrl != null)
				return false;
		} else if (!dImageUrl.equals(other.dImageUrl))
			return false;
		if (dName == null) {
			if (other.dName != null)
				return false;
		} else if (!dName.equals(other.dName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Destinations [dId=" + dId + ", dName=" + dName + ", dImageUrl=" + dImageUrl + ", activities="
				+ activities + "]";
	}

	
	
	
}
