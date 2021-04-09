package com.wanderBe.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurants {
@Id
private int rId;
private String rName;
private String rNotes;
private String rUrl;

public Restaurants() {
	super();
	// TODO Auto-generated constructor stub
}

public Restaurants(int rId, String rName, String rNotes, String rUrl) {
	super();
	this.rId = rId;
	this.rName = rName;
	this.rNotes = rNotes;
	this.rUrl = rUrl;
}

public int getrId() {
	return rId;
}

public void setrId(int rId) {
	this.rId = rId;
}

public String getrName() {
	return rName;
}

public void setrName(String rName) {
	this.rName = rName;
}

public String getrNotes() {
	return rNotes;
}

public void setrNotes(String rNotes) {
	this.rNotes = rNotes;
}

public String getrUrl() {
	return rUrl;
}

public void setrUrl(String rUrl) {
	this.rUrl = rUrl;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + rId;
	result = prime * result + ((rName == null) ? 0 : rName.hashCode());
	result = prime * result + ((rNotes == null) ? 0 : rNotes.hashCode());
	result = prime * result + ((rUrl == null) ? 0 : rUrl.hashCode());
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
	Restaurants other = (Restaurants) obj;
	if (rId != other.rId)
		return false;
	if (rName == null) {
		if (other.rName != null)
			return false;
	} else if (!rName.equals(other.rName))
		return false;
	if (rNotes == null) {
		if (other.rNotes != null)
			return false;
	} else if (!rNotes.equals(other.rNotes))
		return false;
	if (rUrl == null) {
		if (other.rUrl != null)
			return false;
	} else if (!rUrl.equals(other.rUrl))
		return false;
	return true;
}

@Override
public String toString() {
	return "Restaurants [rId=" + rId + ", rName=" + rName + ", rNotes=" + rNotes + ", rUrl=" + rUrl + "]";
}



}
