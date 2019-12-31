package com.mvc.dao;

import static common.JDBCTemplate.*;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mvc.vo.Vo_Cart;
import com.mvc.vo.Vo_Category_Detail;
import com.mvc.vo.Vo_Prod_option;
import com.mvc.vo.Vo_Product;
import com.mvc.vo.Vo_Wish;

public class ProductDaoImp implements ProductDao {

	@Override
	public List<Vo_Product> P_selectAll() {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Vo_Product> plist = new ArrayList<Vo_Product>();

//		1. PRODUCT 쿼리 실행문장 (위에서 옵션 리스트를 마지막 인덱스값에 넣어주기)

		try {

			String sql2 = "SELECT * FROM PRODUCT ORDER BY PROD_NO DESC";

			pstm = con.prepareStatement(sql2);
			rs = pstm.executeQuery();

			while (rs.next()) {

				Vo_Product tmp = new Vo_Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getString(10),
						rs.getDouble(11), rs.getDate(12), rs.getString(13), rs.getString(14));

				plist.add(tmp);
				System.out.println("plist 값 : " + plist);

			}
		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
			close(rs, pstm, con);
		}

		return plist;
	}

	@Override
	public List<Vo_Prod_option> option_selectAll() {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Vo_Prod_option> polist = new ArrayList<Vo_Prod_option>();

		String sql = "SELECT * FROM PROD_OPTION";

		try {
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();

			System.out.println("옵션 query 실행 : " + sql);

			while (rs.next()) {
				Vo_Prod_option opt = new Vo_Prod_option(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getInt(5));

				polist.add(opt);

				System.out.println("상품 옵션 리스트 값 : " + polist);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs, pstm, con);
		}

		return polist;
	}

	@Override
	public List<Vo_Product> BC_selectAll() {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Vo_Product> bclist = new ArrayList<Vo_Product>();

//		1. PRODUCT 쿼리 실행문장 (위에서 옵션 리스트를 마지막 인덱스값에 넣어주기)

		try {

			String sql = "SELECT * FROM PRODUCT WHERE CATD_NO = 6 ORDER BY PROD_NO DESC";

			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				Vo_Product tmp = new Vo_Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getString(10),
						rs.getDouble(11), rs.getDate(12), rs.getString(13), rs.getString(14));

				bclist.add(tmp);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(rs, pstm, con);
		}

		return bclist;
	}

	@Override
	public List<Vo_Product> Clo_selectAll() {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Vo_Product> clolist = new ArrayList<Vo_Product>();

//		1. PRODUCT 쿼리 실행문장 (위에서 옵션 리스트를 마지막 인덱스값에 넣어주기)

		try {

			String sql = "SELECT * FROM PRODUCT WHERE PROD_NO IN(161, 162, 202, 210, 213, 216, 218, 221, 222)";

			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				Vo_Product tmp = new Vo_Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getString(10),
						rs.getDouble(11), rs.getDate(12), rs.getString(13), rs.getString(14));

				clolist.add(tmp);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(rs, pstm, con);
		}

		return clolist;
	}

	@Override
	public List<Vo_Product> Outer_selectAll() {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Vo_Product> outlist = new ArrayList<Vo_Product>();

//		1. PRODUCT 쿼리 실행문장 (위에서 옵션 리스트를 마지막 인덱스값에 넣어주기)

		try {

			String sql = "SELECT * FROM PRODUCT WHERE PROD_NO IN(161,162,163,164) ORDER BY PROD_NO DESC";

			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				Vo_Product tmp = new Vo_Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getString(10),
						rs.getDouble(11), rs.getDate(12), rs.getString(13), rs.getString(14));

				outlist.add(tmp);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			close(rs, pstm, con);
		}

		return outlist;
	}

	@Override
	public List<Vo_Product> Top_selectAll() {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Vo_Product> toplist = new ArrayList<Vo_Product>();

//		1. PRODUCT 쿼리 실행문장 (위에서 옵션 리스트를 마지막 인덱스값에 넣어주기)

		try {

			String sql = "SELECT * FROM PRODUCT WHERE CATD_NO = 8 ORDER BY PROD_NO DESC";

			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				Vo_Product tmp = new Vo_Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getString(10),
						rs.getDouble(11), rs.getDate(12), rs.getString(13), rs.getString(14));

				toplist.add(tmp);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			close(rs, pstm, con);
		}

		return toplist;
	}

	@Override
	public List<Vo_Product> Bottom_selectAll() {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Vo_Product> bottlist = new ArrayList<Vo_Product>();

//		1. PRODUCT 쿼리 실행문장 (위에서 옵션 리스트를 마지막 인덱스값에 넣어주기)

		try {

			String sql = "SELECT * FROM PRODUCT WHERE CATD_NO = 9 ORDER BY PROD_NO DESC";

			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				Vo_Product tmp = new Vo_Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getString(10),
						rs.getDouble(11), rs.getDate(12), rs.getString(13), rs.getString(14));

				bottlist.add(tmp);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			close(rs, pstm, con);
		}

		return bottlist;
	}

	@Override
	public List<Vo_Product> Wallet_selectAll() {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Vo_Product> walist = new ArrayList<Vo_Product>();

//		1. PRODUCT 쿼리 실행문장 (위에서 옵션 리스트를 마지막 인덱스값에 넣어주기)

		try {

			String sql = "SELECT * FROM PRODUCT WHERE CATD_NO = 10 ORDER BY PROD_NO DESC";

			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				Vo_Product tmp = new Vo_Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getString(10),
						rs.getDouble(11), rs.getDate(12), rs.getString(13), rs.getString(14));

				walist.add(tmp);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			close(rs, pstm, con);
		}

		return walist;
	}

	@Override
	public List<Vo_Product> Life_selectAll() {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Vo_Product> lifelist = new ArrayList<Vo_Product>();

//		1. PRODUCT 쿼리 실행문장 (위에서 옵션 리스트를 마지막 인덱스값에 넣어주기)

		try {

			String sql = "SELECT * FROM PRODUCT WHERE PROD_NO IN(228,229,230,231,232,246,247,248,249) ORDER BY PROD_NO DESC";

			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				Vo_Product tmp = new Vo_Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getString(10),
						rs.getDouble(11), rs.getDate(12), rs.getString(13), rs.getString(14));

				lifelist.add(tmp);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			close(rs, pstm, con);
		}

		return lifelist;
	}

	@Override
	public List<Vo_Product> Supply_selectAll() {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Vo_Product> supplylist = new ArrayList<Vo_Product>();

//		1. PRODUCT 쿼리 실행문장 

		try {

			String sql = "SELECT * FROM PRODUCT WHERE PROD_NO BETWEEN 228 AND 236 ORDER BY PROD_NO DESC";

			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				Vo_Product tmp = new Vo_Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getString(10),
						rs.getDouble(11), rs.getDate(12), rs.getString(13), rs.getString(14));

				supplylist.add(tmp);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally { // 마지막 catch문에 close

			close(rs, pstm, con);
		}

		return supplylist;
	}

	@Override
	public List<Vo_Product> Home_selectAll() {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Vo_Product> homelist = new ArrayList<Vo_Product>();

//		1. PRODUCT 쿼리 실행문장 

		try {

			String sql = "SELECT * FROM PRODUCT WHERE PROD_NO BETWEEN 246 AND 254 ORDER BY PROD_NO DESC";

			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				Vo_Product tmp = new Vo_Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getString(10),
						rs.getDouble(11), rs.getDate(12), rs.getString(13), rs.getString(14));

				homelist.add(tmp);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally { // 마지막 catch문에 close

			close(rs, pstm, con);
		}

		return homelist;
	}

	@Override
	public Vo_Product P_selectOne(int pseq) {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Vo_Product pvo = new Vo_Product();

		try {

			String sql = "SELECT * FROM PRODUCT P JOIN CATEGORY_DETAIL CD ON (P.CATD_NO = CD.CATD_NO)\r\n"
					+ "WHERE PROD_NO = ?";

			pstm = con.prepareStatement(sql);
			pstm.setInt(1, pseq);
			rs = pstm.executeQuery();
			System.out.println("product query 실행 : " + sql);

			while (rs.next()) {
				pvo = new Vo_Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getString(10),
						rs.getDouble(11), rs.getDate(12), rs.getString(13), rs.getString(14));

				System.out.println("pvo 값: " + pvo);

				/* System.out.println(pvo.getPlist().get(pseq)); */
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			close(rs, pstm, con);

		}

		return pvo;
	}

	@Override
	public Vo_Category_Detail CD_selectOne(Vo_Product pvo) {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;

		Vo_Category_Detail cdvo = new Vo_Category_Detail();

		String sql = "SELECT * FROM CATEGORY_DETAIL WHERE CATD_NO = ?";

		try {

			pstm = con.prepareStatement(sql);
			pstm.setInt(1, pvo.getProd_catd());
			rs = pstm.executeQuery();

			while (rs.next()) {
				cdvo = new Vo_Category_Detail(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5));

				System.out.println("카테고리 디테일 값 : " + cdvo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			close(rs, pstm, con);
		}

		return cdvo;
	}

	@Override
	public ArrayList<Vo_Prod_option> po_selectOne(Vo_Product pvo) {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<Vo_Prod_option> povo = new ArrayList<Vo_Prod_option>();

		String sql = "SELECT * FROM PROD_OPTION WHERE PROD_NO = ?";

		try {

			pstm = con.prepareStatement(sql);
			pstm.setInt(1, pvo.getProd_no());
			rs = pstm.executeQuery();

			System.out.println("옵션 query 실행 값 : " + sql);

			while (rs.next()) {
				Vo_Prod_option tmp = new Vo_Prod_option(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getInt(5));

				povo.add(tmp);
				System.out.println("상품 옵션 값: " + povo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return povo;
	}

	@Override
	public boolean P_insert(Vo_Product pvo) {

		/*
		 * Connection con = getConnection(); PreparedStatement pstm = null; int res = 0;
		 * 
		 * String sql = "INSERT INTO PRODUCT VALUES()";
		 */

		return false;
	}

	@Override
	public boolean O_insert(Vo_Prod_option povo, Vo_Product prod) {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;

		String sql = "INSERT INTO PROD_ORDER VALUES(ORDER_NUM.NEXTVAL, ?, ?, ?, ORDER_TNO.NEXTVAL, ?)";

		try {

			pstm = con.prepareStatement(sql);
			pstm.setInt(1, povo.getProd_id());
			pstm.setInt(2, povo.getProd_stock());
			pstm.setInt(3, prod.getProd_price());
			pstm.setString(4, "입금 전");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean P_insert(Vo_Cart cvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean P_insert(Vo_Wish wvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean P_update(Vo_Product pvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean P_delete(int aseq) {
		// TODO Auto-generated method stub
		return false;
	}

}