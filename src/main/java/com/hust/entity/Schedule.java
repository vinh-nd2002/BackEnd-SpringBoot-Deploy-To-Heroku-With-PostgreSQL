package com.hust.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Schedule", catalog = "booking_movie_ticket")
@Data
@NoArgsConstructor
public class Schedule implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "schedule_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scheduleId;

	@OneToMany(mappedBy = "schedule")
	private List<ScheduleMovie> scheduleMovies;

	@Column(name = "schedule_start", nullable = false, updatable = false)
	@Temporal(TemporalType.TIME)
	private Date scheduleStart;

}
