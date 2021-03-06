package es.upm.miw.webpattern.dao.daos;

import es.upm.miw.webpattern.dao.entities.User;

import java.util.List;

public interface UserDao extends GenericDao<User, String> {

    List<User> findByName(String name);
}
