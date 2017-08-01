package view;

import model.*;

public class View {
    public static final String LAST_NAME = "Lastname: \n";
    public static final String FIRST_NAME = "Name: \n";
    public static final String MIDDLE_NAME = "Middle name: \n";
    public static final String NICK_NAME = "Nick Name: \n";
    public static final String COMMENT = "Comment: \n";
    public static final String GROUP = "Group(FAMILY, WORK, OTHER): \n";
    public static final String HOME_PHONE = "Home phone: \n";
    public static final String CELL_PHONE_1 = "CellPhonel: \n";
    public static final String CELL_PHONE_2 = "CellPhone2: \n";
    public static final String EMAIL = "Email: \n";
    public static final String ZIP = "Address zip: \n";
    public static final String CITY = "Address city: \n";
    public static final String STREET = "Address street: \n";
    public static final String HOUSE = "Address house: \n";
    public static final String APPARTMENT = "Address appartment: \n";

    public static final String INPUT_WRONG = "Incorrect data! Please, repeat. \n";


    public static final String REG_NAME = "^[A-Za-z]+{2,22}$";
    public static final String REG_NICKNAME = "^[A-Za-z0-9_-]{3,8}$";
    public static final String REG_TEXT = "^*{0,200}";
    public static final String REG_HOME_PHONE = "^[0-9]{7}$";
    public static final String REG_CELL_PHONE = "^([+]?[0-9\\s-\\(\\)]{3,25})*$";

    public static final String REG_EMAIL = "^[A-Za-z0-9_]{1,20}@[a-z]{1,20}\\.[a-z]{1,20}$";

	public void printMessage (String message) {
        System.out.println("Please, input data. "+message);
    }
    
	public void inputValue (String field, String regex) {
		
	}; 
    
}
