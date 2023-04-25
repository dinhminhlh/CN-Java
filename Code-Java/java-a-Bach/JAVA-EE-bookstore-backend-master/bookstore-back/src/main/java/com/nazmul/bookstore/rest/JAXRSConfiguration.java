package com.nazmul.bookstore.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.container.*;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Application;
import javax.ws.rs.ext.*;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

@ApplicationPath("api")
public class JAXRSConfiguration extends Application {

//    @Provider
//    public abstract class CORSFilter implements ContainerResponseFilter {
//        @Override
//        public void filter(final ContainerRequestContext requestContext, final ContainerResponseContext responseContext) {
//            responseContext.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
//            responseContext.getHeaders().putSingle("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
//            String reqHeader = requestContext.getHeaderString("Access-Control-Request-Headers");
//            if (reqHeader != null && reqHeader != "") {
//                responseContext.getHeaders().putSingle("Access-Control-Allow-Headers", reqHeader);
//            }
//        }
//    }

}

