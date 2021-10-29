package usa.c3.g25.reto3.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "client")
/**
 * Class Client
 */
public class Client implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 5)
    private Integer id;

    @Column(length = 45)
    private String email;

    @Column(length = 45)
    private String password;

    @Column(length = 250)
    private String name;

    @Column(length = 5)
    private Integer age;

    /**
     * Relacion uno a muchos con entidad Message
     * 
     */
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
    @JsonIgnoreProperties({"costume","client"})
    private List<Message> messages;

    /**
     * Relacion uno a muchos con entidad Reservation
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    @JsonIgnoreProperties({"costume","client"})
    private List<Reservation> reservations;    
    
    public Client() {
        /**
         * Constructor vacio
         */
    }

    public Client(Integer id, String email, String password, String name, Integer age, List<Message> messages,
            List<Reservation> reservations) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.age = age;
        this.messages = messages;
        this.reservations = reservations;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    
}

