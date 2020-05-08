package com.substation.api.model;

public class FilterRequest {
	
	//builder.append
	private Long unitId;
	private String districtName;
	private String substationName;
	
	
	public Long getUnitId() {
		return unitId;
	}
	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getSubstationName() {
		return substationName;
	}
	public void setSubstationName(String substationName) {
		this.substationName = substationName;
	}
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("FilterRequest [unitId=");
		stringBuilder.append(unitId);
		stringBuilder.append(", districtName=");
		stringBuilder.append(districtName);
		stringBuilder.append(", substationName=");
		stringBuilder.append(substationName);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	

}

