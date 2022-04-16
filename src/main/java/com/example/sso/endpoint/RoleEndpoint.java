package com.example.sso.endpoint;

import com.example.sso.advice.CommonException;
import com.example.sso.advice.ValidationErrorResponse;
import com.example.sso.advice.Violation;
import com.example.sso.dto.command.UserRegisterCommand;
import com.example.sso.dto.view.Response;
import com.example.sso.dto.view.ResponseBody;
import com.example.sso.service.role.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

@RequestMapping("/roles")
@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class RoleEndpoint {
    private final RoleService roleService;

    @PostMapping("")
    public ResponseEntity<ResponseBody> create(@RequestBody String name) {
        return new ResponseEntity<>(new ResponseBody(Response.SUCCESS, roleService.create(name)), HttpStatus.CREATED);
    }
}
