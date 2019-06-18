package dao;

public class Dao {

 private DataSource ds;

    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }

    public Usuario findByNomeUsuario(String string) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ds.getConnection();
            ps = con.prepareStatement("select * from usuario where nome_usuario = ?");
            ps.setString(1, string);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Usuario usuario =  new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNomeUsuario(rs.getString("nome_usuario"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setNome(rs.getString("nome"));
                return usuario;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
