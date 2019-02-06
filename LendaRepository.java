/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Lenda;
import BLL.Librat;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author hp
 */
public class LendaRepository extends EntityManagerClasses implements LendaInterface{

    @Override
    public void create(Lenda l) {
          em.getTransaction().begin();
      em.persist(l);
      em.getTransaction().commit();
    }

    @Override
    public void edit(Lenda l) {
         em.getTransaction().begin();
      em.merge(l);
      em.getTransaction().commit();
    }

    @Override
    public void remove(Lenda l) {
        em.getTransaction().begin();
      em.remove(l);
      em.getTransaction().commit();
    }

    @Override
    public List<Lenda> findAll() {
        return (List<Lenda>)em.createNamedQuery("Lenda.findAll").getResultList();
    }
    
        public List<BLL.Librat> find(String pattern) {
        if (pattern != null) {
            TypedQuery<Librat> query
                    = em.createQuery("SELECT l from Librat l where l.libratID.emri LIKE :pattern ", Librat.class);
            query.setParameter("pattern", pattern + "%");
            if (query.getResultList() != null) {
                return query.getResultList();
            }
        }
        return null;
    }

    @Override
    public Lenda findByID(Integer Lenda_ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
