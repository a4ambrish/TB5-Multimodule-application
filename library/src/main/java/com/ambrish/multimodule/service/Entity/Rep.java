package com.ambrish.multimodule.service.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// Author : Piyush Choudhary
@Entity
@Table (name = "rep")
@Data
public class Rep {
    @Id
    @Column
    Double id;
}
