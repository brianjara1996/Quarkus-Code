package org.quarkus;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

@Path("/demo")
public class objetoResource {


    @Inject
    objetoRepository objRepository;

    @POST
    @Transactional
    public String Demo(objeto obj){

        long startTime = System.nanoTime();

        objRepository.persist(obj);

        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;

        return "Il tuo messaggio è stato aggiunto con successo in: " + timeElapsed + " nanoseconds";
    }
}
