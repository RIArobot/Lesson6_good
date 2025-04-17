package ex3;

import java.util.List;

class Order {
    private String eMail;
    private String id;
    private List<String> items;

    public Order(String eMail, String id, List<String> items) {
        this.eMail = eMail;
        this.id = id;
        this.items = items;
    }

    public String getCustomerEmail() {
        return eMail;
    }

    public String getId() {
        return id;
    }

    public List<String> getItems() {
        return items;
    }

    public String getMail() {
        return eMail;
    }

}
