package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
	List notebook = new ArrayList<Record>();

	public Notebook(List notebook) {
		this.notebook = notebook;
	}

	public void addRecord(Record record) {
		notebook.add(record);
	}
	
	public void addRecordsList(List <Record> recordsList) {
		notebook.add(recordsList);
	}
	
}
