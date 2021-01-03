package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.User;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.lang.model.type.ArrayType;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @PostMapping
    public ResponseEntity addCustomer(@RequestParam("nic") String nic,
                                      @RequestParam("name") String name,
                                      @RequestParam("address") String address,
                                      @RequestParam("contact_no") int contact_no,
                                      @RequestParam("email") String email,
                                      @RequestParam("user_name") String user_name,
                                      @RequestParam("password") String password,
                                      @RequestParam("dl_no") String dl_no,
                                      @RequestParam(value = "file",required = false) MultipartFile file) {
        byte [] image;
        try{
            image=file.getBytes();
        }catch (IOException e){
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        User user = new User(user_name ,password ,"CUSTOMER");
        CustomerDTO customer = new CustomerDTO(nic,name,address,contact_no,email,image,dl_no,user);
        customerService.saveCustomer(customer);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteCustomer(@RequestParam String id) {
        customerService.deleteCustomer(id);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateCustomer(@RequestBody CustomerDTO dto) {
        customerService.updateCustomer(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchCustomer(@PathVariable String id) {
        CustomerDTO customerDTO = customerService.searchCustomer(id);
        return new ResponseEntity(new StandradResponse(200, "Success", customerDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllCustomers() {
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        return new ResponseEntity(new StandradResponse(200, "Success", allCustomers), HttpStatus.OK);
    }


}
