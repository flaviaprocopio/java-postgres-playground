package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.example.model.Estado;

public class EstadoDAO {
    private Connection conn;

    public EstadoDAO(Connection conn) {
        this.conn = conn;
    }

    public List <Estado> listar() throws SQLException {
        var lista = new LinkedList<Estado>();
        var statement = conn.createStatement();
        var result = statement.executeQuery("select * from estado");
        while(result.next()){
            var estado = new Estado();
            estado.setId(result.getLong("id"));
            estado.setNome(result.getString("nome"));
            estado.setUf(result.getString("uf"));            
        } 
        
        return lista;
    }

    public void localizar(String uf) {
        try {
            //var sql = "Select * from estado where UF = '" + uf + "'"; //Suscetível a SQL injection
            var sql = "Select * from estado where UF = ?";
            var statement = conn.prepareStatement(sql);
                System.out.println(sql);
                //System.out.println(sql);
                statement.setString(1, uf);
            var result = statement.executeQuery();
            if(result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
            System.out.println();
        } catch (SQLException e) {
            System.err.println("Erro ao tentar executar consulta SQL: " + e.getMessage());
        }
    }

}
