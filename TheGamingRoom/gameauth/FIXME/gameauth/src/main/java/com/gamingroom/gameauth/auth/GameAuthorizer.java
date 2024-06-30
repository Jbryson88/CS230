package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
        // Assuming GameUser has a method getRoles() that returns a collection of roles
        if (user != null && user.getRoles() != null) {
            return user.getRoles().contains(role);
        }
        return false;
    }
    
}