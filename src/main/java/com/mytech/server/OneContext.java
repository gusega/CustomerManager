/*
package com.mytech.server;

import org.eclipse.jetty.plus.jndi.Resource;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.webapp.WebAppContext;
import org.postgresql.ds.PGConnectionPoolDataSource;

public class OneContext {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        WebAppContext context = new WebAppContext();

        PGConnectionPoolDataSource poolDataSource = new PGConnectionPoolDataSource();
        org.eclipse.jetty.plus.jndi.Resource resource =
            new Resource("", "jdbc/datasource", poolDataSource);
//        context.add
//        context.add
//        context.setResourceAliases();

//        ContextHandler context = new ContextHandler();

*/
/*
        new org.eclipse.jetty.webapp.WebAppContext()
        context.setContextPath("/hello");
        context.setHandler(new HelloHandler());
*//*

        server.setHandler(context);
        server.start();
        server.join();
    }
}
*/
