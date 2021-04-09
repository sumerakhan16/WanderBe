package com.wanderBe.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity 
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer uId;
	
	@Column(unique=true, nullable=false, length=20)
	private String uName;
	
	@Column(nullable=false, length=20)
	private String uPass;
	
	@Transient //doesn't persist to the database;
	private String verifyPass;
	
	@JoinTable(name="user_destinations")
	@OneToMany(targetEntity = Destinations.class, fetch= FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Destinations> destinations;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer uId, String uName, String uPass, String verifyPass, List<Destinations> destinations) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uPass = uPass;
		this.verifyPass = verifyPass;
		this.destinations = destinations;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPass() {
		return uPass;
	}

	public void setuPass(String uPass) {
		this.uPass = uPass;
	}

	public String getVerifyPass() {
		return verifyPass;
	}

	public void setVerifyPass(String verifyPass) {
		this.verifyPass = verifyPass;
	}

	public List<Destinations> getDestinations() {
		return destinations;
	}

	public void setDestinations(List<Destinations> destinations) {
		this.destinations = destinations;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destinations == null) ? 0 : destinations.hashCode());
		result = prime * result + ((uId == null) ? 0 : uId.hashCode());
		result = prime * result + ((uName == null) ? 0 : uName.hashCode());
		result = prime * result + ((uPass == null) ? 0 : uPass.hashCode());
		result = prime * result + ((verifyPass == null) ? 0 : verifyPass.hashCode());
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
		User other = (User) obj;
		if (destinations == null) {
			if (other.destinations != null)
				return false;
		} else if (!destinations.equals(other.destinations))
			return false;
		if (uId == null) {
			if (other.uId != null)
				return false;
		} else if (!uId.equals(other.uId))
			return false;
		if (uName == null) {
			if (other.uName != null)
				return false;
		} else if (!uName.equals(other.uName))
			return false;
		if (uPass == null) {
			if (other.uPass != null)
				return false;
		} else if (!uPass.equals(other.uPass))
			return false;
		if (verifyPass == null) {
			if (other.verifyPass != null)
				return false;
		} else if (!verifyPass.equals(other.verifyPass))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPass=" + uPass + ", verifyPass=" + verifyPass
				+ ", destinations=" + destinations + "]";
	}


	
	
}
