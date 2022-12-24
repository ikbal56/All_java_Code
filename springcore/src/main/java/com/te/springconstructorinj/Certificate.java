package com.te.springconstructorinj;

public class Certificate {
	
	private String certificateName;

	public Certificate(String certificateName) {
		super();
		this.certificateName = certificateName;
	}

	@Override
	public String toString() {
		return "Certificate [certificateName=" + certificateName + "]";
	}
	
	

}
