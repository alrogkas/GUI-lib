package library;

public class Member {
	
	private int id;
	private String name;
	static final int MAX_ON_LOAN = 6;
	//final means the attribute is a constant 
	//static we will discuss this on week 6-7 
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public static int getMaxOnLoan() {
		return MAX_ON_LOAN;
	}
	@Override
	public String toString() {
		return "Member [id = " + id + ", name = " + name +  ", max on loan = " + MAX_ON_LOAN +"]";
	}
	

}
