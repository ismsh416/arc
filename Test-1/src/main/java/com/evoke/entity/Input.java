package com.evoke.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Input {
	@DateTimeFormat(pattern ="yyyy-MM-dd")
private Date Sdate;
	@DateTimeFormat(pattern ="yyyy-MM-dd")
private Date Edate;


public Date getSdate() {
	return Sdate;
}
public void setSdate(Date sdate) {
	Sdate = sdate;
}
public Date getEdate() {
	return Edate;
}
public void setEdate(Date edate) {
	Edate = edate;
}
@Override
public String toString() {
	return "Input [Sdate=" + Sdate + ", Edate=" + Edate + "]";
}

}
