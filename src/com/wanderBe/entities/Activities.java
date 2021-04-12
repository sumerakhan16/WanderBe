package com.wanderBe.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Activities {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int aId;
	private String aName;
	private String aNotes;
	private String aUrl;
	
//	 @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL
//			 )
//			     @JoinColumn(name = "dId")
//			     private Destinations destinations;
	 
	public Activities() {
		super();
		// TODO Auto-generated constructor stub
	}

public Activities(int aId, String aName, String aNotes, String aUrl) {
	super();
	this.aId = aId;
	this.aName = aName;
	this.aNotes = aNotes;
	this.aUrl = aUrl;
}

public int getaId() {
	return aId;
}

public void setaId(int aId) {
	this.aId = aId;
}

public String getaName() {
	return aName;
}

public void setaName(String aName) {
	this.aName = aName;
}

public String getaNotes() {
	return aNotes;
}

public void setaNotes(String aNotes) {
	this.aNotes = aNotes;
}

public String getaUrl() {
	return aUrl;
}

public void setaUrl(String aUrl) {
	this.aUrl = aUrl;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + aId;
	result = prime * result + ((aName == null) ? 0 : aName.hashCode());
	result = prime * result + ((aNotes == null) ? 0 : aNotes.hashCode());
	result = prime * result + ((aUrl == null) ? 0 : aUrl.hashCode());
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
	Activities other = (Activities) obj;
	if (aId != other.aId)
		return false;
	if (aName == null) {
		if (other.aName != null)
			return false;
	} else if (!aName.equals(other.aName))
		return false;
	if (aNotes == null) {
		if (other.aNotes != null)
			return false;
	} else if (!aNotes.equals(other.aNotes))
		return false;
	if (aUrl == null) {
		if (other.aUrl != null)
			return false;
	} else if (!aUrl.equals(other.aUrl))
		return false;
	return true;
}

@Override
public String toString() {
	return "Activities [aId=" + aId + ", aName=" + aName + ", aNotes=" + aNotes + ", aUrl=" + aUrl + "]";
}

	
}
