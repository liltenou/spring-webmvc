//package com.coenterprise.dao.impl;
//
//import com.coenterprise.dao.AbstractDao;
//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.criterion.Criterion;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.io.Serializable;
//import java.util.List;
//
//public abstract class AbstractDaoImpl<E, I extends Serializable> implements AbstractDao<E,I> {
//
//    private Class<E> entityClass;
//
//    protected AbstractDaoImpl(Class<E> entityClass) {
//        this.entityClass = entityClass;
//    }
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    public Session getCurrentSession() {
//        return sessionFactory.getCurrentSession();
//    }
//
//    @Override
//    public E findByName(I name) {
//        return (E) getCurrentSession().get(entityClass, name);
//    }
//
//    @Override
//    public void saveOrUpdate(E e) {
//        getCurrentSession().saveOrUpdate(e);
//    }
//
//    @Override
//    public void delete(E e) {
//        getCurrentSession().delete(e);
//    }
//
//    @Override
//    public List<E> findByCriteria(Criterion criterion) {
//        Criteria criteria = getCurrentSession().createCriteria(entityClass);
//        criteria.add(criterion);
//        return criteria.list();
//    }
//}
