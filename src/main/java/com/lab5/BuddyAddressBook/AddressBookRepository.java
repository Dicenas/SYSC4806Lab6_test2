package com.lab5.BuddyAddressBook;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {

}
