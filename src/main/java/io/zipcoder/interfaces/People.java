package io.zipcoder.interfaces;

import com.sun.deploy.security.SelectableSecurityManager;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public abstract class People<E extends Person> implements Iterable<E> {
    List<E> personList;

    public People(ArrayList<E>personList) {
        this.personList = personList;
    }

    public People(){
        this.personList=new ArrayList<E>();
    }

    void add(E e) {

        personList.add(e);
    }

    public E findById(Long id) {

        for (E p : personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Boolean contains(E person) {
        if (personList.contains(person)) {
            return true;
        }
        return false;
    }

    public void remove(E person) {
        if (personList.contains(person))
            personList.remove(person);

    }

    public void remove(Long id) {
        for (E p : personList) {
            if (p.getId() == id)
                personList.remove(p);

        }

    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    //we have to modify the method to add generics
    public abstract E[] toArray();
        /*Person[]arr=new Person[personList.size()];
        int j=0;
        for(int i=0;i<personList.size();i++){
            arr[j]=personList.get(i);
            j++;
        }
        return arr;*/




    public Iterator<E> iterator() {
        return personList.iterator();
        // return null;
    }
}
