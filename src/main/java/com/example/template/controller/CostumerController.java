package com.example.template.controller;

import com.example.template.dao.CostumerDao;
import com.example.template.dao.InventoryDao;
import com.example.template.model.db.master.Costumer;
import com.example.template.model.db.master.Inventory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/costumer")
public class CostumerController extends AbstractController {
    @GetMapping(value = "/list")
    public List<Costumer> listCostumer(HttpSession httpSession){
        CostumerDao dao =  new CostumerDao(masterSessionFactory);
        return dao.getAll();
    }
    @PostMapping(value = "/register")
    public void registerCostumer(HttpSession httpSession, Costumer costumer)  {
       CostumerDao dao =  new CostumerDao(masterSessionFactory);
        dao.insertUpdateTransactional(costumer);
    }
    @RequestMapping(value = "/delete",  method = RequestMethod.DELETE)
    public void deleteCostumer(HttpSession httpSession, Costumer costumer)  {
        CostumerDao dao =  new CostumerDao(masterSessionFactory);
        dao.deleteTransactional(costumer);
    }
}
