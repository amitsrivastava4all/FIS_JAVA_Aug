package com.fis.dao;

public interface DAOConstants {
String PRODUCT_SQL = "select id, name,descr,price,type from product_mst where type=?";
}
