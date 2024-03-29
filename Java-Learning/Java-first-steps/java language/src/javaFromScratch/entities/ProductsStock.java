package javaFromScratch.entities;

public class ProductsStock {
    public String productName;
    public Double productPrice;
    public Integer productQuantity;

    public ProductsStock(String productName, Double productPrice, Integer productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public void getTotalStockNValue() {
        Double totalProductPrice = (double) this.productQuantity * this.productPrice;
        System.out.println(String.format("We have %d of %s in stock, totalizing $ %.2f", this.productQuantity, this.productName, totalProductPrice));
    }

    public void addQuantity(Integer quantity) {
        this.productQuantity += quantity;
    }

    public void removeQuantity(Integer quantity) {
        this.productQuantity -= quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }


//    para não gerar inconsistência, é bom que não seja possível alterar diretamente a quantidade, já que isso é feito com compras e vendas
//    public void setProductQuantity(Integer productQuantity) {
//        this.productQuantity = productQuantity;
//    }

    @Override
//     o método toString é nativo de qualquer objeto, e o nativo imprimirá o local onde está e onde foi alocado na memória,
//     por isso fazemos o @Override (a sobreposição) do método
    public String toString() {
        return  "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
