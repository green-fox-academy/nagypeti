package com.reddit.tiptop.repository;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private int vote;
  private String title;
  private String url;

  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  private String timeSinceCreation;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "userId", referencedColumnName = "id")
  private User user;


  public Post() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getTimeSinceCreation() {
    return timeSinceCreation;
  }

  public void setTimeSinceCreation(String timeSinceCreation) {
    this.timeSinceCreation = timeSinceCreation;
  }
}
