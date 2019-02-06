/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Pagesa;
import java.util.List;

/**
 *
 * @author hp
 */
public class PagesaRepository extends EntityManagerClasses implements PagesatInterface{

     @Override
    public void create(Pagesa d) {
          em.getTransaction().begin();
      em.persist(d);
      em.getTransaction().commit();
    }

    @Override
    public void edit(Pagesa d) {
         em.getTransaction().begin();
      em.merge(d);
      em.getTransaction().commit();
    }

    @Override
    public void remove(Pagesa d) {
        em.getTransaction().begin();
      em.remove(d);
      em.getTransaction().commit();
    }

    @Override
    public List<Pagesa> findAll() {
        return (List<Pagesa>)em.createNamedQuery("Pagesa.findAll").getResultList();
    }

    @Override
    public Pagesa findByID(Integer pagesa_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
