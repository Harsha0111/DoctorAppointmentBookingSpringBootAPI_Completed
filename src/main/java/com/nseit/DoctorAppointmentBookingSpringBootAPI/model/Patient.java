package com.nseit.DoctorAppointmentBookingSpringBootAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer height;
    private Integer weight;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private AuthUser authUser;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "appointment_id",referencedColumnName = "id")
    private Appointment appointment;

}
