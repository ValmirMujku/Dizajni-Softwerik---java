/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Lenda;
import Exceptions.DizajniExceptions;
import java.util.List;

/**
 *
 * @author hp
 */
public interface LendaInterface {
     void create(Lenda l)throws DizajniExceptions;

    void edit(Lenda l)throws DizajniExceptions;

    void remove(Lenda l)throws DizajniExceptions;

    List<Lenda> findAll()throws DizajniExceptions;

    Lenda findByID(Integer Lenda_ID)throws DizajniExceptions;
}
