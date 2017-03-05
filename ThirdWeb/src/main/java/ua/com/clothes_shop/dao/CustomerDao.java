package ua.com.clothes_shop.dao;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import ua.com.clothes_shop.entity.Customer;

//JpaRepository ������ CRUD-repository, ���� ��� �� ����� ������ ��������� �� ������
public interface CustomerDao extends JpaRepository<Customer, Integer>{
	
//	@Query("select c from Customer c where c.name=:param")
//	Customer findCustomerByName(@Param("param") String name);
	//���� ����� �� ������ ��������� ����� ������� �������
	Customer findByUserName(String userName);
	
	Customer findByEmail(String email);
	
	
	
}
