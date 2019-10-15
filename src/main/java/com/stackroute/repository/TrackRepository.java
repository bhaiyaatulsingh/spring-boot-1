package com.stackroute.repository;

import com.stackroute.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Allows spring-data-jpa repository infrastructure to scan the classpath for this interface and create a springbean for it (it will be created at runtime)
public interface TrackRepository extends JpaRepository<Track, Integer> {
}
