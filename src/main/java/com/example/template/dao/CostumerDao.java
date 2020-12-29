package com.example.template.dao;

import com.example.template.model.db.master.Costumer;
import org.hibernate.SessionFactory;

public class CostumerDao extends AbstractDao<Costumer> {
    public CostumerDao(SessionFactory sessionFactory) {
        super(Costumer.class, sessionFactory);
    }
}
