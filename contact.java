public class contact {

    private String fname; // Stores first name of Contact
    private String lname; // Stores last name of Contact
    private String add;  // Stores address of Contact
    private String city; // Stores city of Contact
    private String state; // Stores state of Contact
    private long phonenumber; // Stores phone number of contact
    private long zip;  // Stores zip of Contact int

    // Creates Contact object based on parameters.
    public contact(String fname, String lname, String add, String city, String state, long phonenumber, long zip) {
		this.fname=fname;
        this.lname=lname;
        this.add=add;
        this.city=city;
        this.state=state;
        this.phonenumber=phonenumber;
        this.zip=zip;
    }

    // Returns the lname of a Contact
    public String getfName() {
		return fname;
    }

     // Returns the lname of a Contact
    public String getlName() {
        return lname;
    }

     // Returns the address of a Contact
    public String getAdd() {
        return add;
    }

     // Returns the city of a Contact
    public String getCity() {
        return city;
    }

    // Returns the state of a Contact
    public String getState() {
        return state;
    }

    // Returns the phone number of a Contact
    public long getNumber() {
		return phonenumber;
    }

    // Returns the phone number of a Contact
    public long zip() {
        return zip;
    }

    // Prints all information about a contact out.
    public void printcontact() {
		System.out.print("Name: " +fname+" "+lname+", Address: "+add+ ", City: " +city+", State: "+state);
		System.out.println(", Phone: " +phonenumber+ ", Pin Code: " + zip + ".");
    }

}
