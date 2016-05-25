package dao;

import java.sql.*;
import java.util.List;

import beans.Guitar;
import jdbc.JDBC;

public interface GuitarDao {
	
	public void addGuitar(Guitar guitar);
	public void delGuitar(int id);
	public List<Guitar> search(String model);

	}
	

