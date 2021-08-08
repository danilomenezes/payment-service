package org.mnz.controller;

import org.mnz.service.PaymentService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/ping")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PingController {
    @Inject
    PaymentService paymentService;

    @GET
    public String getAllPayments() {
        return paymentService.paymentProcess("Teste");
    }
}
