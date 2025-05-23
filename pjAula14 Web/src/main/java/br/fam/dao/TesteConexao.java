package br.fam.dao;

import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) {
		try {
			ConnectionFactory.getConnection();
			System.out.println("Conectado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
