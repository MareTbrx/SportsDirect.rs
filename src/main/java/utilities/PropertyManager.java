package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyManager {

    private static String driverPath;
    private static String url;
    private static String email;
    private static String password;
    private static String bad_login_password;

    private static String reg_firstname;
    private static String reg_lastname;
    private static String regemail;
    private static String confirmpassword;
    private static String reg_password;
    private static String bad_login_email_format;
    private static String empty_pass_field;
    private static String empty_email_field;
    private static String incorrect_login_email;


    public static PropertyManager getInstance() {

        Properties prop = new Properties();
        PropertyManager instance = new PropertyManager();
        try {
            FileInputStream fi = new
                    FileInputStream("src/main/resources/configuration.properties");
            prop.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driverPath = prop.getProperty("driverPath");
        url = prop.getProperty("url");
        email = prop.getProperty("email");
        password = prop.getProperty("password");
        bad_login_password = prop.getProperty("bad_login_password");
        confirmpassword = prop.getProperty("confirmpassword");
        reg_firstname = prop.getProperty("reg_firstname");
        reg_lastname = prop.getProperty("reg_lastname");
        regemail = prop.getProperty("regemail");
        reg_password = prop.getProperty("reg_password");
        bad_login_email_format = prop.getProperty("bad_login_email_format");
        empty_pass_field = prop.getProperty("empty_pass_field");
        empty_email_field = prop.getProperty("empty_email_field");
        incorrect_login_email = prop.getProperty("incorrect_login_email");

        return instance;

    }
        public static void changeProperty (String key, String value){
            Properties editProp = new Properties();
            try {
                FileInputStream editFi = new
                        FileInputStream("src/main/resources/configuration.properties");
                editProp.load(editFi);
                editProp.setProperty(key, value);
                editProp.store(new FileOutputStream("src/main/resources/configuration.properties"), null);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }




    public String getDriverPath(){
        return driverPath;
    }
    public String getURL(){
        return url;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getBadLoginPassword() {return bad_login_password;}

    public String getBadLoginEmailFormat() {return bad_login_email_format;}
    public String getEmpty_pass_field(){return empty_pass_field;}
    public String getEmpty_email_field(){return empty_email_field;}
    public String getIncorrect_login_email(){return incorrect_login_email;}

    public String getBad_login_email_format(){return bad_login_email_format;}

    public String getConfirmpassword() {return confirmpassword;}
    public String getReg_password () {return reg_password;}
    public String getReg_firstname () {return reg_firstname;}
    public String getReg_lastname () {return reg_lastname;}
    public String getRegemail () {return regemail;}



}
