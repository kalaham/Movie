
package com.prueba.dao;

import com.prueba.model.Movie;
import java.sql.PreparedStatement;

public class movieDAO extends DAO{
    
    public void register(Movie movie) throws Exception {

        try {
            this.conectar();
//            String name = movie.getName();
//            String email = user.getEmail();
//            String pass = user.getPassword();
//            System.err.println("user --->" + name + email + pass);

            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO public.\"mivie\"(url) values(?)");
            st.setString(1, movie.getUrl());
   
            st.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    
}
