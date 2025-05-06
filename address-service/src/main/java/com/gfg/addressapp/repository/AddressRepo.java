package com.gfg.addressapp.repository;

import com.gfg.addressapp.entity.Address;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

    @Query(
            nativeQuery = true,
            value
                    = "SELECT ea.id, ea.city, ea.state FROM scalableassignment.address ea join scalableassignment.student e on e.id = ea.student_id where ea.student_id=:studentId")
    Optional<Address> findAddressByStudentId(@Param("studentId") int studentId);
}
