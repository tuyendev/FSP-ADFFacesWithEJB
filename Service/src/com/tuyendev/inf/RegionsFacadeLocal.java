/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuyendev.inf;

import com.tuyendev.entities.Regions;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Tuyen Nguyen
 */
@Local
public interface RegionsFacadeLocal {

    void create(Regions regions);

    void edit(Regions regions);

    void remove(Regions regions);

    Regions find(Object id);

    List<Regions> findAll();

    List<Regions> findRange(int[] range);

    int count();
    
}