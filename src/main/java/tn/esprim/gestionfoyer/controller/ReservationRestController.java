package tn.esprim.gestionfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.gestionfoyer.service.IReservationService;
@RestController
public class ReservationRestController {
    @Autowired
    private IReservationService reservationService;
}
