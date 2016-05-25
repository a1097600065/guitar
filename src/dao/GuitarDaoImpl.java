package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Guitar;
import jdbc.JDBC;

public class GuitarDaoImpl implements GuitarDao{

	@Override
	public void addGuitar(Guitar guitar) {
		String sql="insert into guitar(id,model,builder,type,wood) values(?,?,?,?,?)";
		JDBC jdbc=new JDBC();
		Connection conn=jdbc.getConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, guitar.getId());
			ps.setString(2,guitar.getModel());
			ps.setString(3, guitar.getBuilder());
			ps.setString(4, guitar.getType());
			ps.setString(5, guitar.getWood());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbc.closeConnection(conn);
		}
	}

	@Override
	public void delGuitar(int id) {
		// TODO Auto-generated method stub
		
		
		String sql="delete from guitar where id=?";
		JDBC jdbc=new JDBC();
		Connection conn=jdbc.getConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbc.closeConnection(conn);
		}
		
		
	}

	@Override
	public List<Guitar> search(String model) {
		// TODO Auto-generated method stub
		List<Guitar> list=new ArrayList<Guitar>();
		String sql="select * from guitar where model=?";
		JDBC jdbc=new JDBC();
		Connection conn=jdbc.getConnection();
		
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, model);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Guitar guitar=new Guitar();
				guitar.setId(rs.getInt(1));
				guitar.setModel(model);
				guitar.setBuilder(rs.getString(3));
				guitar.setType(rs.getString(4));
				guitar.setWood(rs.getString(5));
				list.add(guitar);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbc.closeConnection(conn);
		}
		return null;
	}


}
