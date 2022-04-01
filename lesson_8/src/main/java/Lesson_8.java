import java.util.ArrayList;

class Phonebook{
    public ArrayList<String> family = new ArrayList<String>();
    public ArrayList<Integer> number = new ArrayList<Integer>();

    public void get(String famil){
        System.out.print("Все мобильные номера абонента " + famil + ": ");
        for (int i = 0; i< family.size(); i++){
            if (famil==family.get(i))
                System.out.print(number.get(i) + "; ");
        }
        System.out.println();
    }
    public boolean add(String fam, int num){
        family.add(fam);
        number.add(num);
        return false;
    }
}
public class Lesson_8 {
    public static void main (String[] args) {
        ArrayList<String> uniq= new ArrayList<String>(18);
        uniq.add("Чердак");
        uniq.add("Терраса");
        uniq.add("Солома");
        uniq.add("Чердак");
        uniq.add("Перкарня");
        uniq.add("Машина");
        uniq.add("Машина");
        uniq.add("Ларек");
        uniq.add("Контейнер");
        uniq.add("Паркинг");
        uniq.add("Тонна");
        uniq.add("Баня");
        uniq.add("Машина");
        uniq.add("Чердак");
        uniq.add("Ларек");
        uniq.add("Солома");
        uniq.add("Паркинг");
        uniq.add("Паркинг");
        String ghost = null;
        int k=0;
        int score=0;
        System.out.println("Список уникальных слов:");
        for (int i=0; i< uniq.size();i++){
            ghost = uniq.get(i);
            for (int j=0; j< uniq.size();j++){
                if (ghost==uniq.get(j)){
                    score++;
                }
            }
            if (score==1){
                k++;
                System.out.println(k+ "-" + ghost);
            }
            score=0;
        }

        System.out.println();

        for (int i=0; i< uniq.size();i++){
            ghost = uniq.get(i);
            for (int j=0; j< uniq.size();j++){
                if (ghost==null){
                    System.out.print("");
                }else {
                    if (ghost==uniq.get(j)) {
                        score++;
                        uniq.set(j, null);
                    }
                }
            }
            if (ghost==null){
                System.out.print("");
            } else {
                if (score == 1) {
                    System.out.println(ghost + score);
                } else
                    System.out.println( ghost + " встречается " + score + " раза");
                score = 0;
            }
        }
        System.out.println();
        Phonebook phonebook = new Phonebook();
        phonebook.add("Кучин",802998899);
        phonebook.add("Кучин",802963777);
        phonebook.add("Кучин",802947333);
        phonebook.add("Кучин",802971111);
        phonebook.add("Коршун",802947232);
        phonebook.add("Коршун",802954554);
        phonebook.add("Кучин",802998868);
        phonebook.add("Шемето",802986696);
        phonebook.get("Кучин");
        phonebook.get("Шемето");
        phonebook.get("Коршун");
    }
}