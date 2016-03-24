package com.fireflieslive.opwiser.domain;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.Duration;

public class Entry {

	private String id;
	private String category;
	private String name;
	private float amount;
	private double duration;
	private Time timestamp;
	
	public Entry() {
		super();
	}
	
	public Entry( String id, String name, float amount, double duration, Time timestamp ) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.duration = duration;
		this.timestamp = timestamp;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public Time getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Time timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public boolean equals( Object obj ) {
		if ( this == obj )
			return true;

		if ( obj == null )
			return false;

		if ( getClass() != obj.getClass() )
			return false;

		Entry other = ( Entry ) obj;
		if ( id == null ) {
			if ( other.id != null )
				return false;
		} else if ( !id.equals( other.id ))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (( id == null ) ? 0 : id.hashCode() );
		return result;
	}

	@Override
	public String toString() {
		return "Product [entryId=" + id + ", name=" + name + "]";
	}
}
