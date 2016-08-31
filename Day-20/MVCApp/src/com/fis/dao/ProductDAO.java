package com.fis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fis.dto.ProductDTO;

public class ProductDAO {
	
	public ArrayList<ProductDTO> getProducts(ProductDTO productDTO) throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ProductDTO> productList = new ArrayList<>();
		try
		{
			con= CommonDAO.getObject().getConnection();
			pstmt = con.prepareStatement(DAOConstants.PRODUCT_SQL);
			pstmt.setString(1,productDTO.getType());
			rs = pstmt.executeQuery();
			while(rs.next()){
				ProductDTO productObject = new ProductDTO();
				productObject.setId(rs.getInt("id"));
				productObject.setName(rs.getString("name"));
				productObject.setDesc(rs.getString("descr"));
				productObject.setPrice(rs.getInt("price"));
				productObject.setType(rs.getString("type"));
				productList.add(productObject);
			}
		}
		finally{
			if(rs!=null){
				rs.close();
			}
			if(pstmt!=null){
				pstmt.close();
			}
			if(con!=null){
				con.close();
			}
		}
		return productList;
	}

}
