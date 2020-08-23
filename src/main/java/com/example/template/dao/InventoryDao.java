package com.example.template.dao;

import com.example.template.model.db.master.Inventory;
import org.hibernate.SessionFactory;

public class InventoryDao extends AbstractDao<Inventory> {
    public InventoryDao(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}
