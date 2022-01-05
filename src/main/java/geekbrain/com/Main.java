package geekbrain.com;

public class Main {
    public static void main(String args[]) {

        Person[] persArray = new Person[5];
        {
            persArray[0] = new Person("Ivanov","engen", "jaskdjkas@mail", "890290192039",100000,20);

            persArray[1] = new Person("Ivanov","sysadm", "jasksads@mail", "8902asd039",101110,25);

            persArray[2] = new Person("Zuzu", "medic", "aksjdfkadsj@.asdj", "54545454", 150000, 45);

            persArray[3] = new Person("Izi", "heal", "healskfd@sdkl", "54655845", 54565, 41);

            persArray[4] = new Person("Brizi", "DD", "DDDggds@lal", "55824545", 855656, 36);

            for (int i = 0; i < persArray.length; i++) {
//                System.out.println(persArray[i]); как вывести на экран все данные строки а не ссылку?
                if(persArray[i].age > 40){
                   System.out.println(persArray[i].age);
                }

            }
         }
    }
}