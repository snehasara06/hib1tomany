package com.kgisl.hibernatemanytoone;

// import javax.persistence.JoinColumn;
// import javax.persistence.OneToOne;

public class Employee {
    
    private int employeeId;
    private String name;
    private String email;

    // @OneToOne
    // @JoinColumn(name = "addressId")
    private Address address;

    
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }


    
}
