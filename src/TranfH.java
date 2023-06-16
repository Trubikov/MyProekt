package ru.neoflex.practice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranfH extends JpaRepository<TableTH, Long>{

}
