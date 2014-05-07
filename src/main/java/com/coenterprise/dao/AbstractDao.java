//package com.coenterprise.dao;
//
//import org.hibernate.criterion.Criterion;
//
//import java.io.Serializable;
//import java.util.List;
//
//public interface AbstractDao<E, I extends Serializable> {
//
//	E findbyName(I name);
//    void saveOrUpdate(E e);
//    void delete(E e);
//    List<E> findByCriteria(Criterion criterion);
//	E findByName(I name); // this was added due to an error in AbstractDaoImpl
//
//}
//