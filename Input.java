//Callissa McNicholas

import java.util.Scanner; 

public class Input 
{ 
	static int scount, pcount, sqcount, mcount, sancount; 
	static Scanner scan = new Scanner(System.in);
	
	//This explains to the user what is expected while taking the quiz. It asks the user
	//seven questions of which the pick a number for as an answer. The question's answers are tied 
	//to certain characters. 1 - Spongebob, 2 - Patrick, 3 - Squidward, 4 - Mr. Krabs, 5 - Sandy. 
	public static void askQuestions()
		{
		
			System.out.println("Hello! Ready to find out what Sponge Bob character you are more like? \n" 
					+ "Let's start with getting to know you a little bit first. What is your first name?");
			String name = scan.next(); 
	
			System.out.println("Nice to meet you " +name+ ". Before we start the quiz let's go over some things. \n"
					+ "You will be asked seven questions to determine which character you are most like. \n"
					+ "For each question, please enter the number that goes with the answer that "
					+ "you agree most with.\nWith that being said, let's begin the quiz! \n");
			
			System.out.println("Are you ready!? \n 1 I'm ready! I'm ready! I'M READY! \n 2 No."); 
			int readyOrNot = scan.nextInt(); 
			
			if (readyOrNot == 1)
				{
				System.out.println("Let's begin! \n");
				}
			
			else if (readyOrNot == 2)
				{
				System.out.println("Okay, goodbye."); 
				System.exit(readyOrNot); 
				}
			else
				{
				System.out.println("An error has occurred.");
				System.exit(readyOrNot);
				}
			
			
			System.out.println("What is your favorite thing to do in your free time? \n"
					+ " 1 Spending time with friends. \n 2 Sleeping \n 3 Practicing Music "
					+ "\n 4 Counting money \n 5 Playing sports! \n");
			int answer = scan.nextInt(); 
			
			if (answer > 5 || answer < 1) 
			{
				System.out.println("Error. Please enter a different number."); 
				answer = scan.nextInt(); 
			}	
			
			if(answer == 1)
				scount += 1;  
			
			else if(answer == 2)
				pcount += 1; 
			
			else if(answer == 3)
				sqcount += 1;
			
			else if(answer == 4)
				mcount += 1; 
			
			else if(answer == 5)
				sancount += 1;  
			
			
			System.out.println("What does your dream house look like? \n 1 One shaped like a pineapple, of course! "
					+ "\n 2 Somewhere dark, like under a rock. \n 3 Something architecturally unique \n 4 A house shaped"
					+ "like an anchor would be perfect! \n 5 Something dome like where I could see all the stars and the "
					+ "world around me. \n"); 
			answer = scan.nextInt(); 
			
			if (answer > 5 || answer < 1) 
				{
					System.out.println("Error. Please enter a different number."); 
					answer = scan.nextInt(); 
				}
			
			if(answer == 1)
				scount += 1;  
			
			else if(answer == 2)
				pcount += 1; 
			
			else if(answer == 3)
				sqcount += 1;
			
			else if(answer == 4)
				mcount += 1; 
			
			else if(answer == 5)
				sancount += 1;  
			
			
			
			System.out.println("What makes you the happiest? \n 1 Working my dream job! \n 2 Eating, relaxing, watching TV, "
					+ "you know just relaxing \n 3 Playing my instrument in peace away from others \n 4 Lots and lots and "
					+ "lots of money! \n 5 Being in nature, perferably near trees! \n");
			answer = scan.nextInt(); 
			
			if (answer > 5 || answer < 1) 
				{
					System.out.println("Error. Please enter a different number."); 
					answer = scan.nextInt(); 
				}
			
			
			if(answer == 1)
				scount += 1;  
			
			else if(answer == 2)
				pcount += 1; 
			
			else if(answer == 3)
				sqcount += 1;
			
			else if(answer == 4)
				mcount += 1; 
			
			else if(answer == 5)
				sancount += 1;  
			
			
			System.out.println("What is your favorite kind of music? \n 1 Anything upbeat, like pop music! \n 2 I'll listen "
					+ "to whatever \n 3 Classical music \n 4 Techno \n 5 Country \n");
			answer = scan.nextInt(); 
			
			if (answer > 5 || answer < 1) 
				{
					System.out.println("Error. Please enter a different number."); 
					answer = scan.nextInt(); 
				}
			
			if(answer == 1)
				scount += 1;  
			
			else if(answer == 2)
				pcount += 1; 
			
			else if(answer == 3)
				sqcount += 1;
			
			else if(answer == 4)
				mcount += 1; 
			
			else if(answer == 5)
				sancount += 1;   
			
			
			System.out.println("What would you have for a pet? \n 1 Cat \n 2 Rock \n 3 Pets are gross, none! \n "
					+ "4 Dog \n 5 A reptile \n"); 
			answer = scan.nextInt(); 
			
			if (answer > 5 || answer < 1) 
				{
					System.out.println("Error. Please enter a different number."); 
					answer = scan.nextInt(); 
				}
			
			if(answer == 1)
				scount++;  
			
			else if(answer == 2)
				pcount += 1; 
			
			else if(answer == 3)
				sqcount += 1;
			
			else if(answer == 4)
				mcount += 1; 
			
			else if(answer == 5)
				sancount += 1;  
			
			
			System.out.println("What is your favorite color? \n 1 Yellow \n 2 Pink \n 3 Gray \n 4 Red \n 5 Green \n");
			answer = scan.nextInt(); 
			
			if (answer > 5 || answer < 1) 
				{
					System.out.println("Error. Please enter a different number."); 
					answer = scan.nextInt(); 
				}
			
			if(answer == 1)
				scount += 1;  
			
			else if(answer == 2)
				pcount += 1; 
			
			else if(answer == 3)
				sqcount += 1;
			
			else if(answer == 4)
				mcount += 1; 
			
			else if(answer == 5)
				sancount += 1;  
			
			
			System.out.println("What is your favorite food to get when you go out to eat? \n 1 Krabby Patty "
					+ "\n 2 Chicken tenders and fries \n 3 Filet Mignon \n 4 I do not go out to eat and waste "
					+ "my money! \n 5 BBQ");
			answer = scan.nextInt(); 
			
			if (answer > 5 || answer < 1) 
				{
					System.out.println("Error. Please enter a different number."); 
					answer = scan.nextInt(); 
				}
			
			if(answer == 1)
				scount += 1;  
			
			else if(answer == 2)
				pcount += 1; 
			
			else if(answer == 3)
				sqcount += 1;
			
			else if(answer == 4)
				mcount += 1; 
			
			else if(answer == 5)
				sancount += 1;  
			
		}}
	
