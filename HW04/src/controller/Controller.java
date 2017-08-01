package controller;

import java.util.Scanner;

import model.entity.*;
import view.*;

public class Controller {
    
    View view = new View();
	Scanner sc = new Scanner (System.in);
	Address address;
	String fullAddress;
	
	Record record = new Record(
			checkedData(sc, view.LAST_NAME, view.REG_NAME),
			checkedData(sc, view.FIRST_NAME, view.REG_NAME),
			checkedData(sc, view.MIDDLE_NAME, view.REG_NAME),
			checkedData(sc, view.NICK_NAME, view.REG_NICKNAME),
			checkedData(sc, view.COMMENT, view.REG_TEXT),
			checkedData(sc, view.GROUP, view.REG_TEXT, Group.valueOf(null)),
			checkedData(sc, view.HOME_PHONE, view.REG_HOME_PHONE),
			checkedData(sc, view.CELL_PHONE_1, view.REG_CELL_PHONE),
			checkedData(sc, view.CELL_PHONE_2, view.REG_CELL_PHONE),
			checkedData(sc, view.EMAIL, view.REG_EMAIL),
			address = new Address(
					checkedData(sc, view.ZIP, view.REG_TEXT),
					checkedData(sc, view.CITY, view.REG_TEXT),
					checkedData(sc, view.STREET, view.REG_TEXT),
					checkedData(sc, view.HOUSE, view.REG_TEXT),
					checkedData(sc, view.APPARTMENT, view.REG_TEXT)),
			fullAddress = address.toString()
			);

    
	public Controller(Record record, View view) {
		this.record = record;
        this.view = view;
    }
	
	private String checkedData(Scanner sc, String input, String regex) {
    	view.printMessage(input);
		String inputData = sc.next();
        while (!inputData.matches(regex)) {
            view.printMessage(view.INPUT_WRONG);
            inputData = sc.next();            
        };
        return inputData;
    }
	
	public void processUser(){}
	
	private Group checkedData(Scanner sc, String input, String regex, Group gInput) {
    	view.printMessage(input.toString());
		String inputData = sc.next();
        while (!inputData.matches(regex)) {
            view.printMessage(view.INPUT_WRONG);
            inputData = sc.next();            
        };
        Group inputGroup = Group.valueOf(inputData);
        return inputGroup;
    }
}
