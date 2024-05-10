package com.atduyar.rental.Domain.Entity;

import java.util.Objects;

public class Member {
    private Long id;
    private String name;
    private String address;
    private String phone;

    public Member(Long id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Member member = (Member) o;
        return phone == member.phone && Objects.equals(id, member.id) && Objects.equals(name, member.name)
                && Objects.equals(address, member.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phone);
    }

    @Override
    public String toString() {
        return "Domain.Entity.Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}
