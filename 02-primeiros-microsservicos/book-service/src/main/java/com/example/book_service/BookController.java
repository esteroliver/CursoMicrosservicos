package com.example.book_service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("book-service")
public class BookController {
    @Autowired
    private BookRepository repository;

    @Autowired
    private CambioProxy cambioproxy;

    @GetMapping("/{id}/{currency}")
    public Book getBookConversion(@PathVariable("id") Long id, @PathVariable("currency") String currency) {

        var book = repository.findById(id);
        if(book.isEmpty()) throw new RuntimeException("Não encontrado.");
        Book book_type = book.get();

        var cambio = cambioproxy.getCambio(book_type.getPrice(), "USD", currency);
        book_type.setPrice(cambio.getConvertedValue());

        return book_type;

        // HashMap <String, String> params = new HashMap<>();
        // params.put("amount", book_type.getPrice().toString());
        // params.put("from", "USD");
        // params.put("to", currency);

        // var response = new RestTemplate().getForEntity("http://localhost:8000/cambio-service/{amount}/{from}/{to}", Cambio.class, params);
        // Cambio cambio = response.getBody();
        // book_type.setPrice(cambio.getConvertedValue());

       
    }
    
}
