/**
 * 商品类
 * liangkaoxin
 */
public class Commodity {
    /**
     * 商品价格
     */
    private int price;
    /**
     * 商品编号
     */
    private int id;
    /**
     * 商品名字
     */
    private String commodityName;
    /**
     *店铺名字
     */
    private String shopName;
    /**
     *发货地址
     */
    private String shippingAddress;
    /**
     *商品参数
     */
    private String parameter;
    /**
     *商品评价
     */
    private String evaluate;

    /**
     * 构造函数
     * @param price
     * @param id
     * @param commodityName
     * @param shopName
     * @param shippingAddress
     * @param parameter
     * @param evaluate
     */
    public Commodity(int price, int id, String commodityName, String shopName, String shippingAddress, String parameter, String evaluate) {
        this.price = price;
        this.id = id;
        this.commodityName = commodityName;
        this.shopName = shopName;
        this.shippingAddress = shippingAddress;
        this.parameter = parameter;
        this.evaluate = evaluate;
    }
    /**
     * 以下是成员的各个get，和set函数
     */
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }
}
