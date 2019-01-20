package com.khzero.springboot.repository;

import com.khzero.springboot.domain.Board;
import com.khzero.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
