import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class noname {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder();//Создаем строку которую можно изменить
        Pattern pattern = Pattern.compile("^(\\d{3})(\\d{4})$");//задаем что ищем(("^(\\d{3})(\\d{4})$")

        for (int aCount = 1000000; aCount <= 9999999; aCount++) {
            Matcher matcher = pattern.matcher(Integer.toString(aCount));//где ищем число acount
            if (matcher.find()) { //find ищет вхождение pattern.matcher если есть то тру, если нет то переходит дальше
                strBuilder.append("+7(926)").append(matcher.group(1)).append("-").append(matcher.group(2)).append(";");
                //если тру, то сначала добавляется +7(926),бебе
            }
        }

        pattern = Pattern.compile("(\\d[0]{2})-([0]{4})");//3333333333333
        Matcher matcher2 = pattern.matcher(strBuilder);
        while (matcher2.find()) {
            System.out.println("+7 (926) " + matcher2.group(1) + "-" + matcher2.group(2) + "; ");}
        }
    }
//ddaa