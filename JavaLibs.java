import javax.swing.*;

public class JavaLibs {

	public static void main (String[] args)
	{

		String patientName, patientCons, patientSymptons, patientMed;
	
		int patientEndure, patientExercise;

		double patientAge, patientWeight, sleepTime;

		patientName = (JOptionPane.showInputDialog(null, "What is your name ?"));

		patientCons = (JOptionPane.showInputDialog(null, "What is the disease or condition: "));

		patientSymptons = (JOptionPane.showInputDialog(null, "What are your symptoms ?"));

		patientEndure = Integer.parseInt(JOptionPane.showInputDialog(null, "How long has this been going on ? (in days)"));

		patientExercise = Integer.parseInt(JOptionPane.showInputDialog(null, "How many do you exercise in a week ?"));

		patientAge = Double.parseDouble(JOptionPane.showInputDialog(null, "How old are you ?"));

		patientWeight = Double.parseDouble(JOptionPane.showInputDialog(null, "How much your weight ?(in kg)"));

		sleepTime = Double.parseDouble(JOptionPane.showInputDialog(null, "How long do you sleep in a day ?"));

	patientMed = (JOptionPane.showInputDialog(null, "What medicine/supplement do you usually take ?"));

	JOptionPane.showMessageDialog(null, "The patient name is " + patientName 
		+ ", and the age is " + patientAge + " years old, with the weight is " + patientWeight + " kg" 
		+ ".\n The condition that patient have is " + patientCons 
		+ " and also the symptons are " + patientSymptons 
		+ " . The patient is having this symptons for " + patientEndure
		+ " days, and the timesleep of the patient is " + sleepTime
		+ " hours" + " \n The patient have exercise about " + patientExercise
		+ " times in a week " + ", and consume this kind of " + patientMed
		+ " medicine " + ".");
 	}
}

