package de.tum.in.ase.eist;

import java.util.List;

public interface SearchStrategy {
    String performSearch(List<PhoneBookEntry> phoneBook, String name);
}
