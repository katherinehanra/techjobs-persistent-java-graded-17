package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


@NotBlank(message = "Location required.")
@Size(max = 150, message = "Location must not exceed 150 characters.")
private String location;

public Employer() {};

public String getLocation() {
    return location;
}

public void setLocation(String location) {
    this.location = location;
}
}