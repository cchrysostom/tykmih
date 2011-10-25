package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        List<Question> questionList = Question.find("order by title").from(0).fetch(10);
        render(questionList);
    }

}