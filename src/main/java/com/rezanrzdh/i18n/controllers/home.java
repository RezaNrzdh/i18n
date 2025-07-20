package com.rezanrzdh.i18n.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("")
public class home {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("")
    public String helloWorld() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("greeting", null, locale);
    }
}
