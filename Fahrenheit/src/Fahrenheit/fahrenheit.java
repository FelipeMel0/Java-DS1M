package Fahrenheit;

public class fahrenheit {
	public static void main(String[] args) {
		
		int celsius;
		int fahrenheit;
		
		celsius = 29;
		fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("A temperatura em Celsius é: " + celsius + "°C" );
		System.out.print("A temperatura em Fahrenheit é: " + fahrenheit + "°F");
	}

}
