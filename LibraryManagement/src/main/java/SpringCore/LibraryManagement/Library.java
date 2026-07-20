package SpringCore.LibraryManagement;

import java.util.List;

public class Library {
	
	private int libraryCode;
	private String libraryName;
	private String inChargePerson;
	private long contactNumber;
	private List<String> genres;
	
	private static int uniquecode =1;
	
	public Library() {
		IO.println("Object is successfully created!");
	}

	public Library(String libraryName) {
		super();
		this.libraryName = libraryName;
		
	}
	
	public void init() {
		IO.println("Post Constrution...");
		this.libraryCode = uniquecode++;
	}
	
	

	public int getLibraryCode() {
		return libraryCode;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public String getInChargePerson() {
		return inChargePerson;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setLibraryCode(int libraryCode) {
		this.libraryCode = libraryCode;
		IO.println("setter injection has happened for the Library");
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
		IO.println("setter injection has happened for the Library");
	}

	public void setInChargePerson(String inChargePerson) {
		this.inChargePerson = inChargePerson;
		IO.println("setter injection has happened for the Library");
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
		IO.println("setter injection has happened for the Library");
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
		IO.println("setter injection has happened for the Library");
	}

	@Override
	public String toString() {
		return "Library [libraryCode=" + libraryCode + "\n libraryName=" + libraryName + "\n inChargePerson="
				+ inChargePerson + "\n contactNumber=" + contactNumber + "\n genres=" + genres + "]";
	}

	
	public void destroy() {
		IO.println("Post Distruction logic executed..");
		this.libraryName = null;
		this.libraryCode = 0;
		this.inChargePerson = null;
		this.contactNumber = 0;
		this.genres = null;
	}
	
	

}
