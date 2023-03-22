package guestbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class CommentMgr {
	
	   private DBConnectionMgr pool;
	   private final SimpleDateFormat SDF_DATE = new SimpleDateFormat("yyyy'년'  M'월' d'일' (E)");
	   private final SimpleDateFormat SDF_TIME = new SimpleDateFormat("H:mm:ss");

	   public CommentMgr() {
	      pool = DBConnectionMgr.getInstance();
	   }
	   
	   //Comment Insert
	   //insert tblComment(num,cid,comment,cip,cregDate)values(?,?,?,?,now())
	   public void insertComment(CommentBean bean) {
		   Connection con = null;
		   PreparedStatement pstmt = null;
		   String sql = null;
		   try {
			   con = pool.getConnection();
			   sql = "insert tblComment(num,cid,comment,cip,cregDate)values(?,?,?,?,now())";
			   pstmt = con.prepareStatement(sql);
			   pstmt.setInt(1, bean.getNum());
			   pstmt.setString(2, bean.getCid());
			   pstmt.setString(3, bean.getComment());
			   pstmt.setString(4, bean.getCip());
			   pstmt.executeUpdate();
		   } catch (Exception e) {
			   e.printStackTrace();
		   } finally {
			   pool.freeConnection(con, pstmt);
		   }
	   	}
	   
	   //Comment List
	   //select * from tblComment where num = ?
	   public Vector<CommentBean> listComment(int num) {
		   Connection con = null;
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   String sql = null;
		   Vector<CommentBean> vlist = new Vector<CommentBean>();
		   try {
			   con = pool.getConnection();
			   sql = "select * from tblComment where num = ?";
			   pstmt = con.prepareStatement(sql);
			   pstmt.setInt(1, num);
			   rs = pstmt.executeQuery();
			   // where 절 이하에 조건이 pk로 선언된 컬럼일때 if문으로 사용
			   while(rs.next()) {
				   CommentBean bean = new CommentBean();
				   bean.setCnum(rs.getInt("cnum"));
				   bean.setNum(rs.getInt("num"));
				   bean.setCid(rs.getString("cid"));
				   bean.setComment(rs.getString("comment"));
				   bean.setCip(rs.getString("cip"));
				   String tempTime = SDF_DATE.format(rs.getDate("cregDate"));
				   bean.setCregDate(tempTime);
				   //bean.setCregDate(SDF_DATE.format(rs.getDate("cregDate"))); 두번째 방법
				   vlist.addElement(bean);
			   }
		   } catch (Exception e) {
			   e.printStackTrace();
		   } finally {
			   pool.freeConnection(con, pstmt, rs);
		   }
		   return vlist;
	   }
	   
	   //Comment Delete
	   //delete from tblComment where cnum = ?
	   public void deleteComment(int cnum) {
		   Connection con = null;
		   PreparedStatement pstmt = null;
		   String sql = null;
		   try {
			   con = pool.getConnection();
			   sql = "delete from tblComment where cnum = ?";
			   pstmt = con.prepareStatement(sql);
			   pstmt.setInt(1, cnum);
			   pstmt.executeUpdate();
		   } catch (Exception e) {
			   e.printStackTrace();
		   } finally {
			   pool.freeConnection(con, pstmt);
		   }
	   }
	   
	   //Comment All Delete
	   //delete from tblComment where num = ?\
	   public void deleteAllComment(int num) {
		   Connection con = null;
		   PreparedStatement pstmt = null;
		   String sql = null;
		   try {
			   con = pool.getConnection();
			   sql = "delete from tblComment where num = ?";
			   pstmt = con.prepareStatement(sql);
			   pstmt.setInt(1, num);
			   pstmt.executeUpdate();
		   } catch (Exception e) {
			   e.printStackTrace();
		   } finally {
			   pool.freeConnection(con, pstmt);
		   }
	   }

}
