/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Pagesa;
import Exceptions.DizajniExceptions;
import java.util.List;

/**
 *
 * @author hp
 */
public interface PagesatInterface {
     void create(Pagesa  p)throws DizajniExceptions;

    void edit(Pagesa  p)throws DizajniExceptions;

    void remove(Pagesa  p)throws DizajniExceptions;

    List<Pagesa > findAll()throws DizajniExceptions;

    Pagesa  findByID(Integer pagesa_id)throws DizajniExceptions;
}
