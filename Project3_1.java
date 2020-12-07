import javax.swing.*; //Import for JPane
import java.text.*; //To access DecimalFormat Class
public class Project3_1 { //Initialize class Project 3_1
	public static void main(String [] args) { 
		String lengthStr, widthStr;  //To interact with GUI from user
		double length, width, volume; //Variable declarations for rectangular based prism
		
		DecimalFormat df = new DecimalFormat("0.00"); //Instantiate the DecimalFormat Object
		
		lengthStr = JOptionPane.showInputDialog(null, "Enter in length: "); //Read length input from user
		length = Double.parseDouble(lengthStr); //Convert user input to a double
		
		widthStr = JOptionPane.showInputDialog(null, "Enter in width"); //Read width input from user
		width = Double .parseDouble(widthStr); //Convert user input to a double
		
		volume = length * width * width; //Get the volume
		
		JOptionPane.showMessageDialog(null, "The volume is: \n " + df.format(volume)); //Display volume through JPane
		
	}
	
	
}
