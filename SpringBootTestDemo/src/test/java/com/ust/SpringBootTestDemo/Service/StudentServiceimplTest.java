package com.ust.SpringBootTestDemo.Service;

import com.ust.SpringBootTestDemo.Entity.Student;
import com.ust.SpringBootTestDemo.Exception.StudentNotFoundException;
import com.ust.SpringBootTestDemo.Repository.StudentRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudentServiceimplTest {

    @Mock
    private StudentRepo mockRepo;

    @InjectMocks
    private StudentServiceimpl studentServiceimplUnderTest;

    @Test
    void testSubmit() {
        // Setup
        final Student student = new Student(0, "name", "address", "rollno");
        final Student expectedResult = new Student(0, "name", "address", "rollno");

        // Configure StudentRepo.save(...).
        final Student student1 = new Student(0, "name", "address", "rollno");
        when(mockRepo.save(new Student(0, "name", "address", "rollno"))).thenReturn(student1);

        // Run the test
        final Student result = studentServiceimplUnderTest.submit(student);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetall() {
        // Setup
        final List<Student> expectedResult = List.of(new Student(0, "name", "address", "rollno"));

        // Configure StudentRepo.findAll(...).
        final List<Student> students = List.of(new Student(0, "name", "address", "rollno"));
        when(mockRepo.findAll()).thenReturn(students);

        // Run the test
        final List<Student> result = studentServiceimplUnderTest.getall();

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetall_StudentRepoReturnsNoItems() {
        // Setup
        when(mockRepo.findAll()).thenReturn(Collections.emptyList());

        // Run the test
        final List<Student> result = studentServiceimplUnderTest.getall();

        // Verify the results
        assertThat(result).isEqualTo(Collections.emptyList());
    }

    @Test
    void testGetbyid() {
        // Setup
        final Student expectedResult = new Student(0, "name", "address", "rollno");

        // Configure StudentRepo.findById(...).
        final Optional<Student> student = Optional.of(new Student(0, "name", "address", "rollno"));
        when(mockRepo.findById(0)).thenReturn(student);

        // Run the test
        final Student result = studentServiceimplUnderTest.getbyid(0);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetbyid_StudentRepoReturnsAbsent() {
        // Setup
        when(mockRepo.findById(0)).thenReturn(Optional.empty());

        // Run the test
        assertThatThrownBy(() -> studentServiceimplUnderTest.getbyid(0)).isInstanceOf(StudentNotFoundException.class);
    }

    @Test
    void testGetbyname() {
        // Setup
        final List<Student> expectedResult = List.of(new Student(0, "name", "address", "rollno"));

        // Configure StudentRepo.findByName(...).
        final List<Student> students = List.of(new Student(0, "name", "address", "rollno"));
        when(mockRepo.findByName("name")).thenReturn(students);

        // Run the test
        final List<Student> result = studentServiceimplUnderTest.getbyname("name");

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetbyname_StudentRepoReturnsNoItems() {
        // Setup
        when(mockRepo.findByName("name")).thenReturn(Collections.emptyList());

        // Run the test
        final List<Student> result = studentServiceimplUnderTest.getbyname("name");

        // Verify the results
        assertThat(result).isEqualTo(Collections.emptyList());
    }

    @Test
    void testDeletebyid() {
        // Setup
        final Student expectedResult = new Student(0, "name", "address", "rollno");

        // Configure StudentRepo.findById(...).
        final Optional<Student> student = Optional.of(new Student(0, "name", "address", "rollno"));
        when(mockRepo.findById(0)).thenReturn(student);

        // Run the test
        final Student result = studentServiceimplUnderTest.deletebyid(0);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
        verify(mockRepo).deleteById(0);
    }

    @Test
    void testDeletebyid_StudentRepoFindByIdReturnsAbsent() {
        // Setup
        when(mockRepo.findById(0)).thenReturn(Optional.empty());

        // Run the test
        assertThatThrownBy(() -> studentServiceimplUnderTest.deletebyid(0))
                .isInstanceOf(StudentNotFoundException.class);
    }
}
