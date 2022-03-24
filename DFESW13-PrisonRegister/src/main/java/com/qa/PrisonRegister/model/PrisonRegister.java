package com.qa.PrisonRegister.model;

import java.util.Objects;




public class PrisonRegister {
	

	private long id;
	private String name; 
	private String crime; 
	private String reasonInSolitaryConfinement; 
	private float totalPrisonSentenceInMonths;
	private float daysinSolitaryConfinement;
	private String wardRelocationOnceReleased; 
	private boolean gangMember; 
	private boolean suicideWatch; 
	private boolean repeatVisitor;
	
	
	
	
	public PrisonRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	//One constructor with ID 
	public PrisonRegister(long id, String name, String crime, String reasonInSolitaryConfinement,
			float totalPrisonSentenceInMonths, float daysinSolitaryConfinement, String wardRelocationOnceReleased,
			boolean gangMember, boolean suicideWatch, boolean repeatVisitor) {
		super();
		this.id = id;
		this.name = name;
		this.crime = crime;
		this.reasonInSolitaryConfinement = reasonInSolitaryConfinement;
		this.totalPrisonSentenceInMonths = totalPrisonSentenceInMonths;
		this.daysinSolitaryConfinement = daysinSolitaryConfinement;
		this.wardRelocationOnceReleased = wardRelocationOnceReleased;
		this.gangMember = gangMember;
		this.suicideWatch = suicideWatch;
		this.repeatVisitor = repeatVisitor;
	}
	
	// One constructor without ID
	public PrisonRegister(String name, String crime, String reasonInSolitaryConfinement,
			float totalPrisonSentenceInMonths, float daysinSolitaryConfinement, String wardRelocationOnceReleased,
			boolean gangMember, boolean suicideWatch, boolean repeatVisitor) {
		super();
		this.name = name;
		this.crime = crime;
		this.reasonInSolitaryConfinement = reasonInSolitaryConfinement;
		this.totalPrisonSentenceInMonths = totalPrisonSentenceInMonths;
		this.daysinSolitaryConfinement = daysinSolitaryConfinement;
		this.wardRelocationOnceReleased = wardRelocationOnceReleased;
		this.gangMember = gangMember;
		this.suicideWatch = suicideWatch;
		this.repeatVisitor = repeatVisitor;
	}


	public void setId(long id) {
		this.id = id;
		
	}

	public long getId() {
		return id ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	public String getReasonInSolitaryConfinement() {
		return reasonInSolitaryConfinement;
	}

	public void setReasonInSolitaryConfinement(String reasonInSolitaryConfinement) {
		this.reasonInSolitaryConfinement = reasonInSolitaryConfinement;
	}

	public float getTotalPrisonSentenceInMonths() {
		return totalPrisonSentenceInMonths;
	}

	public void setTotalPrisonSentenceInMonths(float totalPrisonSentenceInMonths) {
		this.totalPrisonSentenceInMonths = totalPrisonSentenceInMonths;
	}

	public float getDaysinSolitaryConfinement() {
		return daysinSolitaryConfinement;
	}

	public void setDaysinSolitaryConfinement(float daysinSolitaryConfinement) {
		this.daysinSolitaryConfinement = daysinSolitaryConfinement;
	}

	public String getWardRelocationOnceReleased() {
		return wardRelocationOnceReleased;
	}

	public void setWardRelocationOnceReleased(String wardRelocationOnceReleased) {
		this.wardRelocationOnceReleased = wardRelocationOnceReleased;
	}

	public boolean isGangMember() {
		return gangMember;
	}

	public void setGangMember(boolean gangMember) {
		this.gangMember = gangMember;
	}

	public boolean isSuicideWatch() {
		return suicideWatch;
	}

	public void setSuicideWatch(boolean suicideWatch) {
		this.suicideWatch = suicideWatch;
	}

	public boolean isRepeatVisitor() {
		return repeatVisitor;
	}

	public void setRepeatVisitor(boolean repeatVisitor) {
		this.repeatVisitor = repeatVisitor;
	}

	@Override
	public String toString() {
		return "PrisonRegister [id=" + id + ", name=" + name + ", crime=" + crime + ", reasonInSolitaryConfinement="
				+ reasonInSolitaryConfinement + ", totalPrisonSentenceInMonths=" + totalPrisonSentenceInMonths
				+ ", daysinSolitaryConfinement=" + daysinSolitaryConfinement + ", wardRelocationOnceReleased="
				+ wardRelocationOnceReleased + ", gangMember=" + gangMember + ", suicideWatch=" + suicideWatch
				+ ", repeatVisitor=" + repeatVisitor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(crime, daysinSolitaryConfinement, gangMember, id, name, reasonInSolitaryConfinement,
				repeatVisitor, suicideWatch, totalPrisonSentenceInMonths, wardRelocationOnceReleased);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrisonRegister other = (PrisonRegister) obj;
		return Objects.equals(crime, other.crime)
				&& Float.floatToIntBits(daysinSolitaryConfinement) == Float
						.floatToIntBits(other.daysinSolitaryConfinement)
				&& gangMember == other.gangMember && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(reasonInSolitaryConfinement, other.reasonInSolitaryConfinement)
				&& repeatVisitor == other.repeatVisitor && suicideWatch == other.suicideWatch
				&& Float.floatToIntBits(totalPrisonSentenceInMonths) == Float
						.floatToIntBits(other.totalPrisonSentenceInMonths)
				&& Objects.equals(wardRelocationOnceReleased, other.wardRelocationOnceReleased);
	} 
	
	
	
	

	
	

}
