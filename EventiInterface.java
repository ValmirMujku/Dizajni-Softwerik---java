/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Eventi;
import Exceptions.DizajniExceptions;
import java.util.List;

/**
 *
 * @author hp
 */
public interface EventiInterface {
     void create(Eventi e)throws DizajniExceptions;

    void edit(Eventi e)throws DizajniExceptions;

    void remove(Eventi e)throws DizajniExceptions;

    List<Eventi> findAll()throws DizajniExceptions;

    Eventi findByID(Integer Eventi_ID)throws DizajniExceptions;
}
