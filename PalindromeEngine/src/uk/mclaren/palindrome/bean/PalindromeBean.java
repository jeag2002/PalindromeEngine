package uk.mclaren.palindrome.bean;

public class PalindromeBean {
	
	private String palyndrome;

	public PalindromeBean(){
		super();
		palyndrome = "";
	}
	
	public PalindromeBean(String _palyndrome){
		palyndrome = _palyndrome;
	}
	
	public void clear(){
		palyndrome = "";
	}
	
	public String getPalyndrome() {
		return palyndrome;
	}

	public void setPalyndrome(String palyndrome) {
		this.palyndrome = palyndrome;
	}
	
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) {
	        return false;
	    }
	    if (!(obj instanceof PalindromeBean)){
	        return false;
	    }
	    final PalindromeBean other = (PalindromeBean) obj;   
	    return (this.palyndrome.indexOf(other.getPalyndrome())!=-1) || (other.getPalyndrome().indexOf(this.palyndrome)!=-1) ;
	}

	

}
