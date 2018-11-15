import javax.swing.JOptionPane;

public class zoo {
	//attributes
	private String name; 
	private String color; 
	private int age; 
	private int numSpots;  

	public zoo(String n, String c, int a, int s) {
		//Constructor 
		name = n; 
		setage(a);  
		color = c;
		setnumSpots(s); 
		
	}
	public String name(String n) {
		return name; 
	}
	public void setage(int a) { 
		if (a >= 0) { 
			age = a; 
		} else {
			age = 4; 
			System.out.println(" Giraffe is born, defaulting to 4 ");
		}
	}
	public String color(String c) {
		return color; 
	}
	public void setnumSpots(int s) { 
		if (s > 0) { 
			numSpots = s; 
		} else {
			numSpots = 32; 
			System.out.println(" Come on a giraffe needs spots, defaulting to 32 ");
		}
	}
	public String toString() {
		return " Yay this zoo has a giraffe named " + name + " it's " + age + " years old, has "
				+ numSpots + " and is the color " + color; 
	}

}
