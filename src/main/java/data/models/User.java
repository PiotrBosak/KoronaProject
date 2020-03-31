package data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    public User(Long id,String username,String email) {
        super(id);
        this.username = username;
        this.email = email;
    }

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;





}
