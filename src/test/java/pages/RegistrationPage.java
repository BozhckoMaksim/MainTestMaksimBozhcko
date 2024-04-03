package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

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
        step("Открываем страницу", () -> {
            open(value);
            return this;
        });
        return this;
    }

    public RegistrationPage setFirstName(String  value) {
        step("Вводится рандомное имя", () -> {
            firstNameInput.setValue(value);
            return this;
        });
        return this;
    }
    public RegistrationPage setLastName(String  value) {
        step("Вводится рандомная фамилия", () -> {
        lastNameInput.setValue(value);
        return this;
        });
        return this;
    }
    public RegistrationPage setUserEmail(String  value) {
        step("Вводится рандомная почта", () -> {
            userEmailInput.setValue(value);
            return this;
        });
        return this;
    }
    public RegistrationPage setGender(String value) {
        step("Выбирается рандомный пол", () -> {
            genderWrapper.$(byText(value)).click();
            return this;
        });
        return this;
    }
    public RegistrationPage setUserNumber(String  value) {
        step("Вводится рандомный номер телефона", () -> {
            userNumberInput.setValue(value);
            return this;
        });
        return this;
    }
    public RegistrationPage setDateBirth(String  day) {
        step("Вводится рандомная дата рождения", () -> {
            calendarInput.click();
            calendarComponent.setDate(day, day, day);
            return this;
        });
        return this;
    }
    public RegistrationPage setSubjectsInput(String  value) {
        step("Вводится рандомный сабж, хз че это", () -> {
            subjectInput.setValue(value).pressEnter();
            return this;
        });
        return this;
    }
    public RegistrationPage setHobbiesWrapper(String  value) {
        step("Вводится рандомное хобби", () -> {
            hobbiesWrapper.$(byText(value)).click();
            return this;
        });
        return this;
    }
    public RegistrationPage setUploadPicture(String  value) {
        step("Загрузка картинки", () -> {
            uploadPicture.uploadFromClasspath(value);
            return this;
        });
        return this;
    }

    public RegistrationPage setCurrentAddress(String  value) {
        step("Вводится рандомный адрес", () -> {
            currentAddress.setValue(value);
            return this;
        });
        return this;
    }
    public RegistrationPage setStateCityWrapper(String  value) {
        step("Выбирается рандомная страна", () -> {
            state.click();
            stateCityWrapper.$(byText(value)).click();
            return this;
        });
        return this;
    }
    public RegistrationPage setStateCityWrapper1(String  value) {
        step("Подбор города по стране выбранной ранее", () -> {
            city.click();
            stateCityWrapper.$(byText(value)).click();
            return this;
        });
        return this;
    }
    public RegistrationPage setSubmit() {
        step("Нажимает сабмит - погна", () -> {
            submit.click();
            return this;
        });
        return this;
    }
}
