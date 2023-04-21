package org.launchcode.skillstracker.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class SkillsController {

@GetMapping
    public String skillsHeader(){

    return "<html>" +
            "<body>" +
            "<h1>Skills Tracker</h1>" +
            "<h2>We have a few skills we would like to learn. \n Here is the list!</h2>" +
            "<ol>" +
            "<li>Java</li>" +
            "<li>JavaScript</li>" +
            "<li>Python</li>" +
            "</ol>" +
            "</body>" +
            "</html>";
    }

    @PostMapping
    public String newSkillsForm(@RequestParam String name, String  favoriteLanguage, String secondFavoriteLanguage, String thirdFavoriteLanguage){
        return "<h1>" +
                name +
                "</h1>" +
                "<ol>" +
                "<li>" + favoriteLanguage + "</li>" +
                "<li>" + secondFavoriteLanguage + "</li>" +
                "<li>" + thirdFavoriteLanguage + "</li>" +
                "</ol>";
    }


    @GetMapping("form")
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form action = 'http://localhost:8080/' method = 'post'>" +
              "<h1>Name</h1>" +
              "<input type='text' name='name'" +
              "<label for=favoriteLanguage-select></label>" +
              "<h2>My favorite language</h2>" +

              "<select name=favoriteLanguage>" +
              "    <option value=>--Please choose an option--</option>" +
              "    <option value=Java>Java</option>" +
              "   <option value=Python>Python</option>" +
              "    <option value=JavaScript>JavaScript</option>" +
              "</select> " +
              "<label for=secondFavoriteLanguage-select></label>" +
              "<h2>My second favorite language</h2>" +

              "<select name=secondFavoriteLanguage>" +
              "    <option value=>--Please choose an option--</option>" +
              "    <option value=Java>Java</option>" +
              "    <option value=Python>Python</option>" +
              "    <option value=JavaScript>JavaScript</option>" +
              "</select> " +
              "<label for=thirdFavoriteLanguage-select></label>" +
              "<h2>My third favorite language</h2>" +

              "<select name=thirdFavoriteLanguage>" +
              "    <option value=>--Please choose an option--</option>" +
              "    <option value=Java>Java</option>" +
              "    <option value=Python>Python</option>" +
              "    <option value=JavaScript>JavaScript</option>" +
              "</select> " +
                "\n" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }



}
