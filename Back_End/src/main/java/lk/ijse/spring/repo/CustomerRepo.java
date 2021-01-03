package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepo extends JpaRepository<Customer, String> {
    @Query("SELECT c FROM Customer c,User u WHERE c.user=u.user_name")
    public Customer getCustomerByNic(String nic);
}
