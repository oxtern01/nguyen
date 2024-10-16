/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author thnrg
 */
abstract public class DAO<Entity> 
{
    protected ArrayList<Entity> list = new ArrayList<>();
    
    public void add(Entity entity)
    {
        list.add(entity);
    }
    
    public void remove(Entity entity)
    {
        list.remove(entity);
    }
    
    abstract public void update(Entity entity);
    abstract public Entity find(Serializable id);
    
    public ArrayList<Entity> getList()
    {
        return list;
    }
    
    public void store(String path)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path)))
        {
            oos.writeObject(list);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void load(String path)
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) 
        {
            list = (ArrayList<Entity>) ois.readObject();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
