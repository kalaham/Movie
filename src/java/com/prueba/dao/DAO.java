package com.prueba.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

    private Connection cn;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public void conectar() throws Exception {

        try {
            Class.forName("org.postgresql.Driver");
            cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbfinal?user=postgres&password=jmr931030");
        } catch (Exception e) {
            throw e;
        }
    }

    public void cerrar() throws Exception {

        try {
            if (cn != null) {
                if (cn.isClosed() == false) {
                    cn.close();
                }
            }
        } catch (Exception e) {
            throw  e;
        }

    }

}
//jdbc:postgresql://localhost:5432/dbfinal [postgres on Default schema
