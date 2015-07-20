package dependency;

public class App {

	private Service service;
	private Service[] services;
	
	public App(Service _service){
		service = _service;
	}
	
	public App(Service _services[]){
		services =  _services;
	}
	
	public void setService(Service _service){
		service = _service;
	}
	
	public void dependency(){
		System.out.println(service.name());
	}
	
	public void dependencies(){
		for(Service service: services){
			System.out.println(service.name());
		}
	}
}
