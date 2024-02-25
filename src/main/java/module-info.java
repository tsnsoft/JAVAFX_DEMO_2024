module kz.tsnsoft.javafx_demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens kz.tsnsoft.javafx_demo to javafx.fxml;
    exports kz.tsnsoft.javafx_demo;
}