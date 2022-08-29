package Models;

public class Staff {
    private int staffId;
    private String staffType;
    private String  staffTitle;
    private String staffFullName;
    private String staffAddress;
    private String staffEmail;
    private String mobileNumber;
    private String telephoneNumber;
    private int loginId;

    public Staff() {
        this.staffId = 0;
        this.staffType = "";
        this.staffTitle = "";
        this.staffFullName = "";
        this.staffAddress = "";
        this.staffEmail = "";
        this.mobileNumber = "";
        this.telephoneNumber = "";
        this.loginId = 0;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    public String getStaffTitle() {
        return staffTitle;
    }

    public void setStaffTitle(String staffTitle) {
        this.staffTitle = staffTitle;
    }

    public String getStaffFullName() {
        return staffFullName;
    }

    public void setStaffFullName(String staffFullName) {
        this.staffFullName = staffFullName;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }
}
