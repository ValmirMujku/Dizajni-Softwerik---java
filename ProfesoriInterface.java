/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Profesori;
import Exceptions.DizajniExceptions;
import java.util.List;

/**
 *
 * @author hp
 */
public interface ProfesoriInterface {
    
    void create(Profesori d)throws DizajniExceptions;

    void edit(Profesori d)throws DizajniExceptions;

    void remove(Profesori d)throws DizajniExceptions;

    List<Profesori> findAll()throws DizajniExceptions;

    Profesori findByID(Integer Profesori_ID)throws DizajniExceptions;
}
