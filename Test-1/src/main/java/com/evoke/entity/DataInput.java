package com.evoke.entity;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor  
@AllArgsConstructor  
@ToString  
public class DataInput {
	@Getter@Setter
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date startDate;
	
	@Getter@Setter
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private Date endDate;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "DataInput [startDate=" + startDate + ", endDate=" + endDate + getStartDate()+"here" +getEndDate()+"]";
	}
}
