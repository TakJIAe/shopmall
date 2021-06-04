package kr.jeje.shopmall.domain.repository;

import kr.jeje.shopmall.domain.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}

