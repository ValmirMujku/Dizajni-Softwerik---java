/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Librat;
import Exceptions.DizajniExceptions;
import java.util.List;

/**
 *
 * @author hp
 */
public interface LibratInterface {
     void create(Librat l)throws DizajniExceptions;

    void edit(Librat l)throws DizajniExceptions;

    void remove(Librat l)throws DizajniExceptions;

    List<Librat> findAll()throws DizajniExceptions;

    Librat findByID(Integer Librat_ID)throws DizajniExceptions;
}
