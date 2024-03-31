package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Value;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.javafaker.Faker;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;



public class FormTesting {
    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    void fillingOutForms(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        Faker faker = new Faker();
        RandomValue randomValue = new RandomValue();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String gender = faker.options().option("Male", "Female", "Other1");
        String phonNumber = faker.phoneNumber().subscriberNumber(10);
        String dateBirth = String.valueOf(faker.date().birthday());
        String subjectsInput = faker.options().option("A", "B", "C");
        String hobbiesWrapper = faker.options().option("Sports", "Reading", "Music");
        String currentAddress = faker.address().fullAddress();
        String stateCityWrapper = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
        String stateCityWrapper1 = randomValue.getCityDependingOnState(stateCityWrapper);

        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;

        registrationPage
                .openPage("https://demoqa.com/automation-practice-form")
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(email)
                .setGender(gender)
                .setUserNumber(phonNumber)
                .setDateBirth(dateBirth)
                .setSubjectsInput(subjectsInput)
                .setHobbiesWrapper(hobbiesWrapper)
                .setUploadPicture("bolt.jpg")
                .setCurrentAddress(currentAddress)
                .setStateCityWrapper(stateCityWrapper)
                .setStateCityWrapper1(stateCityWrapper1)
                .setSubmit();
    }
}
class RandomValue {
    Faker faker = new Faker();
    public String getCityDependingOnState(String stateCityWrapper1) {
        switch (stateCityWrapper1) {
            case "NCR":
                return faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh":
                return faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana":
                return faker.options().option("Karnal", "Panipat");
            case "Rajasthan":
                return faker.options().option("Jaipur", "Jaiselmer");
            default:
                throw new IllegalArgumentException("Invalid state: " + stateCityWrapper1);
        }
    }
}
    //open("https://demoqa.com/automation-practice-form");
    //$("#firstName").setValue("Maksim");
    //$("#lastName").setValue("bozhcko");
    //$("#userEmail").setValue("ffrf@FD.RU");
    //$("#gender-radio-1").doubleClick();
    //$("#userNumber").setValue("7999569841");
    /*$("#dateOfBirthInput").click();
    $(".react-datepicker__month-select").selectOption("July");
    $(".react-datepicker__year-select").selectOption("1996");
    (".react-datepicker__day--029:not(.react-datapicker__day--outside-month)").click();*/
    //$("#subjectsInput").setValue("Math").pressEnter();
    //$("#hobbiesWrapper").$(byText("Sports")).click();
    //$("#uploadPicture").uploadFromClasspath("bolt.jpg");
    //$("#currentAddress").setValue("blablabla");
    /* $("#state").click();
    $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
    $("#city").click();
    $("#stateCity-wrapper").$(byText("Lucknow")).click();*/
    //$("#submit").click();