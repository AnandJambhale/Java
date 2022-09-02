package com.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Entities {

    @Id
    private int countryCode;

    private String countryName;

    private String countryCodeMachine;

    private int countryCodeAlternate;

    private int regionCode;

    private int currencyLimit;

    private int overallLimit;

    private int Lban;

    private String sEuMember;

    private int BicCode;

    private String MtGenerate;

    private boolean isClearingNetwork;

    private String status;

    private String recordVersion;

    private boolean authorized;

    private String lastConfigurationAction;

    private long lifeCycleId;

    private long referenceNo;

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCodeMachine() {
        return countryCodeMachine;
    }

    public void setCountryCodeMachine(String countryCodeMachine) {
        this.countryCodeMachine = countryCodeMachine;
    }

    public int getCountryCodeAlternate() {
        return countryCodeAlternate;
    }

    public void setCountryCodeAlternate(int countryCodeAlternate) {
        this.countryCodeAlternate = countryCodeAlternate;
    }

    public int getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(int regionCode) {
        this.regionCode = regionCode;
    }

    public int getCurrencyLimit() {
        return currencyLimit;
    }

    public void setCurrencyLimit(int currencyLimit) {
        this.currencyLimit = currencyLimit;
    }

    public int getOverallLimit() {
        return overallLimit;
    }

    public void setOverallLimit(int overallLimit) {
        this.overallLimit = overallLimit;
    }

    public int getLban() {
        return Lban;
    }

    public void setLban(int lban) {
        Lban = lban;
    }

    public String getsEuMember() {
        return sEuMember;
    }

    public void setsEuMember(String sEuMember) {
        this.sEuMember = sEuMember;
    }

    public int getBicCode() {
        return BicCode;
    }

    public void setBicCode(int bicCode) {
        BicCode = bicCode;
    }

    public String getMtGenerate() {
        return MtGenerate;
    }

    public void setMtGenerate(String mtGenerate) {
        MtGenerate = mtGenerate;
    }

    public boolean isClearingNetwork() {
        return isClearingNetwork;
    }

    public void setClearingNetwork(boolean clearingNetwork) {
        isClearingNetwork = clearingNetwork;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRecordVersion() {
        return recordVersion;
    }

    public void setRecordVersion(String recordVersion) {
        this.recordVersion = recordVersion;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public String getLastConfigurationAction() {
        return lastConfigurationAction;
    }

    public void setLastConfigurationAction(String lastConfigurationAction) {
        this.lastConfigurationAction = lastConfigurationAction;
    }

    public long getLifeCycleId() {
        return lifeCycleId;
    }

    public void setLifeCycleId(long lifeCycleId) {
        this.lifeCycleId = lifeCycleId;
    }

    public long getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(long referenceNo) {
        this.referenceNo = referenceNo;
    }

    public Entities() {
    }

    public Entities(int countryCode, String countryName, String countryCodeMachine, int countryCodeAlternate, int regionCode, int currencyLimit, int overallLimit, int lban, String sEuMember, int bicCode, String mtGenerate, boolean isClearingNetwork, String status, String recordVersion, boolean authorized, String lastConfigurationAction, long lifeCycleId, long referenceNo) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryCodeMachine = countryCodeMachine;
        this.countryCodeAlternate = countryCodeAlternate;
        this.regionCode = regionCode;
        this.currencyLimit = currencyLimit;
        this.overallLimit = overallLimit;
        Lban = lban;
        this.sEuMember = sEuMember;
        BicCode = bicCode;
        MtGenerate = mtGenerate;
        this.isClearingNetwork = isClearingNetwork;
        this.status = status;
        this.recordVersion = recordVersion;
        this.authorized = authorized;
        this.lastConfigurationAction = lastConfigurationAction;
        this.lifeCycleId = lifeCycleId;
        this.referenceNo = referenceNo;
    }

    @Override
    public String toString() {
        return "Entities{" +
                "countryCode=" + countryCode +
                ", countryName='" + countryName + '\'' +
                ", countryCodeMachine='" + countryCodeMachine + '\'' +
                ", countryCodeAlternate=" + countryCodeAlternate +
                ", regionCode=" + regionCode +
                ", currencyLimit=" + currencyLimit +
                ", overallLimit=" + overallLimit +
                ", Lban=" + Lban +
                ", sEuMember='" + sEuMember + '\'' +
                ", BicCode=" + BicCode +
                ", MtGenerate='" + MtGenerate + '\'' +
                ", isClearingNetwork=" + isClearingNetwork +
                ", status='" + status + '\'' +
                ", recordVersion='" + recordVersion + '\'' +
                ", authorized=" + authorized +
                ", lastConfigurationAction='" + lastConfigurationAction + '\'' +
                ", lifeCycleId=" + lifeCycleId +
                ", referenceNo=" + referenceNo +
                '}';
    }
}
