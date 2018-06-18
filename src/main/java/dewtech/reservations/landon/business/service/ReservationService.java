package dewtech.reservations.landon.business.service;

import dewtech.reservations.landon.business.domain.RoomReservation;
import dewtech.reservations.landon.data.entity.Reservation;
import dewtech.reservations.landon.data.repository.GuestRepository;
import dewtech.reservations.landon.data.repository.ReservationRepository;
import dewtech.reservations.landon.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class ReservationService {
    private RoomRepository;
    private GuestRepository;
    private ReservationRepository;


    @Autowired
    public ReservationService(RoomRepository roomRepository,
                              GuestRepository guestRepository,
                              ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRespository = reservationRepository;
    }

    public List<RoomReservation> getRoomReservationsForDate(Date date){
        Iterable<Room> rooms = this.roomRepository.findAll();
        Map<Long, RoomReservation> roomReservationMap = new HashMap<>();
        rooms.forEach(room->{
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomId(room.getId());
            roomReservation.setRoomName(room.getName());
            roomReservation.setRoomNumber(room.getNumber());
            roomReservationMap.put(room.getId(), roomReservation);
        });

        Iterable<Reservation> reservations = this.reservationsRepository.findByDate(New java.sql.Date(date.getTime()));
        if (null !=reservations){
            reservations.forEach(reservation -> {
                Guest guest = this.guestRespository.findOne(reservation.getGuestId());
                if (null !=guest){
                    RoomReservation roomReservation = roomReservationMap.get(reservation.getId());
                    roomReservation.setDate(date);
                    roomReservation.setFirstName(guest.getFirstName);
                    roomReservation.setLastName(guest.getLastName);
                    roomReservation.setGuestId(guest.getId());
                }
            });
        }
        List<RoomReservation> roomReservations = new ArrayList<>();
        for (Long roomId:roomReservationMap.keySet()){
            roomReservations.add(roomReservationMap.get(roomId));
        }
        return roomReservations;
    }
}
