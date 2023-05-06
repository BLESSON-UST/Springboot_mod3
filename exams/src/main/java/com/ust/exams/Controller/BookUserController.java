package com.ust.exams.Controller;

import com.ust.exams.Entity.Book;
import com.ust.exams.Entity.User;
import com.ust.exams.Repository.BookRepo;
import com.ust.exams.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookUserController {
    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private UserRepo userRepo;

    @PostMapping("/user")
    public ResponseEntity<User> submit(User user)
    {
        userRepo.save(user);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/book")
    public ResponseEntity<Book> post(Book book)
    {
        bookRepo.save(book);
        return ResponseEntity.ok().body(book);
    }

    @GetMapping("/allusers")
    public ResponseEntity<List<User>> findalluser()
    {
        return ResponseEntity.ok().body(userRepo.findAll());
    }

    @GetMapping("/allbooks")
    public ResponseEntity<List<Book>> findallbook()
    {
        return ResponseEntity.ok().body(bookRepo.findAll());
    }

    @GetMapping("/usr/{id}")
    public ResponseEntity<Optional<User>> findbyid(@PathVariable int id)
    {
        Optional<User> user=userRepo.findById(id);
        if(user!=null)
        {
           ResponseEntity.ok().body(user);
        }
        else
        {
            return null;
        }
        return ResponseEntity.ok().body(user);


    }

    @GetMapping("/bok/{bid}")
    public ResponseEntity<Book> findbookbyid(int bid)
    {
        Book book=bookRepo.findBybid(bid);
        if(book!=null)
        {
            ResponseEntity.ok().body(book);
        }
        else
        {
            return null;

        }
        return ResponseEntity.ok().body(book);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Optional<User>> updateuser(@PathVariable int id ,@RequestBody User user)
    {
        Optional<User> existinguser=userRepo.findById(id);
        if(existinguser==null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            User updateduser=existinguser.get();
            updateduser.setUname(user.getUname());
            updateduser.setMid(user.getMid());
            userRepo.save(updateduser);
            return ResponseEntity.ok().body(Optional.of(updateduser));


        }

    }

    @PutMapping("/bupdate/{bid}")
    public ResponseEntity<Book> updatebook(@PathVariable int bid,@RequestBody Book book)
    {
       Book existingbook=bookRepo.findBybid(bid);
        if(book==null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            existingbook.setBname(book.getBname());
            existingbook.setAuthor(book.getAuthor());
            Book updatedbook=bookRepo.save(existingbook);
            return ResponseEntity.ok().body(updatedbook);
        }
    }

    @DeleteMapping("/duser/{id}")
    public ResponseEntity<Optional<User>>deleteuser(@PathVariable int id)
    {
        Optional<User> user=userRepo.findById(id);
        if(user==null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            userRepo.deleteById(id);
            return ResponseEntity.ok().body(null);
        }
    }

    @DeleteMapping("/dbook/{bid}")
    public ResponseEntity<Book> deletebook(int bid)
    {
        Book book=bookRepo.findBybid(bid);
        if(book==null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            bookRepo.deleteById(bid);
            return ResponseEntity.ok().body(null);
        }

    }



}
