public class print {


    public static void main(String[] args) {
        print p = new print();
        p.printer();
        print myPrint = new print();
        myPrint.printer();


    }

    public void printer() {

        for (int a = 1; a <= 3; a++) {
            for (int b = 0; b <= a; b++) {
                for (int c = 0; c <= b; c++) {
                    int aaaa = a;
                    int bbbb = b;
                    int cccc = c;

                    int x = a;
                    int y = b;
                    int z = c;

                    int r = b;
                    int t = c;
                    int tt = c;


                    int aa = a;
                    int bb = b;
                    int cc = c;



                    int T = aa + bb + cc;


                    System.out.println("The board is:  " + aaaa + " " + bbbb + " " + cccc);
                    System.out.println("possible boards are:");
                    if (aaaa + bbbb + cccc <= 2) {
                        System.out.println("best");
                    }


                    for (int l = 0; l <= z; l++) {
                        if (aaaa + bbbb + cccc < T) {
                            System.out.println(aaaa + " " + bbbb + " " + cccc);
                            if (aaaa + bbbb + cccc <= 1) {
                                System.out.println("yessir");
                            }
                        }
                        cccc--;

                    }


                    for (int j = 0; j <= y; j++) {

                        if (tt > bbbb) {
                            tt--;

                        }
                        if (aaaa + bbbb + tt < T) {

                            System.out.println(aaaa + " " + bbbb + " " + tt);
                            if (aaaa + bbbb + tt <= 1) {
                                System.out.println("yessir");
                            }
                        }
                        bbbb--;


                    }
                    for (int i = 1; i <= x; i++) {

                        if (r > aaaa) {
                            r--;
                        }
                        if (t > r) {
                            t--;
                        }


                        if (aaaa + r + t < T) {
                            System.out.println(aaaa + " " + r + " " + t);
                            if (aaaa + r + t <= 1) {
                                System.out.println("yessir");
                            }
                        }
                        aaaa--;
                    }

                }


            }
        }
    }
}


//If there is a board that reduces to 100 its a losing board
// If there is a board that doesn't reduce to 100 its a winning board
// if there is a board that reduces to 100 it is a losing board that you have to look for
//when looking at other boards because its a losing move.
