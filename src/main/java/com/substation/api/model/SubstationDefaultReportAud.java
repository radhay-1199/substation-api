package com.substation.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "substation_default_report_aud")
public class SubstationDefaultReportAud {

private static final long serialVersionUID = 1L;
	
	/*
	 * @Id
	 * 
	 * @Column
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long sno;
	 */
	@EmbeddedId
	private PrimaryKeys primaryKeys;
	@Column
	private Long unitId;
	@Column
	private String districtName;
	@Column
	private String substationName;
	@Column
	private Integer capacity;
	@CreationTimestamp
	@Column
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime packetReceivedDate;
	@Column
	private Integer rYVoltage;
	@Column
	private Integer yBVoltage;
	@Column
	private Integer bRVoltage;
	@Column
	private Integer rCurrent;
	@Column
	private Integer yCurrent;
	@Column
	private Integer bCurrent;
	@Column
	private Integer rCapCurrent;
	@Column
	private Integer yCapCurrent;
	@Column
	private Integer bCapCurrent;
	@Column
	private Integer totalPf;
	@Column
	private Integer overallApparentPower;
	@Column
	private Integer overallActivePower;
	@Column
	private Integer overallReactivePowerIND;
	@Column
	private Integer overallReactivePowerCAP;
	@Column
	private String remark;
	@Column
	private Integer rev;
	@Column
	private Integer revType;
	public PrimaryKeys getPrimaryKeys() {
		return primaryKeys;
	}
	public void setPrimaryKeys(PrimaryKeys primaryKeys) {
		this.primaryKeys = primaryKeys;
	}
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
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public LocalDateTime getPacketReceivedDate() {
		return packetReceivedDate;
	}
	public void setPacketReceivedDate(LocalDateTime packetReceivedDate) {
		this.packetReceivedDate = packetReceivedDate;
	}
	public Integer getrYVoltage() {
		return rYVoltage;
	}
	public void setrYVoltage(Integer rYVoltage) {
		this.rYVoltage = rYVoltage;
	}
	public Integer getyBVoltage() {
		return yBVoltage;
	}
	public void setyBVoltage(Integer yBVoltage) {
		this.yBVoltage = yBVoltage;
	}
	public Integer getbRVoltage() {
		return bRVoltage;
	}
	public void setbRVoltage(Integer bRVoltage) {
		this.bRVoltage = bRVoltage;
	}
	public Integer getrCurrent() {
		return rCurrent;
	}
	public void setrCurrent(Integer rCurrent) {
		this.rCurrent = rCurrent;
	}
	public Integer getyCurrent() {
		return yCurrent;
	}
	public void setyCurrent(Integer yCurrent) {
		this.yCurrent = yCurrent;
	}
	public Integer getbCurrent() {
		return bCurrent;
	}
	public void setbCurrent(Integer bCurrent) {
		this.bCurrent = bCurrent;
	}
	public Integer getrCapCurrent() {
		return rCapCurrent;
	}
	public void setrCapCurrent(Integer rCapCurrent) {
		this.rCapCurrent = rCapCurrent;
	}
	public Integer getyCapCurrent() {
		return yCapCurrent;
	}
	public void setyCapCurrent(Integer yCapCurrent) {
		this.yCapCurrent = yCapCurrent;
	}
	public Integer getbCapCurrent() {
		return bCapCurrent;
	}
	public void setbCapCurrent(Integer bCapCurrent) {
		this.bCapCurrent = bCapCurrent;
	}
	public Integer getTotalPf() {
		return totalPf;
	}
	public void setTotalPf(Integer totalPf) {
		this.totalPf = totalPf;
	}
	public Integer getOverallApparentPower() {
		return overallApparentPower;
	}
	public void setOverallApparentPower(Integer overallApparentPower) {
		this.overallApparentPower = overallApparentPower;
	}
	public Integer getOverallActivePower() {
		return overallActivePower;
	}
	public void setOverallActivePower(Integer overallActivePower) {
		this.overallActivePower = overallActivePower;
	}
	public Integer getOverallReactivePowerIND() {
		return overallReactivePowerIND;
	}
	public void setOverallReactivePowerIND(Integer overallReactivePowerIND) {
		this.overallReactivePowerIND = overallReactivePowerIND;
	}
	public Integer getOverallReactivePowerCAP() {
		return overallReactivePowerCAP;
	}
	public void setOverallReactivePowerCAP(Integer overallReactivePowerCAP) {
		this.overallReactivePowerCAP = overallReactivePowerCAP;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getRev() {
		return rev;
	}
	public void setRev(Integer rev) {
		this.rev = rev;
	}
	public Integer getRevType() {
		return revType;
	}
	public void setRevType(Integer revType) {
		this.revType = revType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SubstationDefaultReportAud [primaryKeys=");
		stringBuilder.append(primaryKeys);
		stringBuilder.append(", unitId=");
		stringBuilder.append(unitId);
		stringBuilder.append(", districtName=");
		stringBuilder.append(districtName);
		stringBuilder.append(", substationName=");
		stringBuilder.append(substationName);
		stringBuilder.append(", capacity=");
		stringBuilder.append(capacity);
		stringBuilder.append(", packetReceivedDate=");
		stringBuilder.append(packetReceivedDate);
		stringBuilder.append(", rYVoltage=");
		stringBuilder.append(rYVoltage);
		stringBuilder.append(", yBVoltage=");
		stringBuilder.append(yBVoltage);
		stringBuilder.append(", bRVoltage=");
		stringBuilder.append(bRVoltage);
		stringBuilder.append(", rCurrent=");
		stringBuilder.append(rCurrent);
		stringBuilder.append(", yCurrent=");
		stringBuilder.append(yCurrent);
		stringBuilder.append(", bCurrent=");
		stringBuilder.append(bCurrent);
		stringBuilder.append(", rCapCurrent=");
		stringBuilder.append(rCapCurrent);
		stringBuilder.append(", yCapCurrent=");
		stringBuilder.append(yCapCurrent);
		stringBuilder.append(", bCapCurrent=");
		stringBuilder.append(bCapCurrent);
		stringBuilder.append(", totalPf=");
		stringBuilder.append(totalPf);
		stringBuilder.append(", overallApparentPower=");
		stringBuilder.append(overallApparentPower);
		stringBuilder.append(", overallActivePower=");
		stringBuilder.append(overallActivePower);
		stringBuilder.append(", overallReactivePowerIND=");
		stringBuilder.append(overallReactivePowerIND);
		stringBuilder.append(", overallReactivePowerCAP=");
		stringBuilder.append(overallReactivePowerCAP);
		stringBuilder.append(", remark=");
		stringBuilder.append(remark);
		stringBuilder.append(", rev=");
		stringBuilder.append(rev);
		stringBuilder.append(", revType=");
		stringBuilder.append(revType);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
}
