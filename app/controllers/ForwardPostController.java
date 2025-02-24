package controllers;

import org.apache.commons.validator.routines.EmailValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Handles all the post requests and sending of emails
 */

public class ForwardPostController extends Controller {
    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    //Method to handle the post requests from the html forms
    public Result processEmailRequest(String emailAddress ){
        logger.debug("Processing Email Request: {}" , emailAddress);

        //Validate email from the database to submit forms
        if (!EmailValidator.getInstance().isValid(emailAddress)) {
            logger.warn("Invalid Email Request: {}", emailAddress);
            return badRequest();
        }


        return  ok();
    }

}
