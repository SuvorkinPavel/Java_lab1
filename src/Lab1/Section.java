package Lab1;


public class Section implements UserIntrface {

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
    public String GenerateFoot(){
        return  null;
    }

    @Override
   public String GenerateSection(int i, int[] n){
        String ramka_start =("\n\t\t<span style=\"border:2px solid #000;\">");
        String str =("\n\t\t\t<h2> Заголовок раздела </h2>\n\t\t\t<p><pre> Текст </pre></p>");
        String ramka_end = ("\n\t\t</span>");
        String sum;
        StringBuilder total= new StringBuilder();
        int k = 1;
        for(int j=0; j<i; j++ ) {
            if (n[j] != k) {
                sum = ("\n\t<div style= \"background-color:white>" + str + "\n\t\t</div>\n");
            } else {
                sum = ("\n\t<div style= \"background-color:white>" + ramka_start + str + ramka_end + "\n\t\t</div>\n");
            }
            total.append(sum);
            }
        System.out.println(total);
        return total.toString();
   }


}
