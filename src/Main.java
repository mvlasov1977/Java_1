public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for(int i = 1; i<6; i++){
            System.out.println(i);
        }
        for(int i = 5; i>0; i--){
            System.out.println(i);
        }
        int x = 1;
        while (x<5){
            System.out.println("Hello world!");
            x++;
        }
        int s = 0;
        for(int i = 1; i<=10; i++){
            s = s + i;
            //System.out.println("i="+i+" s="+s);
        }
        System.out.println(s);
        s = 0;
        for(int i = 1; i<=10; i++){
            double d = i%2;
            if (d==0){
                s = s + i;
            }
        }
        System.out.println(s);
        s = 0;
        for(int i = 0; i<=10; i = i + 2){
            s = s + i;
        }
        System.out.println(s);

        int i = 8;
        do {
            System.out.println(i);
            i--;
        } while (i>2);

        String [] names = new String[]{"Olena","Victor","Zachar","Petro"};

        for(i = 0; i< names.length; i++){
            System.out.println("i="+i+" "+names[i]);
        }
    }
}