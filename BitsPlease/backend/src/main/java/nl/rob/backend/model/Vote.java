package nl.rob.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "votes")
@IdClass(VoteKey.class)
public class Vote implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long votedby;

    @Column
    private long votes;

}