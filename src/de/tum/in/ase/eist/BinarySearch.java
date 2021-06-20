package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch implements SearchStrategy {
    @Override
    public String performSearch(List<PhoneBookEntry> phoneBook, String name) {
        if (phoneBook.size() == 1){
            if (phoneBook.get(0).getName().equals(name)){
                return phoneBook.get(0).getName();
            }
        } else{
            if (phoneBook.size() % 2 == 0) {
                if (phoneBook.get(phoneBook.size() / 2).getName().equals(name)) {
                    return name;
                } else {
                    //if (phoneBook.get(phoneBook.size() / 2).getName())
                    List<PhoneBookEntry> copy = new ArrayList<>();
                    for (int i = 0; i < phoneBook.size() / 2 + 1; i++) {
                        copy.add(phoneBook.get(i));
                    }
                    return performSearch(copy, name);
                }
            }
            else {
                if (phoneBook.get(phoneBook.size() / 2).getName().equals(name)) {
                    return name;
                } else {
                    List<PhoneBookEntry> copy = new ArrayList<>();
                    for (int i = 0; i < phoneBook.size() / 2; i++) {
                        copy.add(phoneBook.get(i));
                    }
                    return performSearch(copy, name);
                }
            }
        }
    return null;}
}
