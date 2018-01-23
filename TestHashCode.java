
public class TestHashCode {
	
	public String title="";
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public boolean equals(Object obj){
		TestHashCode thc=(TestHashCode)obj;
		return getTitle().equals(thc.getTitle());
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return title.hashCode();
	}
}
