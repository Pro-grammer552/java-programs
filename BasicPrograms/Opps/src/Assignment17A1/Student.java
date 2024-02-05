package Assignment17A1;

public class Student {
	
	
	
	public String cName;
	private int accBalance;
	protected String Cemail;
	String Caddress;
	
	
    public void doPublic() {
        System.out.println("This is a public method.");
    }

    void doDefault() {
        System.out.println("This is a default method.");
    }

    protected void doProtected() {
        System.out.println("This is a protected method.");
    }

    private void doPrivate() {
        System.out.println("This is a private method.");
    }
	
	
	

}
