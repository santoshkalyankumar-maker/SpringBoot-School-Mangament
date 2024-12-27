package com.santosh.springboot.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceId;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String status;

    @Column(length = 500)
    private String remarks;

    // Constructors
    public Attendance() {}

    public Attendance(LocalDate date, Long userId, String status, String remarks) {
        this.date = date;
        this.userId = userId;
        this.status = status;
        this.remarks = remarks;
    }

    // Getters and Setters
    public Long getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Long attendanceId) {
        this.attendanceId = attendanceId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceId=" + attendanceId +
                ", date=" + date +
                ", userId=" + userId +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

	public List<Attendance> getAllAttendance() {
		// TODO Auto-generated method stub
		return null;
	}

	public Attendance getAttendanceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAttendance(Long id) {
		// TODO Auto-generated method stub
		
	}

	public Attendance saveAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		return null;
	}

	public Attendance updateAttendance(Long id, Attendance updatedAttendance) {
		// TODO Auto-generated method stub
		return null;
	}
}

