package service;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import model.Person;

@Service
public class PersonService {

	Hashtable<String, Person> persons= new Hashtable<String, Person>();
	public PersonService(){
		Person p= new Person();
		p.setId("1");
		p.setFirstname("Jake");
		p.setLastname("Morgan");
		p.setAge(25);
		
		p= new Person();
		p.setId("2");
		p.setFirstname("Jane");
		p.setLastname("Morgan");
		p.setAge(20);
		
	}
	
	public Person getPerson (String id)
	{
		if(persons.containsKey(id))
		{
			return persons.get(id);
		}
		else
		{
			return null;
		}
	}
	
	public Hashtable<String, Person> getAll(){
		return persons;
	}
	
	public String getauthor(){
		
		Person p=new Person();
		
		return p.getAuthor();
	}
}
