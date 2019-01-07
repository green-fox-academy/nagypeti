package com.task1.frontend.log;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Log {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long id ;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;

  private String endpoint;
  private String data;

  public Log(Date createdAt, String endpoint, String data) {
    this.createdAt = createdAt;
    this.endpoint = endpoint;
    this.data = data;
  }

}
