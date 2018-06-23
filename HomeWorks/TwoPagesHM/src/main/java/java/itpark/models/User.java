package java.itpark.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "service_user")

public class User {
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private String login;

    @Column(name = "hash_password")
    private String hashPassword;
}
