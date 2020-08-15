package fallak.microservices.bookinfoservice.resources;

import fallak.microservices.bookinfoservice.model.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/book")
public class BookResource {

    @RequestMapping("/{id}")
    public Book getBookinfo(@PathVariable String id){
        return  new Book("001","Quran ul furqan");


    }
}
