package Models;

public class Customer {
    private  int customerId;
    private String title ;
    private String fullName;
    private String address;
    private String email;
    private String telephoneNumber;
    private String custType;
    private String CreditCardInfo;
    private String CompanyName;
    private String companyAddress;
    private String contact;
    private float discountOffered;
    private String expiryDate;
    private String bilingDate;
    private int loginId;

    public Customer() {
        this.customerId = 0;
        this.title = "";
        this.fullName = "";
        this.address = "";
        this.email = "";
        this.telephoneNumber = "";
        this.custType = "";
        this.CreditCardInfo = "";
        this.CompanyName = "";
        this.companyAddress = "";
        this.contact = "";
        this.discountOffered = 0f;
        this.expiryDate = "";
        this.bilingDate = "";
        this.loginId = 0;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getCreditCardInfo() {
        return CreditCardInfo;
    }

    public void setCreditCardInfo(String creditCardInfo) {
        CreditCardInfo = creditCardInfo;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public float getDiscountOffered() {
        return discountOffered;
    }

    public void setDiscountOffered(float discountOffered) {
        this.discountOffered = discountOffered;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getBilingDate() {
        return bilingDate;
    }

    public void setBilingDate(String bilingDate) {
        this.bilingDate = bilingDate;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }
}
