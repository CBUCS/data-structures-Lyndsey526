package Interface;

import java.util.ArrayList;
import java.util.List;

public class groceryBag implements bag{
    List<Object> gItems = new ArrayList<Object>();

    @Override
    public boolean add(Object item) {
        gItems.add(item);
        return false;
    }

    @Override
    public boolean remove(Object item) {
        if (gItems.contains(item)){
            gItems.remove(item);
        return true;}
     else
         return false;
    }

    @Override
    public boolean contains(Object item) {
       if(gItems.contains(item))
           return true;

        return false;
    }

    @Override
    public int numItems() {
        return gItems.size();
    }

    @Override
    public Object grab() {
        if(gItems.size()!=0)
        return gItems.get(gItems.size()- 1);
        else
            return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
