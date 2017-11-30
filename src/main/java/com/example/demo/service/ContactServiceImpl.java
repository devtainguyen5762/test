package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Contact;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public Iterable<Contact> findAll() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	@Override
	public List<Contact> search(String q) {
		// TODO Auto-generated method stub\
		return contactRepository.findByNameContaining(q);
	}

	@Override
	public Contact findOne(int id) {
		// TODO Auto-generated method stub
		return contactRepository.findOne(id);
	}

	@Override
	public void save(Contact contact) {
		 contactRepository.save(contact);
		
	}

	@Override
	public void delete(int id) {
		 contactRepository.delete(id);
		
	}

}
