package spittr;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spittle {
	private final Long id;
	private final String message;
	private final Date time;
	private final Double latitude;
	private final Double longtitude;
	public Spittle(String message, Date time){
		this(message,time,null,null);
	}
	public Spittle(String message,Date time,Double longtitude,Double latitude){
		this.id = null;
		this.message = message;
		this.time = time;
		this.longtitude = longtitude;
		this.latitude = latitude;
	}
	public Long getId() {
		return id;
	}
	public String getMessage() {
		return message;
	}
	public Date getTime() {
		return time;
	}
	public Double getLatitude() {
		return latitude;
	}
	public Double getLongtitude() {
		return longtitude;
	}
	@Override
	public boolean equals(Object that) {
		// TODO Auto-generated method stub
		return EqualsBuilder.reflectionEquals(this,that,"id","time");
	}
	@Override
	public int hashCode(){
		return HashCodeBuilder.reflectionHashCode(this,"id","time");
	}

}
