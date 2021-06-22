package com.Springcore.ci;

public class Certificate {
	
	private String certi;

	/**
	 * @return the certi
	 */
	public String getCerti() {
		return certi;
	}

	/**
	 * @param certi the certi to set
	 */
	public void setCerti(String certi) {
		this.certi = certi;
	}

	public Certificate(String certi) {
		super();
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Certificate [certi=" + certi + "]";
	}
	
	

}
