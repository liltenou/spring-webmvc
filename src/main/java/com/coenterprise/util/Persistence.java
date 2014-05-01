//package com.coenterprise.util;
//
//import javax.persistence.EntityManager;
//
//import com.google.inject.Guice;
//import com.google.inject.Injector;
//import com.google.inject.persist.PersistService;
//import com.google.inject.persist.jpa.JpaPersistModule;
//
//public class Persistence {
//
//    private static Persistence instance;
//    private PersistService persistService;
//    private Injector injector;
//    
//    private Persistence() {
//        super();
//        init();
//    }
//
//    public static synchronized Persistence getInstance() {
//        if (instance == null) {
//            instance = new Persistence();
//        }
//        return instance;
//    }
//
//    private void init() {
//        JpaPersistModule jpaPersistModule = new JpaPersistModule(
//                "sfgui_unit");
//        injector = Guice.createInjector(jpaPersistModule);
//
//        persistService = injector.getInstance(PersistService.class);
//        
//        persistService.start();
//    }
//    
//    public EntityManager getEntityManager() {
//        return injector.getInstance(EntityManager.class);
//    }
//    
//    public void shutdown() {
//        if (persistService != null) {
//            persistService.stop();
//        }
//    }
//    
//}
