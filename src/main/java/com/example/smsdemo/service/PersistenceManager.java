package com.example.smsdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {
    private static final Logger logger = LoggerFactory.getLogger(PersistenceManager.class);
    private static EntityManagerFactory entityManagerFactory;
    private static ThreadLocal<EntityManager> threadLocal;

    static {
        try {
            threadLocal = new ThreadLocal<>();
            entityManagerFactory = Persistence.createEntityManagerFactory("sms");
        } catch (Exception ex) {
            logger.error("Exception while instantiating PersistenceManager", ex);
        }
    }

    public static EntityManager getEntityManager() {
        EntityManager entityManager = threadLocal.get();
        if (entityManager == null) {
            try {
                logger.debug("Creating EntityManager on getEntityManager");
                if (entityManagerFactory.isOpen()) {
                    entityManager = entityManagerFactory.createEntityManager();
                    threadLocal.set(entityManager);
                    logger.debug("EntityManager created");
                } else {
                    throw new IllegalStateException("EntityManagerFactory is not open?!");
                }
            } catch (Exception ex) {
                logger.error(ex.getMessage());
            }
        }

        return entityManager;
    }

    public static void closeEntityManager() {
        if (threadLocal != null) {
            EntityManager entityManager = threadLocal.get();

            if (entityManager != null) {
                logger.debug("Closing EntityManager on closeEntityManager");
                entityManager.close();
                threadLocal.remove();
                threadLocal.set(null);
            }
        }
    }

    public static void closeEntityManagerFactory() {
        if (entityManagerFactory != null) {
            logger.debug("Closing EntityManagerFactory on closeEntityManagerFactory");
            entityManagerFactory.close();
        }
    }
}
