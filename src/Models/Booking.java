
package Models;

public class Booking {
    private int bookingId;
    private String bookingStatus;
    private String dateBooked;
    private String checkinDate;
    private String checkoutDate;
    private int staffId;
    private int roomId;
    private int customerId;

    public Booking() {
        this.bookingId = 0;
        this.bookingStatus = "";
        this.dateBooked = "";
        this.checkinDate = "";
        this.checkoutDate = "";
        this.staffId = 0;
        this.roomId = 0;
        this.customerId = 0;
    }

    public Booking(String checkinDate, String checkoutDate) {
        this();
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getDateBooked() {
        return dateBooked;
    }

    public void setDateBooked(String dateBooked) {
        this.dateBooked = dateBooked;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}


