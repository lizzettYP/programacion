package pe.edu.upeu.sysventas.dto;

 import javafx.application.Application;
 import lombok.AllArgsConstructor;
 import  lombok.Data;
 import lombok.NoArgsConstructor;
 import pe.edu.upeu.sysventas.HelloApplication;


@AllArgsConstructor
    @NoArgsConstructor
    @Data

    public class ComboBoxOption {
        String key;
        String valvue;
        @Override
        public String toString() {
            return valvue;
        }

    public static class App {
        public static void main(String[] args) {
            Application.launch(HelloApplication.class, args);
        }
    }
}

