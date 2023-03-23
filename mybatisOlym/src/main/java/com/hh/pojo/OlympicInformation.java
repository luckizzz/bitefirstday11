package com.hh.pojo;

import java.util.Date;

/**
 * ClassName: OlympicInformation
 * Package: com.hh.pojo
 * Description:
 *
 * @Author 何欢
 * @Create 2023/3/8 11:40
 * @Version 1.0
 */
public class OlympicInformation {
    private Integer id;
    private Date year;
    private String organizer;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OlympicInformation{" +
                "id=" + id +
                ", year=" + year +
                ", organizer='" + organizer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
