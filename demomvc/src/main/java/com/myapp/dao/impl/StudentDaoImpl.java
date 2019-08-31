package com.myapp.dao.impl;

import com.myapp.dao.StudentDao;
import com.myapp.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    private SessionFactory sessionFactory;
    @Autowired
    public StudentDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Student> getAllStudents() {
        Session session = sessionFactory.getCurrentSession();
        List<Student> students = session.createQuery("from Student").list();
        return students;
    }

    @Override
    public void createStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.save(student);

    }
}
