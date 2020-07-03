package javamongo.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import javamongo.services.FindData;
import lombok.RequiredArgsConstructor;

@Controller("/api")
@RequiredArgsConstructor
public class ApiController {

    private final FindData findData;

    @Get("/")
    public String rental() {
        return findData.invoke();
    }


    /*
    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
    */
}