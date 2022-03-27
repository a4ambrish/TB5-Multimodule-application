package com.ambrish.multimodule.service.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Data
public class Client {

    @Id
    @Column
Double clid;
    @Column
String name;

    @OneToMany
    @JoinColumn(name = "clid")
    Set<BillMaster> bills;
}
