package com.example.template.controller;

import com.example.template.dao.InventoryDao;
import com.example.template.model.db.master.Inventory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController extends AbstractController{
    @GetMapping(value = "/list")
    public List<Inventory> listInventory(HttpSession httpSession){
        InventoryDao dao =  new InventoryDao(masterSessionFactory);
        return dao.getAll();
    }
    @PostMapping(value = "/register")
    public void registerInventory(HttpSession httpSession, Inventory inventory)  {
        InventoryDao dao =  new InventoryDao(masterSessionFactory);
        dao.insertUpdateTransactional(inventory);
    }
    @GetMapping(value = "/list/{id}")
    public Inventory getById(HttpSession httpSession, @PathVariable int id){
        InventoryDao dao =  new InventoryDao(masterSessionFactory);
        return dao.get(id);
    }
    @RequestMapping(value = "/delete",  method = RequestMethod.DELETE)
    public void deleteInventory(HttpSession httpSession, Inventory inventory)  {
        InventoryDao dao =  new InventoryDao(masterSessionFactory);
        dao.deleteTransactional(inventory);
    }
    
}
