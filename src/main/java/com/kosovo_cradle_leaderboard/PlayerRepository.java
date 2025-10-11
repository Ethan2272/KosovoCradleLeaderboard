package com.kosovo_cradle_leaderboard;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long>{
    List<Player> findByCountryCode(String countryCode);

    Player findById(long id);
}
