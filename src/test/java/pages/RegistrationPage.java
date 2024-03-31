package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {



    public static SelenideElement

    firstNameInput = $("#firstName"),
    lastNameInput = $("#lastName"),
    userEmailInput = $("#userEmail"),
    userNumberInput = $("#userNumber"),
    calendarInput = $("#dateOfBirthInput"),
    subjectInput = $("#subjectsInput"),
    genderWrapper = $("#genterWrapper"),
    hobbiesWrapper = $("#hobbiesWrapper"),
    uploadPicture = $("#uploadPicture"),
    currentAddress = $("#currentAddress"),
    stateCityWrapper = $("#stateCity-wrapper"),
    state = $("#state"),
    city = $("#city"),
    submit = $("#submit");


CalendarComponent calendarComponent = new CalendarComponent();
    public RegistrationPage openPage(String  value) {
        open(value);

        return this;

    }
    public RegistrationPage setFirstName(String  value) {
        firstNameInput.setValue(value);

        return this;
    }
    public RegistrationPage setLastName(String  value) {
        lastNameInput.setValue(value);

        return this;
    }
    public RegistrationPage setUserEmail(String  value) {
        userEmailInput.setValue(value);

        return this;
    }
    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }
    public RegistrationPage setUserNumber(String  value) {
        userNumberInput.setValue(value);

        return this;
    }
    public RegistrationPage setDateBirth(String  day) {
        calendarInput.click();
        calendarComponent.setDate(day, day, day);
        return this;
    }
    public RegistrationPage setSubjectsInput(String  value) {
        subjectInput.setValue(value).pressEnter();

        return this;
    }
    public RegistrationPage setHobbiesWrapper(String  value) {
        hobbiesWrapper.$(byText(value)).click();

        return this;
    }
    public RegistrationPage setUploadPicture(String  value) {
        uploadPicture.uploadFromClasspath(value);

        return this;
    }
    public RegistrationPage setCurrentAddress(String  value) {
        currentAddress.setValue(value);

        return this;
    }
    public RegistrationPage setStateCityWrapper(String  value) {
        state.click();
        stateCityWrapper.$(byText(value)).click();


        return this;
    }
    public RegistrationPage setStateCityWrapper1(String  value) {
        city.click();
        stateCityWrapper.$(byText(value)).click();

        return this;
    }
    public RegistrationPage setSubmit() {
        submit.click();

        return this;
    }

}
