package com.santosh.springboot.Service;




import com.santosh.springboot.Entity.Attendance;

import com.santosh.springboot.repository.AttendanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AttendanceServiceImpl implements IAttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Override
    public List<Attendance> getAllAttendances() {
        return attendanceRepository.findAll();
    }

//    @Override
//    public Attendance getAttendanceById(Long attendanceId) {
//        return attendanceRepository.findById(attendanceId)
//                .orElseThrow(() -> new com.santosh.springboot.excepation.AttendanceNotFoundException("Attendance not found with ID: " + attendanceId));
//    }

    @Override
    public List<Attendance> getAttendanceByUserAndDate(Long userId, LocalDate date) {
        return attendanceRepository.findByUserIdAndDate11(userId, date);
    }

    @Override
    public Attendance saveAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    @Override
    public Attendance updateAttendance(Long attendanceId, Attendance updatedAttendance) {
        Attendance existingAttendance = getAttendanceById(attendanceId);
        existingAttendance.setDate(updatedAttendance.getDate());
        existingAttendance.setUserId(updatedAttendance.getUserId());
        existingAttendance.setStatus(updatedAttendance.getStatus());
        existingAttendance.setRemarks(updatedAttendance.getRemarks());
        return attendanceRepository.save(existingAttendance);
    }

    @Override
    public void deleteAttendance(Long attendanceId) {
        Attendance existingAttendance = getAttendanceById(attendanceId);
        attendanceRepository.delete(existingAttendance);
    }

	@Override
	public Attendance getAttendanceById(Long attendanceId) {
		// TODO Auto-generated method stub
		return null;
	}
}


