package com.ambrish.multimodule.service.Entity;

import javax.persistence.*;
/**
 * @author Sumit
 * */
@Entity
@Table(name="path")
public class Path {

    @Id
    @Column(name= "name")
    @GeneratedValue(strategy = GenerationType.AUTO)
    String Name;
    @Column(name= "path")
    String Path;

    public String getName() {  return Name; }

    public void setName(String name) {Name = name;}

    public String getPath() {return Path;}

    public void setPath(String path) {Path = path;}
}
