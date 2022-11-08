package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts
    List<Contact> list = List.of(
            new Contact(1L, "a@gmail.com", "A", 1001L),
            new Contact(2L, "b@gmail.com", "B", 1001L),
            new Contact(1L, "c@gmail.com", "C", 1002L),
            new Contact(1L, "d@gmail.com", "D", 1003L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
