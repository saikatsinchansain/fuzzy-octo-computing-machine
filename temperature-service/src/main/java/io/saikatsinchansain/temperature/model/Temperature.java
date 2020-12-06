/**
 * 
 */
package io.saikatsinchansain.temperature.model;

/**
 * @author Saikat Sain
 *
 */
public class Temperature {
	private Float value;
	private boolean isCelsuis;
	public Temperature() {
		super();
	}
	public Temperature(Float value, boolean isCelsuis) {
		super();
		this.value = value;
		this.isCelsuis = isCelsuis;
	}
	public Float getValue() {
		return value;
	}
	public void setValue(Float value) {
		this.value = value;
	}
	public boolean isCelsuis() {
		return isCelsuis;
	}
	public void setCelsuis(boolean isCelsuis) {
		this.isCelsuis = isCelsuis;
	}
	@Override
	public String toString() {
		return "Temperature [value=" + value + ", isCelsuis=" + isCelsuis + "]";
	}
}
