package com.example.template.dao;

import com.example.template.model.db.RefObject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AbstractDao<T extends RefObject> {

    Class<T> tClass;
    SessionFactory sessionFactory;

    public AbstractDao(Class aClass, SessionFactory sessionFactory){
        this.tClass = aClass;
        this.sessionFactory = sessionFactory;
    }

    public ArrayList<T> getAll(){
        ArrayList<T> arrayList = null;
        try(Session session = sessionFactory.openSession()){
            List<T> list = session.createQuery("FROM " + tClass.getSimpleName(), tClass).getResultList();
            arrayList = new ArrayList<>(list);
        }
        return arrayList;
    }

    public ArrayList<T> getWhere(String query){
        ArrayList<T> arrayList = null;
        try(Session session = sessionFactory.openSession()){
            List<T> list = session.createQuery("FROM " + tClass.getSimpleName() + " WHERE " + query, tClass).getResultList();
            arrayList = new ArrayList<>(list);
        }
        return arrayList;
    }

    public T getWhereSingle(String query){
        ArrayList<T> arrayList = null;
        try(Session session = sessionFactory.openSession()){
            List<T> list = session.createQuery("FROM " + tClass.getSimpleName() + " WHERE " + query, tClass).getResultList();
            arrayList = new ArrayList<>(list);
        }
        if(arrayList.size() > 0){
            return arrayList.get(0);
        }
        return null;
    }

    public void insertUpdate(T record, Session session){
        session.saveOrUpdate(record);
    }

    public void insertUpdate(T record){
        try(Session session = sessionFactory.openSession()){
            insertUpdate(record,session);
        }
    }

    public void insertUpdateTransactional(T record){
        try(Session session = sessionFactory.openSession()){
            Transaction tr = session.beginTransaction();
            insertUpdate(record,session);
            tr.commit();
        }
    }

    public void insert(T record, Session session){
        session.save(record);
    }

    public void insert(T record){
        try(Session session = sessionFactory.openSession()){
            insert(record,session);
        }
    }

    public void insertTransactional(T record){
        try(Session session = sessionFactory.openSession()){
            Transaction tr = session.beginTransaction();
            insert(record,session);
            tr.commit();
        }
    }

    public void update(T record, Session session){
        session.update(record);
    }

    public void update(T record){
        try(Session session = sessionFactory.openSession()){
            update(record,session);
        }
    }

    public void updateTransactional(T record){
        try(Session session = sessionFactory.openSession()){
            Transaction tr = session.beginTransaction();
            update(record,session);
            tr.commit();
        }
    }

    public T get(int ref){
        T record = null;
        try(Session session = sessionFactory.openSession()){
            record = get(ref,session);
        }
        return record;
    }

    public T get(int ref, Session session){
        T record = null;
        record = session.get(tClass,ref);
        return record;
    }

    public void delete(T record, Session session){
            session.delete(record);
    }

    public void delete(T record){
        try(Session session = sessionFactory.openSession()){
            delete(record,session);
        }
    }

    public void deleteTransactional(T record){
        try(Session session = sessionFactory.openSession()){
            Transaction tr = session.beginTransaction();
            delete(record,session);
            tr.commit();
        }
    }
}
