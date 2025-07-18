package edu.sm.frame;

public class ProductSql {
    public static String insert = "INSERT INTO product VALUES (0,?,?,?,?,NOW(),NOW(),?)";
    public static String select = "SELECT * FROM product p INNER JOIN cate c ON p.cate_id=c.cate_id where product_id=?";
    public static String delete = "DELETE FROM product WHERE product_id=?";
    public static String selectAll = "SELECT * FROM product p INNER JOIN cate c ON p.cate_id=c.cate_id";
    public static String update = "UPDATE product SET product_name=?, product_price=?, discount_rate=?, product_img=?, product_update=NOW(), cate_id=? WHERE product_id=?";
}