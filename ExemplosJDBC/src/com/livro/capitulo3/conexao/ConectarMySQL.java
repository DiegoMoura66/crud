package com.livro.capitulo3.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarMySQL {
	
	public static void main(String[]args){
		
		Connection conexao = null;
		try{
			//Registando a classe JDBC no sistema em tempo de execução
			String url = "jdbc:mysql://localhost:3307/agenda";
			String usuario = "root";
			String senha = "12345";
			
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conectou");
			
		}catch(SQLException e){
			System.out.println("Ocorreu um erro de SQl. Erro "+ e.getMessage());
			
		}finally{
			try{
				conexao.close();
				
			}catch(SQLException e ){
				System.out.println("Errp ap fechara conexao. Erro: " +e.getMessage());
				
			}
		}
	}

}
