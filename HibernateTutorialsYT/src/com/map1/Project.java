package com.map1;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {
    @Id
    private int pid;

    private String projectName;

    @ManyToMany(mappedBy = "projects",cascade = {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
    private List<Emp>emps;

    public Project(int pid, String projectName) {
        this.pid = pid;
        this.projectName = projectName;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Project() {
    }

    @Override
    public String toString() {
        return "Project{" +
                "pid=" + pid +
                ", projectName='" + projectName + '\'' +
                ", emps=" + emps +
                '}';
    }
}
