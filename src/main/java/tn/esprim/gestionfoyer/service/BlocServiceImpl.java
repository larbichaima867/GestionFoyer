package tn.esprim.gestionfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestionfoyer.repositories.BlocRepository;
@Service
public class BlocServiceImpl implements IBlocService{
    @Autowired
    private BlocRepository blocRepository;


}
