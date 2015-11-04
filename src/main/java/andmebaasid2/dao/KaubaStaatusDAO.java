package andmebaasid2.dao;

import andmebaasid2.model.KaubaStaatus;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by mart on 4.11.15.
 */
public class KaubaStaatusDAO {

    @Inject
    private EntityManager entityManager;

    public List<KaubaStaatus> findAll() {
        return entityManager.createQuery("from kauba_staatus", KaubaStaatus.class).getResultList();
    }
}
