/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Drejtimi;
import BLL.Librat;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author hp
 */
public class LibratRepository extends EntityManagerClasses implements LibratInterface{
    
    @Override
    public void create(Librat l) {
          em.getTransaction().begin();
      em.persist(l);
      em.getTransaction().commit();
    }

    @Override
    public void edit(Librat l) {
         em.getTransaction().begin();
      em.merge(l);
      em.getTransaction().commit();
    }

    @Override
    public void remove(Librat l) {
        em.getTransaction().begin();
      em.remove(l);
      em.getTransaction().commit();
    }

    @Override
    public List<Librat> findAll() {
        return (List<Librat>)em.createNamedQuery("Librat.findAll").getResultList();
    }
    
      public List<BLL.Librat> find(String pattern) {
        if (pattern != null) {
            TypedQuery<Librat> query
                    = em.createQuery("SELECT s from Librat s where s.emri LIKE :pattern ", Librat.class);
            query.setParameter("pattern", pattern + "%");
            if (query.getResultList() != null) {
                return query.getResultList();
            }
        }
        return null;
    }

    @Override
    public Librat findByID(Integer Librat_ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
