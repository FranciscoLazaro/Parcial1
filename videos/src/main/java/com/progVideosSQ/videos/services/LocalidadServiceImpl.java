package com.progVideosSQ.videos.services;

import com.progVideosSQ.videos.entities.Localidad;
import com.progVideosSQ.videos.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository){
    super(baseRepository);
    }
}
