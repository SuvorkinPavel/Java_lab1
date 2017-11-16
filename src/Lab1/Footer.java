package Lab1;


public class Footer implements UserIntrface{
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
    public void Entroduction() {

    }

    @Override
    public String GenerateTopic() {
        return null;
    }

    @Override
    public String GenerateSection(int i, int[] n) {
        return null;
    }

    public String GenerateFoot(){
       String str = ("\n\t\t<footer style=\"background-color:white\">\n\t\t\t<h2> " +
                "Заголовок раздела </h2>\n\t\t\t<p><pre> Текст</pre></p>" +
               "\n\t\t\t<adress>Контактные данные создателя</adress>\n\t\t</footer>\n\t</body>\n\t</html>");

        System.out.println(str);

        return (str);
    }
}
