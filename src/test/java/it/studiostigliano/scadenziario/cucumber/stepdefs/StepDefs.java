package it.studiostigliano.scadenziario.cucumber.stepdefs;

import it.studiostigliano.scadenziario.ScadenziariomongoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ScadenziariomongoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
