package com.masai;

import org.springframework.stereotype.Component;

@Component
public class ShowResult {

	private Calculate calculate;


	public void setService(Calculate calculate) {
		this.calculate = calculate;
	}
	public void result()
	{
		calculate.circle();
		calculate.rectangle();
		calculate.triangle();
		calculate.sqaure();
	}
}
