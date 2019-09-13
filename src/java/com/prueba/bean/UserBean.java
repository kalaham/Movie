package com.prueba.bean;

import com.prueba.dao.UserDAO;
import com.prueba.model.User;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class UserBean {

    private User user = new User();
    private List<User> lstUser;

    public List<User> getLstUser() {
        return lstUser;
    }

    public void setLstUser(List<User> lstUser) {
        this.lstUser = lstUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void register() throws Exception {
        UserDAO dao;
        try {
            dao = new UserDAO();
            dao.register(user);
        } catch (Exception e) {
            throw e;
        }
    }

    public void listar() throws Exception {
        UserDAO dao;
        try {
            dao = new UserDAO();
            lstUser = dao.listar();
        } catch (Exception e) {
            throw e;
        }
    }

    public void leerID(User user) throws Exception {

        UserDAO dao;
        User temp;
        try {
            dao = new UserDAO();
            temp = dao.leerID(user);
            
            if (temp != null) {
                this.user = temp;
            }
        } catch (Exception e) {
            throw e;
        }

    }

}
