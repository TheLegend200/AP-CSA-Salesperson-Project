public class product {
    private String productName;
    private int productNumber;
    private double productWeight;
    private int productNumberStock;
    private double productCost;

    public product(String pName, int pNumber, double pWeight, int pStock, double pCost) {
        productName = pName;
        productNumber = pNumber;
        productWeight = pWeight;
        productNumberStock = pStock;
        productCost = pCost;
    }

    // example of set method
    public void updateProductName(String name) {
        productName = name;
    }

    public void updateProductNumber(int number) {
        productNumber = number;
    }

    public void updateProductWeight(double weight) {
        productWeight = weight;
    }

    public void updateProductNumberStock(int stock) {
        productNumberStock = stock;
    }

    public void updateProductCost(double cost) {
        productCost = cost;
    }

    public String returnProductName() {
        return productName;
    }

    public int returnProductNumber() {
        return productNumber;
    }

    public double returnProductWeight() {
        return productWeight;
    }

    public double returnProductStock() {
        return productNumberStock;
    }

    public double returnProductCost() {
        return productCost;
    }

    // change this so that it returns all of the information for this object
    public String toString() {
        return " Product name is " + productName + ", product number is "
                + productNumber + ", product weight is " + productWeight + ", there are " + productNumberStock +
                " of these in stock, and each one costs $" + productCost;
    }

}
