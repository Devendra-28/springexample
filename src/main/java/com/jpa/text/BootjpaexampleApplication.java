package com.jpa.text;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.text.dao.UserRepository;
import com.jpa.text.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository= context.getBean(UserRepository.class);
		
	//	User user=new User();
	//	user.setName("Devendra");
	//	user.setCity("Pune");
	//	user.setStatus("I am java programer");
	//	User user1 = userRepository.save(user);
	//	System.out.println(user1);
		
	/*
	 * // create object for user User user1=new User(); user1.setName("Rushi");
	 * user1.setCity("Mumbai"); user1.setStatus("Java Developer");
	 * 
	 * User user2= new User(); user2.setName("Priya"); user2.setCity("Pune");
	 * user2.setStatus("BSc Physics");
	 */
		
		// Saving single user
	//	User resultUser = userRepository.save(user1);
	//	System.out.println("Save user"+resultUser);
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		
//		
//		System.out.println("done");
	/*
	 * Optional<User> optional = userRepository.findById(53); User user =
	 * optional.get(); user.setName("Priyanka Gunjal"); User result =
	 * userRepository.save(user); System.out.println(result);
	 */
		//how to get the data
		//findById(id)
		//Iterable<User> itr = userRepository.findAll();
		/*Iterator<User> iterator = itr.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			
			System.out.println(user);*/
		// lamda function
		//itr.forEach(user->{System.out.println(user);});
		
		//Deleting the user Element
		//Delete by single user deleteById(id)
	//	userRepository.deleteById(2);
	//	System.out.println("Deleted...");
		
		//Delete All users deleteAll()
		//Iterable<User> allusers = userRepository.findAll();
		//allusers.forEach(users->{System.out.println(users);});
		//userRepository.deleteAll();
		
		/*
		 * List<User> user = userRepository.findByName("Devendra"); user.forEach(e->
		 * System.out.println(e));
		 */
		
		List<User> alluser = userRepository.getAllUser();
		alluser.forEach(e->{System.out.println(e);});
		
		
//		List<User> userByName = userRepository.getUserByName("Devendra");
//		userByName.forEach(e->{System.out.println(e);});
		}
	

}
