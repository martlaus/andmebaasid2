package andmebaasid2.rest;

import andmebaasid2.dao.KaubaStaatusDAO;
import andmebaasid2.model.KaubaStaatus;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by mart on 4.11.15.
 */

@Path("kaubaStaatus")
public class KaubaStaatusResource {

    @Inject
    private KaubaStaatusDAO kaubaStaatusDAO;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<KaubaStaatus> getAllStatuses() {


        return kaubaStaatusDAO.findAll();
    }
}
