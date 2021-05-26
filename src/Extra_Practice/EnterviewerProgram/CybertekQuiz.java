package Extra_Practice.EnterviewerProgram;

import java.util.Scanner;

    public class CybertekQuiz {
        String prompt;
        String answer;

        public CybertekQuiz(String prompt, String answer) {
            this.prompt = prompt;
            this.answer = answer;

        }

        public static void main(String[] args) {
            String q1 = "Name the 2 the best instructors in the world:\n" +
                    "(1) Murodil & Saim\n(2) James Gosling & Anders Hejlsberg\n(3) Trump & Obama\n(4) Tim Berners-Lee & Donald Knuth";
            String q2 = "\nWhat is your favorite programming language?\n" +
                    "(1) Lolcode\n(2) ArnoldC\n(3) Chicken\n(4) Java";
            CybertekQuiz[] questions = {
                    new CybertekQuiz(q1, "1"),
                    new CybertekQuiz(q2, "4")
            };
            takeTest(questions);
        }

        public static void takeTest(CybertekQuiz[] questions) {
            int score = 0;
            Scanner keyboardInput = new Scanner(System.in);
            for (int i = 0; i < questions.length; i++) {
                System.out.print(questions[i].prompt);
                System.out.print("\n\tEnter Your answer choice: ");
                String answer = keyboardInput.nextLine();
                if (answer.equals(questions[i].answer)) {
                    score++;
                }
            }
            System.err.println("\nYou got " + score + "/" + questions.length + " --> You are very close to become SDET!!!");
        }
    }
