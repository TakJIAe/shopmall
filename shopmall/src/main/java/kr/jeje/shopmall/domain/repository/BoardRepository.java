package kr.jeje.shopmall.domain.repository;

import kr.jeje.shopmall.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
