//Armando Bracco

public class Array {
 //Changes array to have values from input function
 public static void getInputs(int[] quizAns) {
	 
	 quizAns[0] = Input.scount;
	 quizAns[1] = Input.pcount;
	 quizAns[2] = Input.sqcount;
	 quizAns[3] = Input.mcount;
	 quizAns[4] = Input.sancount;
 }
 
 //Converts array values to percentages
 public static void convertToPercentages(int[] quizAns) {
	for(int i = 0; i < 5; i++) {
		int num = quizAns[i];
		quizAns[i] = num*100/7;
 }
 
 }	
}
