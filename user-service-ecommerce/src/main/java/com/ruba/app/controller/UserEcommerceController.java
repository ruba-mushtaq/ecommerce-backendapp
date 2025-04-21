package com.ruba.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = {"/api/users"})
@Slf4j
@RequiredArgsConstructor
public class UserEcommerceController {
	@GetMapping
	public ResponseEntity<String> getAccess() {
		log.info("*** Accessed Contoller of User service Ecommerce *");
		return ResponseEntity.ok("success");
	}
}
