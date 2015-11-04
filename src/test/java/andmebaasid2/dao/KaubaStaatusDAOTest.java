package andmebaasid2.dao;

import andmebaasid2.common.test.DatabaseTestBase;
import andmebaasid2.model.KaubaStaatus;
import org.junit.Test;

import javax.inject.Inject;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by mart on 4.11.15.
 */
public class KaubaStaatusDAOTest extends DatabaseTestBase {

    @Inject
    private KaubaStaatusDAO kaubaStaatusDAO;

    @Test
    public void findAll() {
        List<KaubaStaatus> staatuses = kaubaStaatusDAO.findAll();
        assertNotNull(staatuses);
        assertEquals("aktiivne", staatuses.get(0).getNimetus());
    }
}
