package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Context {
    private List<PhoneBookEntry> phoneBook;
    private SearchStrategy searchAlgorithm;

    public Context() {
        phoneBook = new ArrayList<>();
    }

    public String search(String name) {
        return searchAlgorithm.performSearch(phoneBook, name);
    }

    public boolean isPhoneBookSorted() {
        return phoneBook.stream().sorted().collect(Collectors.toList()).equals(phoneBook);
    }

    public List<PhoneBookEntry> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(List<PhoneBookEntry> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void setSearchAlgorithm(SearchStrategy searchAlgorithm) {
        this.searchAlgorithm = searchAlgorithm;
    }
}
