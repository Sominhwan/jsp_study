package register;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterMgr {
   private DBConnectionMgr pool;
   public RegisterMgr() {
      pool = DBConnectionMgr.getInstance();
   }
   

   //회원가입
   public void insertMember(RegisterBean bean) {
         Connection con = null;
         PreparedStatement pstmt = null;
         String sql = null;
         boolean flag = false;
         try {
            con = pool.getConnection();
            sql = "insert tblregister(id,pwd,name,profile)"
                  + "values(?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, bean.getId());
            pstmt.setString(2, bean.getPwd());
            pstmt.setString(3, bean.getName());
            pstmt.setString(4, bean.getProfile()); 
            pstmt.executeUpdate();// SQL로 실행
         } catch (Exception e) {
            e.printStackTrace();
         } finally {
            pool.freeConnection(con, pstmt);
         }
      }
   
}