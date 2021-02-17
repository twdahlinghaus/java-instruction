public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
        Product product = null;

        // fill the Product object with data
        //product.Code(productCode);
        if (productCode.equalsIgnoreCase("java")) {
            product = new Product (productCode, "Murach's Java Programming", 57.50);
        } else if (productCode.equalsIgnoreCase("jsp")) {
            product = new Product (productCode, "Murach's Java Servlets and JSP", 57.50);
        } else if (productCode.equalsIgnoreCase("mysql")) {
            product = new Product (productCode, "Murach's MySQL", 54.50);
        } else if (productCode.equalsIgnoreCase("corvette")) {
            product = new Product (productCode, "Corvette", 25000.00);
        } else {
            product = new Product (productCode, "Unknown", 0);
        }
        return product;
    }
}