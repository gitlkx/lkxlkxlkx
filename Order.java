/**
 * 订单类
 * liangkaoxin
 */
public class Order {
    /**
     * 商品名
     */
    private String name;
    /**
     * 商家
     */
    private String business;
    /**
     * 订单编号
     */
    private int id;
    /**
     * 价格
     */
    private double price;
    /**
     * 下单时间
     */
    private int orderTime;
    /**
     * 收货地址
     */
    private String receivingAddress;
    /**
     * 收货人姓名
     */
    private String peopleName;
    /**
     * 收货人电话号码
     */
    private String phoneNumber ;

    /**
     * 构造函数
     * @param name
     * @param business
     * @param id
     * @param price
     * @param orderTime
     * @param receivingAddress
     * @param peopleName
     * @param phoneNumber
     */
    public Order(String name, String business, int id, double price, int orderTime, String receivingAddress, String peopleName, String phoneNumber) {
        this.name = name;
        this.business = business;
        this.id = id;
        this.price = price;
        this.orderTime = orderTime;
        this.receivingAddress = receivingAddress;
        this.peopleName = peopleName;
        this.phoneNumber = phoneNumber;
    }
    /**
     * 以下是成员的各个get，和set函数
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(int orderTime) {
        this.orderTime = orderTime;
    }

    public String getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
