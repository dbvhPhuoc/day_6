package jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    @Column(name = "owner_name", length = 255)
    private String ownerName;
    private double balance;

    public AccountEntity(){
    }
//    @Column(name = "access_time")
//    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date accessTime;
//    private boolean looked;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    public Date getAccessTime() {
//        return accessTime;
//    }
//
//    public void setAccessTime(Date accessTime) {
//        this.accessTime = accessTime;
//    }
//
//    public boolean isLooked() {
//        return looked;
//    }
//
//    public void setLooked(boolean looked) {
//        this.looked = looked;
//    }
}
