/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverwofacade;

/**
 *
 * @author umyong
 */
public class Server{
    private static Server server = null;
        private Server() {}
        public static Server getServer() {
            if (server == null) {
                server = new Server();
            } 
            return server;
        }
        public void sB() {
            ScheduleServer sv = new ScheduleServer();
            sv.startBooting();
            sv.readSystemConfigFile();
            sv.init();
            sv.initializeContext();
            sv.initializeListeners();
            sv.createSystemObjects();
        }
 
        public void sD() {
            ScheduleServer sv = new ScheduleServer();
            sv.releaseProcesses();
            sv.destory();
            sv.destroySystemObjects();
            sv.destoryListeners();
            sv.destoryContext();
        }
        
}


