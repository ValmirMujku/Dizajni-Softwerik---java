/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Profesori;
import java.util.List;

/**
 *
 * @author hp
 */
public class ProfesoriRepository extends EntityManagerClasses implements ProfesoriInterface{

  @Override
    public void create(Profesori d) {
          em.getTransaction().begin();
      em.persist(d);
      em.getTransaction().commit();
    }

    @Override
    public void edit(Profesori d) {
         em.getTransaction().begin();
      em.merge(d);
      em.getTransaction().commit();
    }

    @Override
    public void remove(Profesori d) {
        em.getTransaction().begin();
      em.remove(d);
      em.getTransaction().commit();
    }

    @Override
    public List<Profesori> findAll() {
        return (List<Profesori>)em.createNamedQuery("Profesori.findAll").getResultList();
    }

    @Override
    public Profesori findByID(Integer Profesori_ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
