package com.nox.database;

import com.nox.database.entity.Book;
import com.nox.database.entity.Houserule;
import com.nox.database.entity.Player;
import com.nox.database.entity.Tabletop;
import com.nox.database.entity.Character;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateSessionFactoryUtil {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    private HibernateSessionFactoryUtil() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();

                configuration.addAnnotatedClass(Tabletop.class);
                configuration.addAnnotatedClass(Book.class);
                configuration.addAnnotatedClass(Player.class);
                configuration.addAnnotatedClass(Character.class);
                configuration.addAnnotatedClass(Houserule.class);

                serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            } catch (Exception e) {
               e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
