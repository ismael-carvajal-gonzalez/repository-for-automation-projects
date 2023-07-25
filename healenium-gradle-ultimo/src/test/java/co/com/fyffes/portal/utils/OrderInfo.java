package co.com.fyffes.portal.utils;

public class OrderInfo {
    private String orderNumber;
    private String sysDocumentId;
    private String customerNumber;

    public OrderInfo(String orderNumber, String sysDocumentId, String customerNumber) {
        this.orderNumber = orderNumber;
        this.sysDocumentId = sysDocumentId;
        this.customerNumber = customerNumber;
    }

    // Getters y setters

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSysDocumentId() {
        return sysDocumentId;
    }

    public void setSysDocumentId(String sysDocumentId) {
        this.sysDocumentId = sysDocumentId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

}

