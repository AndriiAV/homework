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
  //          	view.printMessage(model.comparing(model.userNumber, model.getGameNumber()));
            } 
            else if (model.comparing(model.userNumber, model.getGameNumber()).equals("Game number less")) {
            	model.maxRand = model.userNumber;
  //          	view.printMessage(model.comparing(model.userNumber, model.getGameNumber()));
            } 
            else 
            	view.printMessage(model.comparing(model.userNumber, model.getGameNumber()));

            view.printTask(model.minRand, model.maxRand);
            view.printMessage(model.comparing(model.userNumber, model.getGameNumber()));
            model.userNumber = inputIntValueWithScanner(sc);
        }
        view.printMessage(model.comparing(model.userNumber, model.getGameNumber()));
    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_DATA);
        while (! sc.hasNextInt()) {
            view.printMessage(view.WRONG_DATA);
            sc.next();
        };
        return sc.nextInt();
    }
}
