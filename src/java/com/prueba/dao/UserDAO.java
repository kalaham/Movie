package com.prueba.dao;

import com.prueba.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends DAO {

    public void register(User user) throws Exception {

        try {
            this.conectar();
            String name = user.getName();
            String email = user.getEmail();
            String pass = user.getPassword();
            System.err.println("user --->" + name + email + pass);

            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO public.\"user\"(name, email, password) values(?,?,?)");
            st.setString(1, user.getName());
            st.setString(2, user.getEmail());
            st.setString(3, user.getPassword());
            st.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    public List<User> listar() throws Exception {
        List<User> lista;
        ResultSet rs;
        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareStatement("SELECT user_id, name, email, password FROM public.\"user\" ");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                User user = new User();
                user.setUser_id(rs.getInt("user_id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                lista.add(user);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return lista;
    }

    public User leerID(User user) throws Exception {
        User us = null;
        ResultSet rs;
        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareStatement("SELECT user_id, name, email, password FROM public.\"user\" WHERE user_id = ? ");
            st.setInt(1, user.getUser_id());
            rs = st.executeQuery();

            while (rs.next()) {
                us = new User();
                us.setUser_id(rs.getInt("user_id"));
                us.setName(rs.getString("name"));
                us.setEmail(rs.getString("email"));
                us.setPassword(rs.getString("password"));
                
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return us;
    }
}
