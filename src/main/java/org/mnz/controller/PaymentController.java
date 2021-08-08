package org.mnz.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/payments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PaymentController {
    @POST
    public String makePayment() {
        return "Hello RESTEasy";
    }

    @GET
    public String getAllPayments() {
        return "Hello RESTEasy";
    }

    @GET
    public String getPayment() {
        return "Hello RESTEasy";
    }
    
    @DELETE
    public String requestReversalPayment() {
        return "Hello RESTEasy";
    }
}
