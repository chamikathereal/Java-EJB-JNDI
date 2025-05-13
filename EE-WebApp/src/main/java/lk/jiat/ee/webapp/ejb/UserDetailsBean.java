package lk.jiat.ee.webapp.ejb;

import jakarta.ejb.Stateless;
import lk.jiat.ee.webapp.remote.UserDetails;

@Stateless
public class UserDetailsBean implements UserDetails {
    @Override
    public String getName() {
        return "Chamika";
    }

    @Override
    public String getEmail() {
        return "chamika@gmail.com";
    }

    @Override
    public String getContact() {
        return "0772101809";
    }
}


