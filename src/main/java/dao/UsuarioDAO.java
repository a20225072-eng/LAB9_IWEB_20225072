package dao;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class UsuarioDAO {
    public boolean existeEmail(String email) throws SQLException{
        String sql="SELECT id_usuario FROM usuario WHERE email= ?";
        try(Connection conn= getConnection();
        PreparedStatement pstm=conn.prepareStatement(sql)){
            pstm.setString(1,email);
            try(ResultSet rs= pstm.executeQuery()){
                if(rs.next){
                    return true;
                }
            }
        }
    }
}
