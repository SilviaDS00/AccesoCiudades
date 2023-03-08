/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexiones.Conexion;
import entidades.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DaoCiudad {

    public ArrayList<Ciudad> listadoCiudades() throws SQLException, Exception {
        ArrayList<Ciudad> listadoCiudades = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = (Connection) conexion.getDataSource();
            st = con.createStatement();
            String ordenSQL = "select * from city order by id";
            rs = st.executeQuery(ordenSQL);
            while (rs.next()) {
                Ciudad c = new Ciudad();
                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                c.setCountrycode(rs.getString("countrycode"));
                c.setPopulation(rs.getInt("population"));
                c.setDistrict(rs.getString("district"));
                listadoCiudades.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return listadoCiudades;
    }

    public ArrayList<Ciudad> buscarCiudadPorNombre(String nombre) throws SQLException, Exception {
        ArrayList<Ciudad> listadoCiudades = new ArrayList<Ciudad>();
        Conexion conexion = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            con = (Connection) conexion.getDataSource();
            String ordenSQL = "select * from city where name like ?";
            ps = con.prepareStatement(ordenSQL);
            ps.setString(1, "%" + nombre + "%");
            if (!ps.execute()) {
                System.out.println("No se ha podido realizar la consulta");
            }

            rs = ps.getResultSet();
            while (rs.next()) {
                Ciudad c = new Ciudad(rs.getInt("id"), rs.getString("name"), rs.getString("countrycode"), rs.getString("district"), rs.getInt("population"));
                listadoCiudades.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return listadoCiudades;
    }


}
