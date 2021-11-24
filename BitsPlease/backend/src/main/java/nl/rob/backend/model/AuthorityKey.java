package nl.rob.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class AuthorityKey implements Serializable {

    @Column
    private String username;

    @Column
    private String authority;
}
