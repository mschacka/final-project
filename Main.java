//Brett Gregory
//Madelyn Schackart
public class Main {
    public static void main(String[] args) {

        //grab input
        Input.askQuestions();

        //initialize array
        int[] quizAns = new int[5];

        // grabbing input data
        Array.getInputs(quizAns);
        Array.convertToPercentages(quizAns);

        //print output
        Output.printResults(quizAns);
    }
    }
