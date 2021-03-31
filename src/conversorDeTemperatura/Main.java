package conversorDeTemperatura;

public class Main {
	
	public static void main(String[] args) {
		
		ConverteTemperatura ct = new ConverteTemperatura();
		
		try {
			System.out.println(ct.toCelsius(-469.67));
		} catch (FahrenheitException e) {
			e.printStackTrace();
		}
	}

}
