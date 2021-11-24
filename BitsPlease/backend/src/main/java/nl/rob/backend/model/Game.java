package nl.rob.backend.model;

import javax.persistence.*;

@Entity(name = "games")
@Table
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(length = 80)
    public String name;

    @Column(length = 80)
    public String system;

    @Column(length = 80)
    public String developer;

    @Column
    public long uploaderId;

    @Lob
    @Column
    public byte[] picture;



    //getters and setters
    public byte[] getPic() {return picture;}

    public void setPic(byte[] pic) {this.picture = picture;}

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getSystem() {return system;}

    public void setSystem(String system) {this.system = system;}

    public String getDeveloper() {return developer;}

    public void setDeveloper(String developer) {this.developer = developer;}

    public long getUploaderId() {return uploaderId;}

    public void setUploaderId(long uploaderId) {this.uploaderId = uploaderId;}
}