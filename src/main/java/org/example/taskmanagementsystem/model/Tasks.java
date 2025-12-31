package org.example.taskmanagementsystem.model;

public class Tasks {

    private Long id;
    private String topic;
    private String title;
    private String description;
    private String created_date;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdDate=" + created_date +
                '}';
    }
}
