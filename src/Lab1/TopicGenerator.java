package Lab1;
import java.lang.String;

public class TopicGenerator implements UserIntrface {
    @Override
    public int AskUser() {
        return 0;
    }

    @Override
    public int[] Frame(int i) {
        return new int[0];
    }

    @Override
    public void Developers() {

    }

    @Override
    public String GenerateSection(int i, int[] n) {
        return null;
    }

    @Override
    public void Entroduction() {

    }

    @Override
    public String GenerateFoot(){
        return  null;
    }

    @Override
    public String GenerateTopic(){
        String str1 =("<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<title> Имя страницы </title>\n\t\t<meta charset=\"UTF-8\">\n\t</head>");
        String str2 = ("\n\t<body>\n\t\t<header style=\"background-color:white\">\n\t\t\t<h1> " +
                "Заголовок текста </h1>\n\t\t\t<p><pre> Текст</pre></p>\n\t\t</header>");
        System.out.println(str1);
        System.out.println(str2);

        return (str1+ "\n"+ str2);
    }


}
