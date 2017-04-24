public class POI {
	public String locationName;
	public String city;
	public String state;
	public String zip;
	public String dataType;
	public String dataValue;
	public String dateRecorded;
	public boolean flagged;
	public String dateFlagged;
	
	public POI() {}
	
	public String getLocationName() {
		return this.locationName;
	}
	
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZIP() {
		return this.zip;
	}
	
	public void setZIP(String zip) {
		this.zip = zip;
	}
	
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
}
