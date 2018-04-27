package com.sbd.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CassandraRepository {

    @Autowired
    private CassandraOperations cassandraRepo;

    public <T> void create(T entity) {
        cassandraRepo.insert(entity);
    }

    public <T> void createList(List<T> entities) {
        cassandraRepo.insert(entities);
    }

    public <T> void update(T entity) {
        cassandraRepo.update(entity);
    }

    public <T> void updateList(List<T> entities) { cassandraRepo.update(entities);   }

    public <T> void update(T entity, Class<T> claz) {
        cassandraRepo.update(entity);
    }

    public <T> T findById(Object id, Class<T> claz) {
        return cassandraRepo.selectOneById(id, claz);
    }

    public <T> void deleteById(Object id, Class<T> claz) { cassandraRepo.deleteById(id, claz);  }

    public void delete(Object entity) {
        cassandraRepo.delete(entity);
    }

    public <T> void delete(List<T> entities) {
        cassandraRepo.delete(entities);
    }

    public <T> void deleteAll(Class<T> claz) {
        cassandraRepo.truncate(claz);
    }

    public <T> List<T> findAll(Class<T> claz, String tableName) {return (List<T>) cassandraRepo.select("SELECT * FROM " + tableName, claz);  }

    public <T> long getCount(Class<T> claz) {
        return cassandraRepo.count(claz);
    }

    public <T> boolean exists(Object id, Class<T> claz) {
        return cassandraRepo.exists(id, claz);
    }
}
