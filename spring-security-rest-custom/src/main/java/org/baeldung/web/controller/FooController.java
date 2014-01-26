package org.baeldung.web.controller;

import org.baeldung.service.IFooService;
import org.baeldung.web.dto.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/foo")
public class FooController {

    @Autowired
    private IFooService service;

    public FooController() {
        super();
    }

    // API

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Foo findOne(@PathVariable("id") final Long id) {
        return service.findOne(id);
    }

}
