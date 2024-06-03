//Pour implémenter la communication entre l'app et la bdd


package com.openclassrooms.api.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.api.model.Employee;

@Repository //indique que la classe est un bean, et que son rôle est de communiquer avec une source de données
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
