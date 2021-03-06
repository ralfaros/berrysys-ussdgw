/*
 * BerrySys SigTran USSDGW
 * Copyright (C) 2015 BerrySys S.A. de C.V. 
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.berrysys.ussdgw;

import org.apache.logging.log4j.LogManager;
import org.eclipse.jetty.server.Server;

/**
 * The Class HttpServerThread.
 */
public class HttpServerThread extends Thread {

  /** The log. */
  private static org.apache.logging.log4j.Logger log = LogManager
      .getLogger(HttpServerThread.class);

  /** The jetty server. */
  Server jettyServer;

  /**
   * Gets the jetty server.
   *
   * @return the jetty server
   */
  public Server getJettyServer() {
    return jettyServer;
  }

  /**
   * Sets the jetty server.
   *
   * @param jettyServer the new jetty server
   */
  public void setJettyServer(Server jettyServer) {
    this.jettyServer = jettyServer;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Thread#run()
   */
  @Override
  public void run() {
    // TODO Auto-generated method stub
    try {
      jettyServer.start();
      jettyServer.join();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      log.catching(e);
    }
  }

}
