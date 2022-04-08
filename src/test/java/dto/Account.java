package dto;

public class Account {
    String name,
            website,
            phone,
            billingCity,
            billingZipCode,
            billingStateCode,
            billingCountry,
            shippingCity,
            shippingZipCode,
            shippingState,
            shippingCountry,
            type,
            industry,
            description,
            billingStreet,
            shippingStreet;

    public Account(String name, String website, String phone, String billingCity, String billingZipCode,
                   String billingStateCode, String billingCountry, String shippingCity, String shippingZipCode,
                   String shippingState, String shippingCountry, String type, String industry,
                   String description, String billingStreet, String shippingStreet) {
        this.name = name;
        this.website = website;
        this.phone = phone;
        this.billingCity = billingCity;
        this.billingZipCode = billingZipCode;
        this.billingStateCode = billingStateCode;
        this.billingCountry = billingCountry;
        this.shippingCity = shippingCity;
        this.shippingZipCode = shippingZipCode;
        this.shippingState = shippingState;
        this.shippingCountry = shippingCountry;
        this.type = type;
        this.industry = industry;
        this.description = description;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingZipCode() {
        return billingZipCode;
    }

    public void setBillingZipCode(String billingZipCode) {
        this.billingZipCode = billingZipCode;
    }

    public String getBillingStateCode() {
        return billingStateCode;
    }

    public void setBillingStateCode(String billingStateCode) {
        this.billingStateCode = billingStateCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingZipCode() {
        return shippingZipCode;
    }

    public void setShippingZipCode(String shippingZipCode) {
        this.shippingZipCode = shippingZipCode;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }
}
