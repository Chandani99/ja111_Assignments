package Q3;

import org.springframework.stereotype.Component;

@Component
public class PresentationBean {

	private ServiceBean service;


	public void setService(ServiceBean service) {
		this.service = service;
	}
	public void result()
	{
		service.circle();
		service.rectangle();
		service.triangle();
		service.sqaure();
	}
}
