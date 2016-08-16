package com.fis.login.dao;

public interface CommonDAOConstants {
String USER_LOGIN_SQL="select userid,password from user_mst where userid=? and password=?";
String USER_REGISTER_SQL = "insert into user_mst (userid,password) values(?,?)";
}
