/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Revistat;
import java.util.List;

/**
 *
 * @author hp
 */
public class RevistatRepository extends EntityManagerClasses implements RevistatInterface{

 @Override
    public void create(Revistat d) {
          em.getTransaction().begin();
      em.persist(d);
      em.getTransaction().commit();
    }

    @Override
    public void edit(Revistat d) {
         em.getTransaction().begin();
      em.merge(d);
      em.getTransaction().commit();
    }

    @Override
    public void remove(Revistat d) {
        em.getTransaction().begin();
      em.remove(d);
      em.getTransaction().commit();
    }

    @Override
    public List<Revistat> findAll() {
        return (List<Revistat>)em.createNamedQuery("Revistat.findAll").getResultList();
    }

    @Override
    public Revistat findByID(Integer Revistat_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
