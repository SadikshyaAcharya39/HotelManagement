package Models;

public class Invoice {
    private int invoiceId;
    private String invoiceDate;
    private float amountBilled;
    private String invoiceStatus;
    private int tax;
    private float discount;
    private int bookingId;

    public Invoice() {
        this.invoiceId = 0;
        this.invoiceDate = "";
        this.amountBilled = 0f;
        this.invoiceStatus = "";
        this.tax = 0;
        this.discount = 0f;
        this.bookingId = 0;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public float getAmountBilled() {
        return amountBilled;
    }

    public void setAmountBilled(float amountBilled) {
        this.amountBilled = amountBilled;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
}

