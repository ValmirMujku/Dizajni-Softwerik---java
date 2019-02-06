/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Revistat;
import Exceptions.DizajniExceptions;
import java.util.List;

/**
 *
 * @author hp
 */
public interface RevistatInterface {
    
    void create(Revistat d)throws DizajniExceptions;

    void edit(Revistat d)throws DizajniExceptions;

    void remove(Revistat d)throws DizajniExceptions;

    List<Revistat> findAll()throws DizajniExceptions;

    Revistat findByID(Integer Revistat_id)throws DizajniExceptions;
}
