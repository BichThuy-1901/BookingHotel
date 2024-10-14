package mvc.codejava.repository;


import mvc.codejava.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByRoomNumberContainingIgnoreCase(String keyword);
}
