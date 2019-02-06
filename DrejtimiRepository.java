/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Drejtimi;
import java.util.List;

/**
 *
 * @author hp
 */
public class DrejtimiRepository extends EntityManagerClasses implements DrejtimiInterface{

    @Override
    public void create(Drejtimi d) {
          em.getTransaction().begin();
      em.persist(d);
      em.getTransaction().commit();
    }

    @Override
    public void edit(Drejtimi d) {
         em.getTransaction().begin();
      em.merge(d);
      em.getTransaction().commit();
    }

    @Override
    public void remove(Drejtimi d) {
        em.getTransaction().begin();
      em.remove(d);
      em.getTransaction().commit();
    }

    @Override
    public List<Drejtimi> findAll() {
        return (List<Drejtimi>)em.createNamedQuery("Drejtimi.findAll").getResultList();
    }

    @Override
    public Drejtimi findByID(Integer Drejtimi_ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

 
    
}
