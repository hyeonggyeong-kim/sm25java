package edu.sm.service;

import edu.sm.dto.Product;
import edu.sm.frame.ConnectionPool;
import edu.sm.frame.SmService;
import edu.sm.repository.ProductRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProductService implements SmService<Product, Integer> {

    ProductRepository productRepository;
    ConnectionPool connectionPool;

    public ProductService() {
        this.productRepository = new ProductRepository();
        try {
            connectionPool = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void register(Product product) throws Exception {
        Connection conn = connectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            productRepository.insert(product, conn);
            conn.commit();
        } catch(Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if (conn != null) {
                connectionPool.releaseConnection(conn);
            }
        }
    }

    @Override
    public void modify(Product product) throws Exception {
        Connection conn = connectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            productRepository.update(product, conn);
            conn.commit();
        } catch(Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if (conn != null) {
                connectionPool.releaseConnection(conn);
            }
        }
    }

    @Override
    public void remove(Integer productId) throws Exception {
        Connection conn = connectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            productRepository.delete(productId, conn);
            conn.commit();
        } catch(Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if (conn != null) {
                connectionPool.releaseConnection(conn);
            }
        }
    }

    @Override
    public List<Product> get() throws Exception {
        List<Product> list = null;
        Connection conn = connectionPool.getConnection();
        try {
            list = productRepository.selectAll(conn);
        } catch(Exception e) {
            throw e;
        } finally {
            if (conn != null) {
                connectionPool.releaseConnection(conn);
            }
        }
        return list;
    }

    @Override
    public Product get(Integer productId) throws Exception {
        Product product = null;
        Connection conn = connectionPool.getConnection();
        try {
            product = productRepository.select(productId, conn);
        } catch(Exception e) {
            throw e;
        } finally {
            if (conn != null) {
                connectionPool.releaseConnection(conn);
            }
        }
        return product;
    }
}
