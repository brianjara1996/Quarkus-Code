package org.quarkus;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class objetoRepository implements PanacheRepository<objeto> {
}
