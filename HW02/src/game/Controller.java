package game;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        model.setGameNumber(model.random(model.minRand, model.maxRand));
        view.printTask(model.minRand, model.maxRand);
        model.userNumber = inputIntValueWithScanner(sc);
        while (!model.giveAnswer(model.userNumber, model.getGameNumber())) {
            if (model.comparing(model.userNumber, model.getGameNumber()).equals("Game number higher")) {
            	model.minRand = model.userNumber;
            } 
            else if (model.comparing(model.userNumber, model.getGameNumber()).equals("Game number less")) {
            	model.maxRand = model.userNumber;
            } 
            else 
            	view.printMessage(model.comparing(model.userNumber, model.getGameNumber()));

            view.printTask(model.minRand, model.maxRand);
            view.printMessage(model.comparing(model.userNumber, model.getGameNumber()));
            model.userNumber = inputIntValueWithScanner(sc);
        }
        view.printMessage(model.comparing(model.userNumber, model.getGameNumber()));
    }

    public boolean checkedInputValue (int input) {
    	if (input<model.minRand || input>model.maxRand)
    		return false;
    		else return true;
    }
        
    public int inputIntValueWithScanner(Scanner sc) {
        int input = 0;
    	view.printMessage(view.INPUT_DATA);
        while (! sc.hasNextInt()) {
            view.printMessage(view.WRONG_DATA);
            sc.next();
        };
        input = sc.nextInt();
        
        if (checkedInputValue(input))
        	return input;
        	else {
        		view.printMessage(view.OUT_DATA);
        		inputIntValueWithScanner(sc);
        		return input;
        	}
    }
}
