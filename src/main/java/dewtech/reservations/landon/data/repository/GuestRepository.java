package dewtech.reservations.landon.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import  dewtech.reservations.landon.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}