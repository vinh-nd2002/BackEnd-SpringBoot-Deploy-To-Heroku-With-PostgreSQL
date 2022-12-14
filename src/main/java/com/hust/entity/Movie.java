package com.hust.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Movie", catalog = "booking_movie_ticket")
@Data
@NoArgsConstructor
public class Movie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "movie_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;

	@Column(name = "movie_name", length = 100, unique = true, nullable = false)
	private String movieName;

	@Column(name = "movie_description", nullable = false)
	private String movieDescription;

	@Column(name = "movie_trailer", nullable = false)
	private String movieTrailer;

	@Column(name = "movie_release", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date movieRelease;

	@Column(name = "movie_length", nullable = false)
	private short movieLength;

	@Column(name = "movie_evaluate")
	private short movieEvaluate = 0;

	@Column(name = "movie_price")
	private int moviePrice = 60000;

	@Column(name = "movie_status")
	private boolean movieStatus = false;

	@OneToOne(mappedBy = "imgOfMovie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Image moviePoster;

	@OneToMany(mappedBy = "movie")
	private List<ScheduleMovie> scheduleMovies;

}
