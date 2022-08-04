public class testFile {
    
    public static void main(String[] args) {     
        
        quizAns[] quizOne = new quizAns[5];
        quizOne[0] = new Ans(2);
        quizOne[1] = new Ans(1);
        quizOne[2] = new Ans(1);
        quizOne[3] = new Ans(1);
        quizOne[4] = new Ans(2);

        
        for(quizAns a : quizOne)
            a.output();

        for(quizAns a : quizOne)
        {
            a.convertToPercentages();
        }
        
        Arrays.sort(quizOne);
        for(quizAns a : quizOne)
            p.output();
    }
    
}
