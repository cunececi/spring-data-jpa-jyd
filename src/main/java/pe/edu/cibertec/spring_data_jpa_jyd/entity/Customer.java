package pe.edu.cibertec.spring_data_jpa_jyd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;
    private Integer store_id;
    private String first_name;
    private String last_name;
    private String email;
    private Integer address_id;
    private Integer active;
    private Date create_date;
    private Date last_update;


    public Customer(Object o, int i, String cesar, String santos, String mail, int i1, int i2, Date date, Date date1) {
    }
}
