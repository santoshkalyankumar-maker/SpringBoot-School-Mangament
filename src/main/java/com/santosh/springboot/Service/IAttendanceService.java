package com.santosh.springboot.Service;

import java.time.LocalDate;
import java.util.List;

import com.santosh.springboot.Entity.Attendance;

public interface IAttendanceService {

    /**
     * Fetches all attendance records.
     *
     * @return a list of all attendance records
     */
    List<Attendance> getAllAttendances();

    /**
     * Retrieves a specific attendance record by its ID.
     *
     * @param attendanceId the ID of the attendance record
     * @return the Attendance record
     */
    Attendance getAttendanceById(Long attendanceId);

    /**
     * Retrieves attendance records for a specific user on a specific date.
     *
     * @param userId the ID of the user
     * @param date   the date of attendance
     * @return a list of attendance records
     */
    List<Attendance> getAttendanceByUserAndDate(Long userId, LocalDate date);

    /**
     * Saves a new attendance record.
     *
     * @param attendance the Attendance entity to be saved
     * @return the saved Attendance record
     */
    Attendance saveAttendance(Attendance attendance);

    /**
     * Updates an existing attendance record.
     *
     * @param attendanceId the ID of the attendance record to update
     * @param updatedAttendance the updated Attendance data
     * @return the updated Attendance record
     */
    Attendance updateAttendance(Long attendanceId, Attendance updatedAttendance);

    /**
     * Deletes an attendance record by its ID.
     *
     * @param attendanceId the ID of the attendance record to delete
     */
    void deleteAttendance(Long attendanceId);
}
