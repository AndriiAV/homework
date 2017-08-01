package model.entity;

public class Record {
    private String lastName;
	private String firstName;
    private String middleName;
    
    private String shortName = new StringBuilder()
    .append(lastName)
    .append(" ")
    .append(firstName.charAt(0))
    .append(".").toString();
    
    private String nickName;
    private String comment;
    private Group group;
    private String homePhone;
    private String cellPhonel;
    private String cellPhone2; //can be null
    private String email;
    private Address address;
    private String fullAddress = address.toString();
    
    private String inputDate;
    private String editDate;
	
    public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getCellPhonel() {
		return cellPhonel;
	}
	public void setCellPhonel(String cellPhonel) {
		this.cellPhonel = cellPhonel;
	}
	public String getCellPhone2() {
		return cellPhone2;
	}
	public void setCellPhone2(String cellPhone2) {
		this.cellPhone2 = cellPhone2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getInputDate() {
		return inputDate;
	}
	public void setInputDate(String inputDate) {
		this.inputDate = inputDate;
	}
	public String getEditDate() {
		return editDate;
	}
	public void setEditDate(String editDate) {
		this.editDate = editDate;
	}
	
	public Record(String lastName, String firstName, String middleName, String nickName,
			String comment, Group group, String homePhone, String cellPhonel, String cellPhone2, 
			String email, Address address, String fullAddress) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.nickName = nickName;
		this.comment = comment;
		this.group = group;
		this.homePhone = homePhone;
		this.cellPhonel = cellPhonel;
		this.cellPhone2 = cellPhone2;
		this.email = email;
		this.address = address;
		this.fullAddress = fullAddress;
	}
	
	public Record() {
	}
}
