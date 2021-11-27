package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdvancedAddressBookTest {
    AdvancedAddressBook addressBook;
    @Before
    public void initializeClass(){
        addressBook = new AdvancedAddressBook();
    }
    @Test
    public void givenListOfContactsWhenAddedShouldReturnNumberOfContacts(){
        int size = addressBook.addContact().size();
        Assert.assertEquals(1,size);
    }
}
