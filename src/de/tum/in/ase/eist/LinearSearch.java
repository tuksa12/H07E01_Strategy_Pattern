package de.tum.in.ase.eist;

import java.util.List;

public class LinearSearch implements SearchStrategy {

    public String performSearch(List<PhoneBookEntry> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                return list.get(i).getPhoneNumber();
            }
        }
        return null;
    }
}
