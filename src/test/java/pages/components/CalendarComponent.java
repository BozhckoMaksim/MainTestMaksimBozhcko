package pages.components;

import pages.RegistrationPage;

import java.util.concurrent.DelayQueue;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String day, String month, String year) {
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("2008");
        $(".react-datepicker__day--029:not(.react-datapicker__day--outside-month)").click();


    }
}
