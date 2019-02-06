/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Eventi;
import java.util.List;

/**
 *
 * @author hp
 */
public class EventiRepository extends EntityManagerClasses implements EventiInterface{

   @Override
    public void create(Eventi e) {
          em.getTransaction().begin();
      em.persist(e);
      em.getTransaction().commit();
    }

    @Override
    public void edit(Eventi e) {
         em.getTransaction().begin();
      em.merge(e);
      em.getTransaction().commit();
    }

    @Override
    public void remove(Eventi e) {
        em.getTransaction().begin();
      em.remove(e);
      em.getTransaction().commit();
    }

  @Override
    public List<Eventi> findAll() {
        return (List<Eventi>)em.createNamedQuery("Eventi.findAll").getResultList();
    }

    @Override
    public Eventi findByID(Integer Eventi_ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
