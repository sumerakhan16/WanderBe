package com.wanderBe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Destinations {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int dId;
	private String dName;
	private String dImageUrl;
	
	public Destinations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Destinations(int dId, String dName, String dImageUrl) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dImageUrl = dImageUrl;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		return "Destinaitons [dId=" + dId + ", dName=" + dName + ", dImageUrl=" + dImageUrl + "]";
	}
	
	
}
