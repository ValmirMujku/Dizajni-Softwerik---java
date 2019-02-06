/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Drejtimi;
import Exceptions.DizajniExceptions;
import java.util.List;

/**
 *
 * @author hp
 */
public interface DrejtimiInterface {
    void create(Drejtimi d)throws DizajniExceptions;

    void edit(Drejtimi d)throws DizajniExceptions;

    void remove(Drejtimi d)throws DizajniExceptions;

    List<Drejtimi> findAll()throws DizajniExceptions;

    Drejtimi findByID(Integer Drejtimi_ID)throws DizajniExceptions;
}
