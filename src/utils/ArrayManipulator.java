/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import data.packages.DataUnit;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Angelo
 */
public class ArrayManipulator {
    
    public static DataUnit pop(ArrayList<DataUnit> list){
        DataUnit tmpData = list.get(0);
        list.remove(0);
        return tmpData;
    }
}
