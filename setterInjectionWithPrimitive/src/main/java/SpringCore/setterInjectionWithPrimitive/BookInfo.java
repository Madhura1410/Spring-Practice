package SpringCore.setterInjectionWithPrimitive;

public class BookInfo {
	
	private String title;
	private int price;
	private int pages;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	@Override
	public String toString() {
		return "BookInfo [title=" + title + ", price=" + price + ", pages=" + pages + "]";
	}
	
	
	
	

}
