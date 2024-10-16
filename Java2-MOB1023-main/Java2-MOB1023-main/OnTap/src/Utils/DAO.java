/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author thnrg
 * @param <Item>
 */
public abstract class DAO<Item> 
{
    protected ArrayList<Item> items = new ArrayList<>();
    protected String path;
    
    public DAO(String path)
    {
        this.path = path;
        load(path);
    }
    
    public Object[] getDataAsObjectArray(int index) 
    {
        if (index >= items.size()) 
        {
            return null;
        }
        return getDataAsObjectArray(items.get(index));
    }
    
    public Object[] getDataAsObjectArray(Item item) {
        if (item == null) 
        {
            return null;
        }
        if (item instanceof Exportable exportable) 
        {
            return exportable.toObjectArray();
        }
        return null;
    }

    public final void save(String path)
    {
        XFile.writeObject(path, items);
    }
    
    public final void load(String path)
    {
        items = (ArrayList<Item>) XFile.readObject(path);
        if(items == null){items = new ArrayList<>();}
    }
    
    public final void save()
    {
        save(path);
    }
    
    public final void load()
    {
        load(path);
    }
    
    public ArrayList<Item> getItems()
    {
        return items;
    }
    
    public void setItems(ArrayList<Item> items)
    {
        this.items = items;
    }
    
    public int findIndex(Method getter, String filter) 
    {
        for (int i = 0; i < items.size(); i++) 
        {
            Item item = items.get(i);
            try 
            {
                Object itemId = getter.invoke(item);
                if (itemId != null && itemId.equals(filter)) 
                {
                    return i;
                }
            } 
            catch (IllegalAccessException | InvocationTargetException ex) 
            {
                ex.printStackTrace();
            }
        }
        return -1;
    }
    
    public Item findMatchFilter(Method getter, String filter) 
    {
        for (Item item : items) 
        {
            try 
            {
                Object itemId = getter.invoke(item);
                if (itemId != null && itemId.equals(filter)) 
                {
                    return item;
                }
            } 
            catch (IllegalAccessException | InvocationTargetException ex) 
            {
                ex.printStackTrace();
            }
        }
        return null;
    }
    
    public ArrayList<Item> findHasFilter(Method getter, String filter) 
    {
        ArrayList<Item> filteredItems = new ArrayList<>();
        String searchId = filter.toLowerCase();

        for (Item item : items) 
        {
            try 
            {
                Object itemId = getter.invoke(item);
                if (itemId != null && itemId.toString().toLowerCase().contains(searchId)) 
                {
                    filteredItems.add(item);
                }
            } 
            catch (IllegalAccessException | InvocationTargetException ex) 
            {
                ex.printStackTrace();
            }
        }
        return filteredItems;
    }
}
