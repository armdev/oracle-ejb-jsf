package com.project.resources;

import com.project.facades.AbstractFacade;
import com.project.entities.DemoUsers;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Admin
 */
@Stateless
@Path("users")
public class UserResources extends AbstractFacade<DemoUsers> {

    // http://localhost:8585/oracle-ejb/webresources/users 
    @PersistenceContext(unitName = "ejbPU")
    private EntityManager em;

    public UserResources() {
        super(DemoUsers.class);
    }

   
    @GET
    @Override
    @Produces(MediaType.APPLICATION_JSON)
    public List<DemoUsers> findAll() {
        return super.findAll();
    }

  
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
